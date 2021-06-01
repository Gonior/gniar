package com.example.gniar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent

import kotlinx.android.synthetic.main.activity_intro.*

class Intro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide()
        setContentView(R.layout.activity_intro)

        viewpager.adapter = ViewPagerAdapter(supportFragmentManager)

    }
}