const show = (text) => (document.getElementById("result").innerText = text);
async function loadWeather() {
  const city = document.getElementById("city").value;
  const key = "YOUR_API_KEY";
  try {
    const response = await fetch(
      `https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=${key}&units=metric`,
    );
    const data = await response.json();
    if (!response.ok) throw new Error(data.message);
    show(`Temperature: ${data.main.temp} C, Humidity: ${data.main.humidity}%`);
  } catch (err) {
    show("Error: " + err.message);
  }
}
