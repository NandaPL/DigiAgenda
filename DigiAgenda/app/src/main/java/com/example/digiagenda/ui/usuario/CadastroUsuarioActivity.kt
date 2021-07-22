package com.example.digiagenda.ui.usuario

import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.digiagenda.R

class CadastroUsuarioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_usuario)

        supportActionBar?.setDisplayShowCustomEnabled(true)

        val colorDrawable = ColorDrawable(getColor(R.color.topBar_color))
        supportActionBar?.setBackgroundDrawable(colorDrawable)
    }
}