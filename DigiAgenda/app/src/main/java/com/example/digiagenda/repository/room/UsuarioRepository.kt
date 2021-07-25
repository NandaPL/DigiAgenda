package com.example.digiagenda.repository.room

import androidx.lifecycle.LiveData
import com.example.digiagenda.model.Usuario
import com.example.digiagenda.repository.UsuarioDataSource

class UsuarioRepository(database: AgendaDatabase): UsuarioDataSource {
    private val usuarioDao = database.usuarioDao()

    private lateinit var usuario: LiveData<Usuario>

    override fun usuarioByEmail(email: String): LiveData<Usuario> {
        return usuarioDao.usuarioByEmail(email)
    }

    override fun save(obj: Usuario): Long {
        return if (obj.id == 0L){
            insert(obj)
        }else{
            update(obj)
            obj.id
        }
    }

    override fun insert(obj: Usuario): Long {
        return usuarioDao.insert(obj)
    }

    override fun update(obj: Usuario) {
        return usuarioDao.update(obj)
    }

    override fun delete(obj: Usuario) {
        return usuarioDao.delete(obj)
    }

}