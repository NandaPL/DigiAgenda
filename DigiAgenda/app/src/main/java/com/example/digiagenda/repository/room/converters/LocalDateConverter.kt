package com.example.digiagenda.repository.room.converters

import androidx.room.*
import java.time.*

class LocalDateConverter {
    @TypeConverter
    fun fromLocalDate(localdate: LocalDate): String {
        return localdate.toString()
    }

    @TypeConverter
    fun toLocalDate(strLocalDate: String): LocalDate {
        return LocalDate.parse(strLocalDate)
    }
}
