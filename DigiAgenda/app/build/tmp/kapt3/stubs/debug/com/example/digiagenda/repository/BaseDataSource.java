package com.example.digiagenda.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\tJ\u0015\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lcom/example/digiagenda/repository/BaseDataSource;", "T", "", "delete", "", "obj", "(Ljava/lang/Object;)V", "insert", "", "(Ljava/lang/Object;)J", "save", "update", "app_debug"})
public abstract interface BaseDataSource<T extends java.lang.Object> {
    
    public abstract long save(T obj);
    
    public abstract long insert(T obj);
    
    public abstract void update(T obj);
    
    public abstract void delete(T obj);
}