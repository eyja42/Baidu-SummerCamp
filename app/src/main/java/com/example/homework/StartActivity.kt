package com.example.homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager

class StartActivity : AppCompatActivity() {

    var thread: Thread? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
        supportActionBar!!.hide()
        setContentView(R.layout.activity_start)

        //睡眠300ms后跳转到mainActivity
        thread = Thread(Runnable {
            try {
                Thread.sleep(1000)
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }
            startActivity(Intent(this, WeatherActivity::class.java))
            finish()
        })
        thread!!.start()

    }

    // 自定义的线程---控制倒计时

}