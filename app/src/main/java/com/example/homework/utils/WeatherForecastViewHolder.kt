package com.example.homework.utils

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.homework.R

class WeatherForecastViewHolder :RecyclerView.ViewHolder{
    var dayTime: TextView

    var weatherIcon : ImageView

    constructor(view: View) : super(view) {
        dayTime = view.findViewById(R.id.day_time)
        weatherIcon = view.findViewById(R.id.weather_icon)
    }
}