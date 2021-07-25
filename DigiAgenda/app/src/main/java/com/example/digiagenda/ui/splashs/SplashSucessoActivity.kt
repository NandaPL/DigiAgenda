package com.example.digiagenda.ui.splashs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.*
import com.example.digiagenda.R
import com.example.digiagenda.ui.home.HomeActivity

class SplashSucessoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_sucesso)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }, 2000)
    }
}