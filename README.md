# WeatherAPI-Challenge

This is a simple Kotlin console application for fetching and displaying weather forecasts using the [Open-Meteo API](https://open-meteo.com/).

## Features
- Fetches weather data from Open-Meteo using Retrofit.
- Parses JSON responses via Gson converter.
- Displays results in a formatted table:
  - **Cities as rows**.
  - **Dates as columns**.
  - Parameters: temperature (°C), wind speed (m/s), and wind direction.

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
