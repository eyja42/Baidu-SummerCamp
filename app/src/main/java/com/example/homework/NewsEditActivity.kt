package com.example.homework

import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import com.example.homework.databinding.ActivityNewsEditBinding

class NewsEditActivity : AppCompatActivity() {

    private lateinit var binding : ActivityNewsEditBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_edit)

        binding = ActivityNewsEditBinding.inflate(layoutInflater)

        val actionBar: ActionBar? =  supportActionBar
        if (actionBar != null) {
            actionBar.title = "添加新闻条目";  // 设置ActionBar的标题
//            actionBar.setSubtitle("请详细阅读");  // 副标题
            actionBar.setDisplayHomeAsUpEnabled(true)  // 设置返回按钮
        }else{
            Log.i("NewsEditActivity","actionBar is null!")
        }

    }

    fun backToHomepage(view: View) {
        this.finish()
    }

    //从系统相册选择缩略图
    fun selectImageFromGallery(view: View){
        when(view.id){
            R.id.imageView_cover -> {
                Log.i("NewsEditActivity","TODO: implement select cover image")
                Toast.makeText(this,"TODO: implement select cover image",Toast.LENGTH_SHORT).show()
            }
            R.id.imageView_mainimage -> {
                Log.i("NewsEditActivity","TODO: implement select main image")
                Toast.makeText(this,"TODO: implement select main image",Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                this.finish()
                Log.i("NewsEditActivity","back to homepage")
                return true
            }
        }
        Log.i("NewsEditActivity","error:no match item id")
        return super.onOptionsItemSelected(item)
    }

    fun pushNews(view: View) {
        Toast.makeText(this, "发布成功", Toast.LENGTH_SHORT).show()
    }
}