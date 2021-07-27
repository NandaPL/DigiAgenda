package com.example.digiagenda.repository.room

import androidx.lifecycle.LiveData
import com.example.digiagenda.model.Evento
import com.example.digiagenda.repository.EventoDataSource

class EventoRepository(database: AgendaDatabase): EventoDataSource {
    private val eventoDao = database.eventoDao()

    override fun getEventoById(eventoId: Long): LiveData<Evento> {
        return eventoDao.getEventoById(eventoId)
    }

    override fun listEvento(): LiveData<List<Evento>> {
        return eventoDao.listEvento()
    }

    override fun save(obj: Evento): Long {
        return if (obj.eventoId == 0L){
            insert(obj)
        }else{
            update(obj)
            obj.eventoId
        }
    }

    override fun insert(obj: Evento): Long {
        return eventoDao.insert(obj)
    }

    override fun update(obj: Evento) {
        return eventoDao.update(obj)
    }

    override fun delete(obj: Evento) {
        return eventoDao.delete(obj)
    }
}