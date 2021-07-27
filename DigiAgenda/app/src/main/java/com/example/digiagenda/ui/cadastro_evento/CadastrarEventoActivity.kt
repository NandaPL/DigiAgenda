package com.example.digiagenda.ui.cadastro_evento

import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.digiagenda.R

class CadastrarEventoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastrar_evento)

        supportActionBar?.setDisplayShowCustomEnabled(true)

        val colorDrawable = ColorDrawable(getColor(R.color.topBar_color))
        supportActionBar?.setBackgroundDrawable(colorDrawable)
    }
}