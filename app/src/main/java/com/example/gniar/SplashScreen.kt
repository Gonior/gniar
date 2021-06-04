package com.example.gniar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log

import android.view.WindowManager
import com.example.gniar.room.Personal
import com.example.gniar.room.PersonalDB

class SplashScreen : AppCompatActivity() {
    private val db by lazy { PersonalDB(this) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        // This is used to hide the status bar and make
        // the splash screen as a full screen activity.
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        // we used the postDelayed(Runnable, time) method
        // to send a message with a delayed time.
        createData()
        Handler().postDelayed({

            val intent = Intent(this, Intro::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }

    private fun createData() {
    //Insert Case
        val thread = Thread {
            val me = db.personalDao().getDataMe()
            if (!me) {
                db.personalDao().addData(
                    Personal(
                        14,
                        "Dedi Cahya",
                        "Dedi Cahya adalah makhluk asal bandung yang lahir karena tidak sengaja ibunya ngeden. dan sekarang dia menjadi sampah masyarakat",
                        "Watching anime, Coding, Sad Boy",
                        "nothing",
                        "anime, source code",
                        "Tidak menjadi beban keluarga",
                        "081223829057",
                    )
                )
            }
        }
        thread.start()


    }
}