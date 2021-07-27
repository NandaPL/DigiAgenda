package com.example.digiagenda.ui.usuario;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/digiagenda/ui/usuario/CadastroUsuarioViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "usuarioRepository", "Lcom/example/digiagenda/repository/room/UsuarioRepository;", "criarUsuario", "", "usuario", "Lcom/example/digiagenda/model/Usuario;", "verificaUsuario", "Landroidx/lifecycle/LiveData;", "email", "", "app_debug"})
public final class CadastroUsuarioViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.example.digiagenda.repository.room.UsuarioRepository usuarioRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.digiagenda.model.Usuario> verificaUsuario(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
        return null;
    }
    
    public final void criarUsuario(@org.jetbrains.annotations.NotNull()
    com.example.digiagenda.model.Usuario usuario) {
    }
    
    public CadastroUsuarioViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}