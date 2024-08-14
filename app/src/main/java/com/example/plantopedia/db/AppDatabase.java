package com.example.plantopedia.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.plantopedia.dao.PlantDao;
import com.example.plantopedia.entity.Plant;

@Database(entities = {Plant.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract PlantDao plantDao();
}
