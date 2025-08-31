# WeatherAPI-Challenge

This is a simple Kotlin console application for fetching and displaying weather forecasts using the WeatherAPI.com

## Features
- Fetches weather data from WeatherAPI using Retrofit.
- Parses JSON responses via Gson converter.
- Logging with OkHttp.
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
2. Copy 'config.properties.example' -> 'config.properties', enter the 'API_KEY=..'

3. Build the project
  ./gradlew build

4. Run the application
  ./gradlew run
## Or
Download release JAR file WeatherAPI-Challenge.
Run ot with:
java -jar WeatherAPI-Challenge-all.jar

