package com.example.digiagenda.repository

import androidx.lifecycle.LiveData
import com.example.digiagenda.model.Usuario

interface UsuarioDataSource: BaseDataSource<Usuario> {
    fun usuarioByEmail(email: String): LiveData<Usuario>
}