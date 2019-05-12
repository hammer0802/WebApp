package com.hammer.app.webapp.ui.weather

import com.hammer.app.webapp.data.weather.WeatherDataSource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class WeatherPresenter(private val view: WeatherContract.View, private val dataSource: WeatherDataSource) :
    WeatherContract.Presenter {
    override fun getWeather() {
        GlobalScope.launch(Dispatchers.Main) {
            val result = dataSource.getWeather()
            view.showWeather(result)
        }
    }

}