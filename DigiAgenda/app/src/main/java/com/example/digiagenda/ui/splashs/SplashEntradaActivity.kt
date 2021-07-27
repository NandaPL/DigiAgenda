package com.example.digiagenda.ui.splashs

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import com.example.digiagenda.R
import com.example.digiagenda.ui.home.HomeActivity
import com.example.digiagenda.ui.usuario.LoginActivity

class SplashEntradaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_entrada)

        val splashDuration = 2000L

        val userPrefs =
            getSharedPreferences(getString(R.string.PREF_USER_DATA), Context.MODE_PRIVATE)

        var nextActivity = Intent(this, HomeActivity::class.java)

        if (userPrefs.getBoolean(getString(R.string.PREF_USER_FIRST_USE), true)) {
            nextActivity = Intent(this, LoginActivity::class.java)
            Log.i("SplashActivity", "Primeiro uso!")
        }

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(nextActivity)
            finish()
        }, splashDuration)
    }
}