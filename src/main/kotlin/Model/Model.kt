package org.example.model


import com.google.gson.annotations.SerializedName

data class Forecast (
    val forecastday: List<ForecastDay>
)
data class Location (
    val name: String,
    val country: String,
    val localtime: String
)
data class ForecastResponse (
    val location: Location,
    val forecast: Forecast
)
data class Hour (
    val time: String,
    val temp_c: Double,
    val wind_kph: Double,
    val wind_dir: String
)

data class ForecastDay (
    val date: String,
    val day: Day,
    val hour: List<Hour>
)
data class Day (
    @SerializedName ("maxtemp_c") val maxTemp: Double,
    @SerializedName ("mintemp_c") val minTemp: Double,
    @SerializedName ("avghumidity") val humidity: Double,
    @SerializedName ("maxwind_kph") val windSpeed: Double,
    @SerializedName ("maxwind_dir") val windDir: String
)
