package com.example.digiagenda.ui.usuario

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import com.example.digiagenda.R
import com.example.digiagenda.ui.emailHasErrors
import com.example.digiagenda.ui.home.HomeActivity
import com.example.digiagenda.ui.inputHasEmptyError
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    private lateinit var loginViewModel: LoginViewModel

    private lateinit var email: String
    private lateinit var senha: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val verificaEmail = intent.getStringExtra("EXTRA_EMAIL")
        if (verificaEmail != null){
            login_email.editText?.setText(verificaEmail.toString())
        }

        loginViewModel = ViewModelProvider(this).get(LoginViewModel::class.java)

        button_cadastro_usuario.setOnClickListener {
            startActivity(Intent(this, CadastroUsuarioActivity::class.java))
        }

        button_login.setOnClickListener {
            val emailOk = !emailHasErrors(login_email, this)
            val senhaOk = !inputHasEmptyError(login_senha, this)

            if (emailOk && senhaOk){
                email = login_email.editText?.text.toString()
                senha = login_senha.editText?.text.toString()

                validacaoLogin()
            }
        }
    }

    private fun validacaoLogin() {
        loginViewModel.usarioByEmail(email).observe(this, {
            if (it != null){
                login_email.error = null

                if (it.senhaObfuscated == senha){
                    login_senha.error = null

                    realizaLogin(email)
                } else {
                    login_senha.error = "Senha incorreta."
                }
            } else {
                login_email.error = "E-mail incorreto"
            }
        })
    }

    private fun realizaLogin(email: String){
        val userPrefs = getSharedPreferences(getString(R.string.PREF_USER_DATA), Context.MODE_PRIVATE)
        val editor = userPrefs.edit()

        editor.putBoolean(getString(R.string.PREF_USER_FIRST_USE), false)
        editor.putString(getString(R.string.PREF_USER_EMAIL), email)

        editor.apply()

        startActivity(Intent(this, HomeActivity::class.java)
            .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
            .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
        finish()
    }


}