package com.example.digiagenda.repository.room;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.example.digiagenda.repository.room.converters.LocalDateTimeConverter.class, com.example.digiagenda.repository.room.converters.LocalDateConverter.class, com.example.digiagenda.repository.room.converters.LocalTimeConverter.class})
@androidx.room.Database(entities = {com.example.digiagenda.model.Usuario.class, com.example.digiagenda.model.Evento.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/digiagenda/repository/room/AgendaDatabase;", "Landroidx/room/RoomDatabase;", "()V", "usuarioDao", "Lcom/example/digiagenda/repository/dao/UsuarioDao;", "Companion", "app_debug"})
public abstract class AgendaDatabase extends androidx.room.RoomDatabase {
    private static com.example.digiagenda.repository.room.AgendaDatabase instance;
    public static final com.example.digiagenda.repository.room.AgendaDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.digiagenda.repository.dao.UsuarioDao usuarioDao();
    
    public AgendaDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/digiagenda/repository/room/AgendaDatabase$Companion;", "", "()V", "instance", "Lcom/example/digiagenda/repository/room/AgendaDatabase;", "destroyInstance", "", "getDatabase", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.digiagenda.repository.room.AgendaDatabase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        public final void destroyInstance() {
        }
        
        private Companion() {
            super();
        }
    }
}