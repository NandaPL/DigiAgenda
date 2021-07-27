package com.example.digiagenda.repository

import androidx.lifecycle.LiveData
import com.example.digiagenda.model.Evento

interface EventoDataSource: BaseDataSource<Evento> {
    fun getEventoById(eventoId: Long): LiveData<Evento>
    fun listEvento(): LiveData<List<Evento>>
}