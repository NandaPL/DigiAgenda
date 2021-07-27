package com.example.digiagenda.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n\u001a\u0016\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n\u001a\u0016\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"erro_email_invalido", "", "erro_preenchimento_obrigatorio", "erro_senha_diferente", "confSenhaHasErrors", "", "tiConfSenha", "Lcom/google/android/material/textfield/TextInputLayout;", "tiSenha", "context", "Landroid/content/Context;", "emailHasErrors", "tiEmail", "inputHasEmptyError", "textInput", "app_debug"})
public final class ValidacaoKt {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String erro_preenchimento_obrigatorio = "Campo de preenchimento obrigat\u00f3rio.";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String erro_senha_diferente = "Senhas diferentes. Informe a senha correta.";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String erro_email_invalido = "Insira um endere\u00e7o de e-mail v\u00e1lido.";
    
    /**
     * Verifica se há erros no campo de confirmação de senha.
     * Se houver, atribui mensagens de erro e retorna true.
     * Se não, limpa as mensagens de erro e retorna false.
     * Os erros verificados são: se está vazio ou se o campo é diferente da senha.
     */
    public static final boolean confSenhaHasErrors(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputLayout tiConfSenha, @org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputLayout tiSenha, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * Verifica se há erros no textInputLayout de email.
     * Se houver, atribui mensagens de erro e retorna true.
     * Se não, limpa as mensagens de erro e retorna false.
     * Os erros verificados são: se o campo está fora do formato correto para um email ou está vazio.
     */
    public static final boolean emailHasErrors(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputLayout tiEmail, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * Verifica se o textInputLayout está vazio.
     * Caso esteja, atribui uma mensagem de erro e retorna true.
     * Caso não, limpa as mensagens de erro e retorna false.
     */
    public static final boolean inputHasEmptyError(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputLayout textInput, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
}