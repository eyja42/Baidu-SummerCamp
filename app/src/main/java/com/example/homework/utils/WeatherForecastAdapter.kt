package com.example.homework.utils


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework.R

class WeatherForecastAdapter : RecyclerView.Adapter<WeatherForecastViewHolder> {

    private var itemList : List<WeatherInfoBean>

    constructor(itemList: List<WeatherInfoBean>) {
        this.itemList = itemList
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeatherForecastViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item_weatherforecast, parent, false)
        return WeatherForecastViewHolder(view)
    }

    override fun onBindViewHolder(holder: WeatherForecastViewHolder, position: Int) {
        val itemBean = itemList[position]

        itemBean.dayTime?.let {
            holder.dayTime.text = it
        }
        when(itemBean.weatherIcon){
            //1~5对应晴天白天、晴天夜晚、阴天、小雨、大雨
            1 -> holder.weatherIcon.setImageResource(R.drawable.ic_clear_day)
            2 -> holder.weatherIcon.setImageResource(R.drawable.ic_clear_night)
            3 -> holder.weatherIcon.setImageResource(R.drawable.ic_cloudy)
            4 -> holder.weatherIcon.setImageResource(R.drawable.ic_light_rain)
            5 -> holder.weatherIcon.setImageResource(R.drawable.ic_heavy_rain)
        }


    }


    override fun getItemCount(): Int {
        return itemList.size
    }


}