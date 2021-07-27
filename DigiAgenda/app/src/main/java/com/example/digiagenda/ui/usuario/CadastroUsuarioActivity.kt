package com.example.digiagenda.ui.usuario

import android.content.Context
import android.content.Intent
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import com.example.digiagenda.R
import com.example.digiagenda.model.Usuario
import com.example.digiagenda.ui.*
import com.example.digiagenda.ui.splashs.SplashSucessoActivity
import kotlinx.android.synthetic.main.activity_cadastro_usuario.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class CadastroUsuarioActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var email: String
    private lateinit var senha: String
    private lateinit var nome: String

    private val mContext = this@CadastroUsuarioActivity

    private lateinit var cadastroUsuarioViewModel: CadastroUsuarioViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_usuario)

        val colorDrawable = ColorDrawable(getColor(R.color.topBar_color))

        supportActionBar?.let {
            it.title = getString(R.string.cadastar_usuario)
            it.setDisplayShowCustomEnabled(true)
            it.setBackgroundDrawable(colorDrawable)
        }

        cadastroUsuarioViewModel = ViewModelProvider(this).get(CadastroUsuarioViewModel::class.java)

        listeners()

    }

    override fun onBackPressed() {
        finish()
    }

    private fun saveUser(){
        if (inputsOk()){
            nome = cadastro_nome.editText?.text.toString()
            email = cadastro_email.editText?.text.toString()
            senha = cadastro_senha.editText?.text.toString()


            cadastroUsuarioViewModel.verificaUsuario(email).observe(mContext, { usuario ->
                if (usuario == null){
                    val user = Usuario(
                        nome = nome,
                        email = email,
                        senhaObfuscated = senha
                    )

                    val userPrefs =
                        getSharedPreferences(getString(R.string.PREF_USER_DATA), Context.MODE_PRIVATE)

                    val editor = userPrefs.edit()
                    editor.putBoolean(getString(R.string.PREF_USER_FIRST_USE), false)
                    editor.apply()

                    doAsync {
                        cadastroUsuarioViewModel.criarUsuario(user)

                        startActivity(Intent(mContext, SplashSucessoActivity::class.java))
                        finish()
                    }
                }
            })

        }
    }

    private fun listeners(){
        button_cadastrar.setOnClickListener(this)
    }

    private fun inputsOk(): Boolean{
        var isOk = true

        if (confSenhaHasErrors(confirmar_senha, cadastro_senha, mContext)){
            isOk = false
        }

        if (emailHasErrors(cadastro_email, mContext)){
            isOk = false
        }

        if (inputHasEmptyError(cadastro_nome, mContext)){
            isOk = false
        }

        if (inputHasEmptyError(cadastro_senha, mContext)){
            isOk = false
        }

        return isOk
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.button_cadastrar -> {
                saveUser()
            }
        }
    }
}