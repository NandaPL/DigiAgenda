package com.example.digiagenda.ui

import android.content.Context
import android.util.Patterns
import com.example.digiagenda.R
import com.google.android.material.textfield.TextInputLayout

const val erro_preenchimento_obrigatorio = "Campo de preenchimento obrigatório."
const val erro_senha_diferente = "Senhas diferentes. Informe a senha correta."
const val erro_email_invalido = "Insira um endereço de e-mail válido."

/**
 * Verifica se há erros no campo de confirmação de senha.
 * Se houver, atribui mensagens de erro e retorna true.
 * Se não, limpa as mensagens de erro e retorna false.
 * Os erros verificados são: se está vazio ou se o campo é diferente da senha.
 */
fun confSenhaHasErrors(tiConfSenha: TextInputLayout, tiSenha: TextInputLayout, context: Context): Boolean {
    var hasErrors = false
    val senha = tiSenha.editText?.text.toString()
    val confSenha = tiConfSenha.editText?.text.toString()

    when {
        confSenha.isEmpty() -> {
            tiConfSenha.error = erro_preenchimento_obrigatorio
            hasErrors = true
        }
        confSenha != senha -> {
            tiConfSenha.error = erro_senha_diferente
            hasErrors = true
        }
        else -> tiConfSenha.error = null
    }

    return hasErrors
}

/**
 * Verifica se há erros no textInputLayout de email.
 * Se houver, atribui mensagens de erro e retorna true.
 * Se não, limpa as mensagens de erro e retorna false.
 * Os erros verificados são: se o campo está fora do formato correto para um email ou está vazio.
 */
fun emailHasErrors(tiEmail: TextInputLayout, context: Context): Boolean {
    var hasErrors = false
    val email = tiEmail.editText?.text.toString()

    if(email.isEmpty()) {
        tiEmail.error = erro_preenchimento_obrigatorio
        hasErrors = true
    } else {
        val emailPattern = Patterns.EMAIL_ADDRESS.matcher(email)

        if (!emailPattern.matches()) {
            tiEmail.error = erro_email_invalido
            hasErrors = true
        }
        else tiEmail.error = null
    }

    return hasErrors
}

/**
 * Verifica se o textInputLayout está vazio.
 * Caso esteja, atribui uma mensagem de erro e retorna true.
 * Caso não, limpa as mensagens de erro e retorna false.
 */
fun inputHasEmptyError(textInput: TextInputLayout, context: Context): Boolean {
    var hasEmptyError = false

    if (textInput.editText?.text.toString().isEmpty()) {
        textInput.error = erro_preenchimento_obrigatorio
        hasEmptyError = true
    }
    else textInput.error = null

    return hasEmptyError
}