package com.example.digiagenda.repository

interface BaseDataSource<T> {
    fun save(obj: T): Long
    fun insert(obj: T): Long
    fun update(obj: T)
    fun delete(obj: T)
}