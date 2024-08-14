package com.example.plantopedia.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.plantopedia.Type;
import com.example.plantopedia.entity.Plant;

import java.util.List;

@Dao
public interface PlantDao {
    @Query("SELECT * FROM plant")
    List<Plant> getAll();

    @Query("SELECT * FROM plant WHERE type=:type")
    List<Plant> getByType(Type type);

    @Update
    void update(Plant plant);

    @Insert
    void insert(Plant plant);
    @Delete
    void delete(Plant plant);
}
