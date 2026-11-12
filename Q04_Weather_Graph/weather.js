
let myChart;

async function getWeather() {

    let city = document.getElementById("city").value;
    let key = "YOUR_API_KEY";

    if (city === "") {
        alert("Enter city name");
        return;
    }

    let url = `https://api.openweathermap.org/data/2.5/weather?q=${city}&units=metric&appid=${key}`;

    try {
        let response = await fetch(url);
        let data = await response.json();

        if (!response.ok) {
            alert("City not found");
            return;
        }

        let temp = data.main.temp;
        let humidity = data.main.humidity;
        let weather = data.weather[0].description;

        document.getElementById("result").innerHTML =
            "Temperature: " + temp + " °C<br>" +
            "Humidity: " + humidity + "%<br>" +
            "Weather: " + weather;

        if (myChart) myChart.destroy();

        myChart = new Chart(document.getElementById("chart"), {
            type: "bar",
            data: {
                labels: ["Temperature", "Humidity"],
                datasets: [{
                    label: "Weather Details",
                    data: [temp, humidity]
                }]
            }
        });

    }
    catch (error) {
        alert("Unable to get weather data");
    }
}
