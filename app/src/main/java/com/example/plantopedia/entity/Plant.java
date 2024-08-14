package com.example.plantopedia.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.plantopedia.Type;

@Entity
public class Plant {
    @PrimaryKey
    public long id;

    @ColumnInfo(name = "name")
    public String name;

    @ColumnInfo(name = "type")
    public Type type;

    @ColumnInfo(name = "description")
    public String description;

    public Plant(long id, String name, Type type, String description) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.description = description;
    }
}
