package com.example.homework.utils

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework.R
import com.example.homework.VideoContentActivity

class VideoAdapter :RecyclerView.Adapter<VideoViewHolder>{

    private val demoList : List<ItemBean>

    constructor(demoList: List<ItemBean>) {
        this.demoList = demoList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.recycleview_item_video, parent, false)
        return VideoViewHolder(view)
    }

    override fun onBindViewHolder(holder: VideoViewHolder, position: Int) {
        val itemBean = demoList[position]
        itemBean.coverUrl?.let { holder.ivCover.setImageResource(it) }

        itemBean.title?.let { holder.tvTitle.text = it }

        itemBean.content?.let { holder.tvContent?.text  = it }

        holder.tipView.setOnClickListener{

            Log.i("VideoAdapter","跳转到VideoContentActivity,目标视频："+itemBean.detail)

            val intent = Intent(holder.tipView.context, VideoContentActivity::class.java)
            intent.putExtra("video_id",itemBean.detail)
            holder.tipView.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return demoList.size
    }
}