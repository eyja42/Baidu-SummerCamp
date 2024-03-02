package com.example.homework

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.homework.databinding.ActivityWeatherBinding
import com.example.homework.utils.WeatherForecastAdapter
import com.example.homework.utils.WeatherInfoBean

class WeatherActivity : AppCompatActivity() {

    private var binding: ActivityWeatherBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWeatherBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        addRecycleView()

        //hide top bar
        supportActionBar!!.hide()
    }

    fun backToHomepage(view: View) {
        this.finish()
    }

    private fun addRecycleView(){
        var weatherFeed = binding?.weatherFeed
        var itemBean = ArrayList<WeatherInfoBean>()

        itemBean.add(WeatherInfoBean("现在",1))
        itemBean.add(WeatherInfoBean("11时",1))
        itemBean.add(WeatherInfoBean("12时",3))
        itemBean.add(WeatherInfoBean("13时",3))
        itemBean.add(WeatherInfoBean("14时",3))
        itemBean.add(WeatherInfoBean("15时",3))
        itemBean.add(WeatherInfoBean("16时",3))
        itemBean.add(WeatherInfoBean("17时",3))
        itemBean.add(WeatherInfoBean("18时",1))
        itemBean.add(WeatherInfoBean("19时",1))
        itemBean.add(WeatherInfoBean("20时",1))

        var adapter = WeatherForecastAdapter(itemBean)
        weatherFeed?.adapter = adapter
        var layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        weatherFeed?.layoutManager = layoutManager

    }
}