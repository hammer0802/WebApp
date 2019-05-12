package com.hammer.app.webapp.data.weather

import com.hammer.app.webapp.ApiClient
import kotlinx.coroutines.Deferred
import retrofit2.http.GET

interface WeatherService {
    @GET("weather?q=tokyo,jp&appid=ef1bc36da007d0d27e3053a54a6f9d2d")
    fun getWeather() : Deferred<WeatherEntity>
}

class RetrofitWeatherRepository : WeatherDataSource {

    override suspend fun getWeather(): WeatherEntity {
        val apiClient = ApiClient
        val service = apiClient.restClient().create(WeatherService::class.java)
        return service.getWeather().await()
    }
}
