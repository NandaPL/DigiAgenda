package com.example.digiagenda.ui.usuario

import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.digiagenda.R

class CadastroUsuarioActivity : AppCompatActivity() {
    private lateinit var email: String
    private lateinit var senha: String
    private lateinit var confSenha: String
    private lateinit var nome: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_usuario)

        val colorDrawable = ColorDrawable(getColor(R.color.topBar_color))

        supportActionBar?.let {
            it.setDisplayShowCustomEnabled(true)
            it.setBackgroundDrawable(colorDrawable)
        }




    }

    override fun onBackPressed() {
        finish()
    }
}