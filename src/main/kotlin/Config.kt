package org.example

import java.util.Properties
import java.io.File

object Config {
    fun apiKey(): String {
        System.getenv("WEATHER_API_KEY")?.let{if(it.isNotBlank()) return it} // ENV
        val file = File("config.properties")
        if (!file.exists()) error("config.properties file not found and WEATHER_API_KEY is not set")
        val props = Properties().apply { file.inputStream().use{ load(it) } }
        return props.getProperty("API_KEY")?.takeIf{it.isNotBlank()}
            ?: error("API_KEY is missing in config.properties")
    }
}