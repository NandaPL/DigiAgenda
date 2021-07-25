package com.example.digiagenda.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.digiagenda.repository.room.*
import java.time.LocalDate
import java.time.LocalTime

@Entity(tableName = TABLE_EVENTO)
data class Evento (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = COLUMN_EVENTO_ID) var eventoId: Long = 0L,
    @ColumnInfo(name = COLUMN_TITULO) var titulo: String = "",
    @ColumnInfo(name = COLUMN_EVENTO_DATA) var data: LocalDate = LocalDate.now(),
    @ColumnInfo(name = COLUMN_EVENTO_HORA) var hora: LocalTime = LocalTime.now()
)