package com.hammer.app.webapp.data.weather

interface WeatherDataSource {
    suspend fun getWeather(): WeatherEntity
}