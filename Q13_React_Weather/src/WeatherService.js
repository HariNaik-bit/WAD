import React, {useState} from "react";
import {Line} from "react-chartjs-2";
import "chart.js/auto";

function Weather() {
    const [city, setCity] = useState("");
    const [temp, setTemp] = useState([]);
    const [dates, setDates] = useState([]);

    async function getWeather() {
        let url = `https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=YOUR_API_KEY&units=metric`;

        let res = await fetch(url);
        let data = await res.json();

        setTemp([...temp, data.main.temp]);
        setDates([...dates, city]);
    }

    return (
        <div>
            <h2>Weather App</h2>

            <input onChange={e => setCity(e.target.value)}
                placeholder="Enter City"/>

            <button onClick={getWeather}>Get Weather</button>

            <Line data={{
                labels: dates,
                datasets: [{
                    label: "Temperature",
                    data: temp
                }]
            }}/>
        </div>
    );
}

export default Weather;