package com.example.gniar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent

import kotlinx.android.synthetic.main.activity_intro.*
// tanggal pengerjaan   : Senin, 31 Mei 2021
// nim                  : 10118901
// nama                 : Dedi Cahya
// kelas                : IF11k

class Intro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide()
        setContentView(R.layout.activity_intro)

        viewpager.adapter = ViewPagerAdapter(supportFragmentManager)

    }
}