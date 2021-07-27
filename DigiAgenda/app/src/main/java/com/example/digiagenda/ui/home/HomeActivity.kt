package com.example.digiagenda.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.digiagenda.R
import com.example.digiagenda.ui.cadastro_evento.CadastrarEventoActivity
import com.example.digiagenda.ui.usuario.CadastroUsuarioActivity
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        adiciona_evento.setOnClickListener {
            startActivity(Intent(this, CadastrarEventoActivity::class.java))
        }
    }
}