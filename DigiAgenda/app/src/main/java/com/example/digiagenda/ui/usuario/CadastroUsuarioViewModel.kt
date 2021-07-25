package com.example.digiagenda.ui.usuario

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.digiagenda.model.Usuario
import com.example.digiagenda.repository.room.*

class CadastroUsuarioViewModel(application: Application): AndroidViewModel(application){
    private val usuarioRepository = UsuarioRepository(AgendaDatabase.getDatabase(application))

    fun verificaUsuario(email: String): LiveData<Usuario>{
        return usuarioRepository.usuarioByEmail(email)
    }

    fun criarUsuario(usuario: Usuario){
        usuarioRepository.save(usuario)
    }
}