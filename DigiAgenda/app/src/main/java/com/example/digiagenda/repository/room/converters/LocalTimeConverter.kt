package com.example.digiagenda.repository.room.converters

import androidx.room.*
import java.time.*

class LocalTimeConverter {
    @TypeConverter
    fun fromLocalTime(localtime: LocalTime): String {
        return localtime.toString()
    }

    @TypeConverter
    fun toLocalTime(strLocalTime: String): LocalTime {
        return LocalTime.parse(strLocalTime)
    }
}
