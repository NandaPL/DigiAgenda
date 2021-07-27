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

        val intent = Intent(this, HomeActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(intent)
            finish()
        }, 2000)
    }
}