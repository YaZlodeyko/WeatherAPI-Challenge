
package org.example
import org.example.api.RetrofitClient
import kotlin.system.exitProcess

fun main() {
    val apiKey = Config.apiKey()
    val cities = listOf("Chisinau", "Madrid", "Kyiv", "Amsterdam")

    val forecasts = cities.associate { city ->
        val response = RetrofitClient.instance.getForecast(apiKey, city).execute()
        if (response.isSuccessful) {
            city to response.body()
        } else {
            city to null
        }
    }

    val tomorrowDate = forecasts.values.firstOrNull()
        ?.forecast?.forecastday?.getOrNull(1)?.date?: "N/A"
    println(String.format("%-12s | %-40s", "City", tomorrowDate))
    println ("-". repeat(55))


    forecasts.forEach { (city, forecast) ->
        val day = forecast?.forecast?.forecastday?.getOrNull(1)?.day
        val noonForecast = forecast?.forecast?.forecastday
            ?.getOrNull(1)?.hour?.find {it.time.endsWith("12:00")}
        val windDir = noonForecast?.wind_dir ?:"N/A"
        val info = if (day != null) {
            "Min : %.1f°C, Max: %.1f°C, Hum: %.0f%%, Wind %.1f kph Direction: %s".format(
                day.minTemp, day.maxTemp, day.humidity, day.windSpeed, windDir
            )
        } else {
            "N/A"
        }
        println(String.format("%-12s | %-40s", city, info))
    }
    exitProcess(0)

}