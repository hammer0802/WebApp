package com.hammer.app.webapp.ui.weather

import com.hammer.app.webapp.data.weather.WeatherEntity

interface WeatherContract {
    interface View{
        fun showWeather(result: WeatherEntity)
    }

    interface Presenter{
        fun getWeather()
    }
}