package com.example.homework.utils

import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.homework.R

class VideoViewHolder: RecyclerView.ViewHolder{
    var ivCover : ImageView
        private set

    var tvTitle:TextView
        private set

    var tvContent : TextView?
        private set

    var tipView : FrameLayout

    constructor(view:View) : super(view){
        ivCover = view.findViewById(R.id.cover)
        tvTitle = view.findViewById(R.id.tv_title)
        tvContent = view.findViewById(R.id.tv_content)
        tipView = view.findViewById(R.id.video_card)
    }
}