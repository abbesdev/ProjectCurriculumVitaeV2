package com.abbes.curriculumvitaev2

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.abbes.curriculumvitaev3.R
import kotlinx.coroutines.NonCancellable.isCancelled


class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)
        val secondsDelayed = 1
        Handler(Looper.getMainLooper()).postDelayed({
            if (!isCancelled) {
                startActivity(Intent(this.application, SignupScreen::class.java))
                finishAffinity()
            }
        }, 3000)


}}