package com.example.digiagenda.repository.room.converters

import androidx.room.*
import java.time.*

class LocalDateTimeConverter {
    @TypeConverter
    fun fromLocalDateTime(localdate: LocalDateTime): String {
        return localdate.toString()
    }

    @TypeConverter
    fun toLocalDateTime(strLocalDateTime: String): LocalDateTime {
        return LocalDateTime.parse(strLocalDateTime)
    }
}
