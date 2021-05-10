package com.hllbr.kotlincountwithbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun start(view : View){
        object : CountDownTimer(20000,1000){
            override fun onTick(millisUntilFinished: Long) {
               textView.text = "LEFT : ${millisUntilFinished/1000}"
            }

            override fun onFinish() {
            textView.text = "LEFT : 0"
                Toast.makeText(this@MainActivity,"Finished!",Toast.LENGTH_LONG).show()
            }

        }.start()
    }
}