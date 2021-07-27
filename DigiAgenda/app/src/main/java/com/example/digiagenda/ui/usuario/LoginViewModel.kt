package com.example.digiagenda.ui.usuario

import android.app.Application
import android.provider.ContactsContract
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.digiagenda.model.Usuario
import com.example.digiagenda.repository.room.AgendaDatabase
import com.example.digiagenda.repository.room.UsuarioRepository

class LoginViewModel(application: Application): AndroidViewModel(application){
    private val usuarioRepository = UsuarioRepository(AgendaDatabase.getDatabase(application))

    fun login(email: String, senha: String): LiveData<Usuario>{
        return usuarioRepository.usuarioByEmailESenha(email, senha)
    }

    fun usarioByEmail(email: String): LiveData<Usuario>{
        return usuarioRepository.usuarioByEmail(email)
    }
}
