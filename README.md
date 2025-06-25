# weather-information-system
This Spring Boot project simulates a modular weather information system with support for mock weather data, location info, and notification alerts. It demonstrates key Spring concepts such as **multi-service orchestration**, **dependency injection (constructor and setter)**, and **bean scopes (singleton & prototype)**.

---

## 🚀 Features

- 📍 Fetch weather data by city
- 🌍 View city-country mapping
- 🔔 Send custom alerts (simulated)
- 🔁 Demonstrates prototype and singleton scopes
- 🧩 Modular structure with clear separation of concerns

---

## 📦 Project Structure

com.example.weather
│
├── controller # REST API endpoints
├── model # Data models: Location, Weather
├── service # Business logic: Weather, Location, Notification
├── config # Bean configuration for prototype scope
└── WeatherApplication # Main Spring Boot application

---

## 📚 Technologies Used

- Java 17+
- Spring Boot 3.x
- Spring Web
- Dependency Injection (DI)
- Bean Scopes (Singleton, Prototype)
- RESTful API

---

## 🔧 Installation & Run

### 1. Clone the Repository

git clone https://github.com/your-username/weather-system.git
cd weather-system
2. Build the Project

./mvnw clean install
3. Run the Application

./mvnw spring-boot:run
🛠️ API Endpoints
✅ Get Weather for City
Request:

GET /api/weather/{city}
Example:

GET /api/weather/Delhi
Response:

{
  "city": "Delhi",
  "temperature": 26.32,
  "humidity": 51.75
}
✅ Send Alert
Request:

POST /api/alerts?city=Delhi
Content-Type: text/plain
Body: Heavy rainfall expected!
Response:

Notification sent for Delhi
⚙️ Dependency Injection Summary
Service	Scope	Injection Type
WeatherService	Singleton	Constructor Injection
LocationService	Singleton	Constructor Injection
NotificationService	Prototype	Setter Injection via ApplicationContext

✨ Sample Cities
City	Country
Delhi	India
Paris	France

📄 License
This project is open-source and free to use for educational or research purposes.

