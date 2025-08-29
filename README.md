# WeatherAPI-Challenge

This is a simple Kotlin console application for fetching and displaying weather forecasts using the WeatherAPI.com

## Features
- Fetches weather data from WeatherAPI using Retrofit.
- Parses JSON responses via Gson converter.
- Displays results in a formatted table:
  - **Cities as rows**.
  - **Dates as columns**.
  - Parameters: Min&Max temperature (°C), humidity (%), wind speed (kph), and wind direction.

## Technologies
- **Kotlin (JVM)**  
- **Gradle** as build system  
- **Retrofit 2.9.0** for HTTP requests  
- **Gson converter** for JSON parsing  

## Project Structure

## How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/YaZlodeyko/WeatherAPI-Challenge.git
   cd WeatherAPI-Challenge
2. Build the project
  ./gradlew build
3/ Run the application
  ./gradlew run


## EXAMPLE OUTPUT


City         | 2025-08-30                              
-------------------------------------------------------
Chisinau     | Min : 15,0°C, Max: 34,9°C, Hum: 38%, Wind 23,0kph Direction: SE
Madrid       | Min : 18,5°C, Max: 30,1°C, Hum: 41%, Wind 18,4kph Direction: SW
Kyiv         | Min : 18,3°C, Max: 32,5°C, Hum: 27%, Wind 19,4kph Direction: SSE
Amsterdam    | Min : 14,2°C, Max: 21,9°C, Hum: 70%, Wind 23,0kph Direction: WSW

