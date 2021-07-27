package com.example.digiagenda.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.digiagenda.repository.room.*

@Entity(tableName = TABLE_USUARIO)
data class Usuario(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = COLUMN_USUARIO_ID) var id: Long = 0L,
    @ColumnInfo(name = COLUMN_EMAIL) var email: String = "",
    @ColumnInfo(name = COLUMN_SENHA_OBFUSCATED) var senhaObfuscated: String = "",
    @ColumnInfo(name = COLUMN_NOME) var nome: String = ""
)