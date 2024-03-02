package com.example.homework

import android.app.Activity
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView
import com.example.homework.databinding.ActivityVideoContentBinding

class VideoContentActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_content)

        //选择要播放的视频
        val videoView = findViewById<VideoView>(R.id.video_view)

        var videoId = intent.getStringExtra("video_id")
        var videoPath = "android.resource://" + packageName+"/"
        when(videoId){
            "video1"-> videoPath += R.raw.video1
            "video2"-> videoPath += R.raw.video2
            "video3"-> videoPath += R.raw.video3
        }

        videoView.setVideoURI(Uri.parse(videoPath))

        val mediaController = MediaController(this)
        videoView.setMediaController(mediaController)
        mediaController.setAnchorView(videoView)

        videoView.start() // 播放视频
    }

    fun backToHomepage(view: View){
        this.finish()
    }

    fun addFavourite(view: View) {
        Toast.makeText(this, "已收藏", Toast.LENGTH_SHORT).show()
    }

    fun shareVideo(view: View) {
        Toast.makeText(this, "分享成功", Toast.LENGTH_SHORT).show()
    }
}