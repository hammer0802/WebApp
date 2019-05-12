package com.hammer.app.webapp.data.weather

data class WeatherEntity (
    val name :String,
    val weather: List<Weather>,
    val main: Main
) {
    data class Weather(
        val main :String
    )

    data class Main(
        val temp :Float
    )
}