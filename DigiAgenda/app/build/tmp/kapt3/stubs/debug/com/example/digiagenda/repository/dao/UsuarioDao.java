package com.example.digiagenda.repository.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\'J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\'\u00a8\u0006\f"}, d2 = {"Lcom/example/digiagenda/repository/dao/UsuarioDao;", "Lcom/example/digiagenda/repository/dao/BaseDao;", "Lcom/example/digiagenda/model/Usuario;", "getUsuarioById", "Landroidx/lifecycle/LiveData;", "id", "", "usuarioByEmail", "email", "", "usuarioByEmailESenha", "senha", "app_debug"})
public abstract interface UsuarioDao extends com.example.digiagenda.repository.dao.BaseDao<com.example.digiagenda.model.Usuario> {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM usuario WHERE email = :email")
    public abstract androidx.lifecycle.LiveData<com.example.digiagenda.model.Usuario> usuarioByEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM usuario WHERE email = :email AND senhaObfuscated = :senha")
    public abstract androidx.lifecycle.LiveData<com.example.digiagenda.model.Usuario> usuarioByEmailESenha(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String senha);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM usuario WHERE id = :id")
    public abstract androidx.lifecycle.LiveData<com.example.digiagenda.model.Usuario> getUsuarioById(long id);
}