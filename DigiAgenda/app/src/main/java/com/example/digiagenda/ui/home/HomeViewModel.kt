package com.example.digiagenda.ui.home

import android.app.*
import androidx.lifecycle.*
import com.example.digiagenda.model.Usuario
import com.example.digiagenda.repository.room.AgendaDatabase
import com.example.digiagenda.repository.room.UsuarioRepository

class HomeViewModel(application: Application) : AndroidViewModel(application){
    private val usuarioRepository = UsuarioRepository(AgendaDatabase.getDatabase(application))


}