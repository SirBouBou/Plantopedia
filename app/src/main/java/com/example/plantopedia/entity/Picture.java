package com.example.plantopedia.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Picture {
    @PrimaryKey
    public long id;

    @ColumnInfo(name = "plant_id")
    public long plantId;

    @ColumnInfo(name = "picture_name")
    public String pictureName;

    @ColumnInfo(name = "order")
    public int order;
}
