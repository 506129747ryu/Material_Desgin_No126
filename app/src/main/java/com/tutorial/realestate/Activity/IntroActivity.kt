package com.tutorial.realestate.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.tutorial.realestate.R

class IntroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        val startBtn: AppCompatButton = findViewById(R.id.startBtn)
        startBtn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}