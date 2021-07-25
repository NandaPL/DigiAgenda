package com.example.digiagenda.repository.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.digiagenda.model.Usuario
import com.example.digiagenda.repository.room.*

@Dao
interface UsuarioDao: BaseDao<Usuario> {
    @Query("""SELECT * FROM $TABLE_USUARIO WHERE $COLUMN_EMAIL = :email""")
    fun usuarioByEmail(email: String): LiveData<Usuario>
}