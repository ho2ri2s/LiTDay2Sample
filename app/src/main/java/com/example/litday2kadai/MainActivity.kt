package com.example.litday2kadai

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var count = 3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textCount.text = count.toString()

        button0.setOnClickListener {
            tearDown()
            root.setBackgroundColor(Color.LTGRAY)
        }
        button1.setOnClickListener {
            tearDown()
            button6.setBackgroundColor(Color.GREEN)
        }
        button2.setOnClickListener {
            tearDown()
            imageView.setImageResource(R.drawable.hazure)
        }
        button3.setOnClickListener {
            tearDown()
            imageView.setImageResource(R.drawable.unko)
        }
        button4.setOnClickListener {
            tearDown()
            textView.text = "そのぼたんじゃないよ"
        }
        button5.setOnClickListener {
            tearDown()
            textCount.setTextColor(Color.BLUE)
        }
        button6.setOnClickListener {
            tearDown()
            imageView.setImageResource(R.drawable.profile)
            textView.text = "正解！ほりすだよ"
        }
    }

    private fun tearDown() {
        count--
        textCount.text = count.toString()
        if (count <= 0) {
            textCount.text = "残念でした！もう押せないよ"
            button0.isClickable = false
            button1.isClickable = false
            button2.isClickable = false
            button3.isClickable = false
            button4.isClickable = false
            button5.isClickable = false
            button6.isClickable = false
        }
    }
}
