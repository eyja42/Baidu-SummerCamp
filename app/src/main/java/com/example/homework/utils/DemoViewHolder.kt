package com.example.homework.utils

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.homework.R

class DemoViewHolder : RecyclerView.ViewHolder {

    /** 封面图 */
    var ivCover: ImageView
        private set
    /** 标题 */
    var tvTitle: TextView
        private set
    /** 内容 */
    var tvContent: TextView?
        private set

    var newsCard: ConstraintLayout
        private set


    constructor(view: View) : super(view) {
        ivCover = view.findViewById(R.id.cover)
        tvTitle = view.findViewById(R.id.tv_title)
        tvContent = view.findViewById(R.id.tv_content)
        newsCard = view.findViewById(R.id.news_card)
    }
}