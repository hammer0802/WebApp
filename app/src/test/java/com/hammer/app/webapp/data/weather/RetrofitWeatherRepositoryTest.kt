package com.hammer.app.webapp.data.weather

import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class RetrofitWeatherRepositoryTest {

    private lateinit var target: RetrofitWeatherRepository

    @Before
    fun setUp() {
        target = RetrofitWeatherRepository()
    }

    @After
    fun tearDown() {
    }

    @Test
    fun getWeather() {
        runBlocking {
            val result = target.getWeather()

            assertEquals(result, WeatherEntity(name = "tokyo", weather = listOf(), main = WeatherEntity.Main(100f)))
        }
    }
}