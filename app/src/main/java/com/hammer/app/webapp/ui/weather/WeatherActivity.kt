package com.hammer.app.webapp.ui.weather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hammer.app.webapp.R
import com.hammer.app.webapp.data.weather.RetrofitWeatherRepository
import com.hammer.app.webapp.data.weather.WeatherEntity
import kotlinx.android.synthetic.main.activity_main.*

class WeatherActivity : AppCompatActivity(), WeatherContract.View {
    private val presenter by lazy { WeatherPresenter(this, RetrofitWeatherRepository()) }

    override fun showWeather(result: WeatherEntity) {
        country.text = result.name
        temp.text = result.main.temp.toString()
        weather.text = result.weather.firstOrNull()?.main
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showButton.setOnClickListener {
            presenter.getWeather()
        }
    }
}
