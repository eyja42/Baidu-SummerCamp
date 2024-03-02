package com.example.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.homework.databinding.ActivityNewsContentBinding

class NewsContentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_news_content)
        val binding = ActivityNewsContentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val newsTitle = binding.newsTitle
        val newsMainImage = binding.newsMainImage
        val newsContent = binding.newsContent

        val news_id = intent.getStringExtra("news_id")
        when(news_id) {
            "news1" -> {
                Log.i("NewsContentActivity","设置新闻：news1")
                Log.i("NewsContentActivity","title:"+getString(R.string.news1_title))
                newsTitle.text = getString(R.string.news1_title)
                newsContent.text = getString(R.string.news1_content)
                newsMainImage.setImageResource(R.drawable.news1_mainimage)
            }

            "news2" -> {
                newsTitle.text = getString(R.string.news2_title)
                newsContent.text = getString(R.string.news2_content)
                newsMainImage.setImageResource(R.drawable.news2_mainimage)
            }

            "news3" -> {
                newsTitle.text = getString(R.string.news3_title)
                newsContent.text = getString(R.string.news3_content)
                newsMainImage.setImageResource(R.drawable.news3_mainimage)
            }
        }

        supportActionBar!!.hide()
    }

    fun backToHomepage(view: View){
        this.finish()
    }
}