package org.example.api
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import org.example.model.ForecastResponse

interface WeatherApi {
    @GET("v1/forecast.json")
    fun getForecast (
            @Query("key") apiKey: String,
            @Query("q") city: String,
            @Query("days") days: Int = 2,
            @Query("aqi") aqi: String = "no",
            @Query("alerts") alerts: String = "no"
    ): Call<ForecastResponse>
}