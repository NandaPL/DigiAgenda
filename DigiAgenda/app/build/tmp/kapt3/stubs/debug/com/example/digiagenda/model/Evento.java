package com.example.digiagenda.model;

import java.lang.System;

@androidx.room.Entity(tableName = "evento")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\tH\u00c6\u0003J1\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010#\u001a\u00020$H\u00d6\u0001J\t\u0010%\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006&"}, d2 = {"Lcom/example/digiagenda/model/Evento;", "", "eventoId", "", "titulo", "", "data", "Ljava/time/LocalDate;", "hora", "Ljava/time/LocalTime;", "(JLjava/lang/String;Ljava/time/LocalDate;Ljava/time/LocalTime;)V", "getData", "()Ljava/time/LocalDate;", "setData", "(Ljava/time/LocalDate;)V", "getEventoId", "()J", "setEventoId", "(J)V", "getHora", "()Ljava/time/LocalTime;", "setHora", "(Ljava/time/LocalTime;)V", "getTitulo", "()Ljava/lang/String;", "setTitulo", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class Evento {
    @androidx.room.ColumnInfo(name = "eventoId")
    @androidx.room.PrimaryKey(autoGenerate = true)
    private long eventoId;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "titulo")
    private java.lang.String titulo;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "data")
    private java.time.LocalDate data;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "hora")
    private java.time.LocalTime hora;
    
    public final long getEventoId() {
        return 0L;
    }
    
    public final void setEventoId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitulo() {
        return null;
    }
    
    public final void setTitulo(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDate getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalTime getHora() {
        return null;
    }
    
    public final void setHora(@org.jetbrains.annotations.NotNull()
    java.time.LocalTime p0) {
    }
    
    public Evento(long eventoId, @org.jetbrains.annotations.NotNull()
    java.lang.String titulo, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate data, @org.jetbrains.annotations.NotNull()
    java.time.LocalTime hora) {
        super();
    }
    
    public Evento() {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDate component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalTime component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.digiagenda.model.Evento copy(long eventoId, @org.jetbrains.annotations.NotNull()
    java.lang.String titulo, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate data, @org.jetbrains.annotations.NotNull()
    java.time.LocalTime hora) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}