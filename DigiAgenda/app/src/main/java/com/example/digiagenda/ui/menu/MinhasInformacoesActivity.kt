package com.example.digiagenda.ui.menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.digiagenda.R

class MinhasInformacoesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_minhas_informacoes2)

        supportActionBar?.setDisplayShowCustomEnabled(true)
        title = "Minhas Informações"

    }
}