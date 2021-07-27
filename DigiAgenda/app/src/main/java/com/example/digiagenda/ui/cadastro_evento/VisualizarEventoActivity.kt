package com.example.digiagenda.ui.cadastro_evento

import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.digiagenda.R

class VisualizarEventoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_evento)

        val colorDrawable = ColorDrawable(getColor(R.color.colorPrimary))
        supportActionBar?.setBackgroundDrawable(colorDrawable)

        supportActionBar?.setDisplayShowCustomEnabled(true)
        title = "Visualizar Evento"
    }
}