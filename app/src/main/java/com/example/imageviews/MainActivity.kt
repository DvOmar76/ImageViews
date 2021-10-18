package com.example.imageviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnImage1.setOnClickListener {
            imageView.setBackgroundResource(R.drawable.day)
        }
        btnImage2.setOnClickListener {
            imageView.setBackgroundResource(R.drawable.night)
        }
    }
}