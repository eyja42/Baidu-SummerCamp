package com.example.homework.utils

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework.NewsContentActivity
import com.example.homework.R

class DemoAdapter : RecyclerView.Adapter<DemoViewHolder> {

    /** 保存数据的列表 */
    private val demoList: List<ItemBean>

    constructor(demoList: List<ItemBean>) {
        this.demoList = demoList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DemoViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.recycleview_item_withpic, parent, false)
        return DemoViewHolder(view)
    }


    override fun onBindViewHolder(holder: DemoViewHolder, position: Int) {
        val itemBean = demoList[position]

        itemBean.coverUrl?.let {
            holder.ivCover.setImageResource(it)
        }

        itemBean.title?.let {
            holder.tvTitle.text = it
        }

        itemBean.content?.let {
            holder.tvContent?.text  = it
        }

        holder.newsCard.setOnClickListener{
            Log.i("DemoAdapter","跳转到NewsContentActivity,目标新闻："+itemBean.detail)

            val intent = Intent(holder.newsCard.context, NewsContentActivity::class.java)
            intent.putExtra("news_id",itemBean.detail)
            holder.newsCard.context.startActivity(intent)
        }
    }


    override fun getItemCount(): Int {
        return demoList.size
    }
}