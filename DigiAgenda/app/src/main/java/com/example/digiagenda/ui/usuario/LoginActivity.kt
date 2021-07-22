package com.example.digiagenda.ui.usuario

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.digiagenda.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        listener()
    }

    private fun observe(){

    }

    private fun listener(){
        button_cadastro_usuario.setOnClickListener {
            startActivity(Intent(this, CadastroUsuarioActivity::class.java))
        }
    }

}