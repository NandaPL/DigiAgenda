package com.example.digiagenda.repository.dao

import androidx.lifecycle.LiveData
import androidx.room.Query
import com.example.digiagenda.model.Evento
import com.example.digiagenda.repository.room.*

interface EventoDao: BaseDao<Evento> {
    @Query("""SELECT * FROM $TABLE_EVENTO WHERE $COLUMN_EVENTO_ID = :eventoId""")
    fun getEventoById(eventoId: Long): LiveData<Evento>

    @Query("""SELECT * FROM $TABLE_EVENTO""")
    fun listEvento(): LiveData<List<Evento>>
}