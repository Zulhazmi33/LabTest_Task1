package com.example.mindsharpener

import android.R
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun difficulty(){
            val textView = findViewById<View>(R.id.view4) as TextView
            textView.setText("3")
        }

    }
}