package com.example.digiagenda.repository.room

import android.content.Context
import androidx.room.*
import com.example.digiagenda.model.*
import com.example.digiagenda.repository.dao.*
import com.example.digiagenda.repository.room.converters.*

@Database(
    entities = [
        Usuario::class,
        Evento::class
    ], version = DATABASE_VERSION, exportSchema = false
)
@TypeConverters(
    LocalDateTimeConverter::class,
    LocalDateConverter::class,
    LocalTimeConverter::class
)
abstract class AgendaDatabase : RoomDatabase() {
    abstract fun usuarioDao(): UsuarioDao

    companion object {
        private var instance: AgendaDatabase? = null

        fun getDatabase(context: Context): AgendaDatabase {
            if (instance == null) {
                synchronized(this) {
                    instance =
                        Room.databaseBuilder(
                            context.applicationContext,
                            AgendaDatabase::class.java,
                            DATABASE_NAME
                        )
                            /*
                            .addCallback(object : Callback() {
                                override fun onCreate(db: SupportSQLiteDatabase) {
                                    super.onCreate(db)
                                    doAsync {
                                        PREPOPULATE_ESTABELECIMENTO.forEach {
                                            getDatabase(context).estabelecimentoDao().insert(it)
                                        }
                                        PREPOPULATE_ITEM_CARDAPIO.forEach {
                                            getDatabase(context).itemCardapioDao().insert(it)
                                        }
                                        PREPOPULATE_MESAS.forEach{
                                            getDatabase(context).mesaDao().insert(it)
                                        }
                                        PREPOLATE_PRODUTOS.forEach {
                                            getDatabase(context).produtoDao().insert(it)
                                        }
                                    }
                                }
                            })
                            */
                            .build()
                }
            }
            return instance as AgendaDatabase
        }

        fun destroyInstance() {
            instance = null
        }
    }
}