package com.example.digiagenda.repository.room

const val DATABASE_VERSION = 1
const val DATABASE_NAME = "dbAgenda"

const val TABLE_EVENTO = "evento"
const val COLUMN_EVENTO_ID="eventoId"
const val COLUMN_TITULO = "titulo"
const val COLUMN_EVENTO_DATA = "data"
const val COLUMN_EVENTO_HORA = "hora"

const val TABLE_USUARIO = "usuario"
const val COLUMN_USUARIO_ID = "id"
const val COLUMN_NOME = "nome"
const val COLUMN_EMAIL = "email"
const val COLUMN_SENHA_OBFUSCATED = "senhaObfuscated"