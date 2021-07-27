package com.example.digiagenda.repository.room;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/digiagenda/repository/room/UsuarioRepository;", "Lcom/example/digiagenda/repository/UsuarioDataSource;", "database", "Lcom/example/digiagenda/repository/room/AgendaDatabase;", "(Lcom/example/digiagenda/repository/room/AgendaDatabase;)V", "usuario", "Landroidx/lifecycle/LiveData;", "Lcom/example/digiagenda/model/Usuario;", "usuarioDao", "Lcom/example/digiagenda/repository/dao/UsuarioDao;", "delete", "", "obj", "getUsuarioById", "id", "", "insert", "save", "update", "usuarioByEmail", "email", "", "usuarioByEmailESenha", "senha", "app_debug"})
public final class UsuarioRepository implements com.example.digiagenda.repository.UsuarioDataSource {
    private final com.example.digiagenda.repository.dao.UsuarioDao usuarioDao = null;
    private androidx.lifecycle.LiveData<com.example.digiagenda.model.Usuario> usuario;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.example.digiagenda.model.Usuario> usuarioByEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.example.digiagenda.model.Usuario> usuarioByEmailESenha(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String senha) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.example.digiagenda.model.Usuario> getUsuarioById(long id) {
        return null;
    }
    
    @java.lang.Override()
    public long save(@org.jetbrains.annotations.NotNull()
    com.example.digiagenda.model.Usuario obj) {
        return 0L;
    }
    
    @java.lang.Override()
    public long insert(@org.jetbrains.annotations.NotNull()
    com.example.digiagenda.model.Usuario obj) {
        return 0L;
    }
    
    @java.lang.Override()
    public void update(@org.jetbrains.annotations.NotNull()
    com.example.digiagenda.model.Usuario obj) {
    }
    
    @java.lang.Override()
    public void delete(@org.jetbrains.annotations.NotNull()
    com.example.digiagenda.model.Usuario obj) {
    }
    
    public UsuarioRepository(@org.jetbrains.annotations.NotNull()
    com.example.digiagenda.repository.room.AgendaDatabase database) {
        super();
    }
}