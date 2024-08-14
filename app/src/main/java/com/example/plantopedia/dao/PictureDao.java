package com.example.plantopedia.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.plantopedia.entity.Picture;

import java.util.List;

@Dao
public interface PictureDao {
    @Query("SELECT picture_name pn FROM picture WHERE plant_id = :plantId ORDER BY `order` ASC")
    List<String> getPictureForPlant(int plantId);

    @Query("SELECT COUNT(*) FROM picture WHERE plant_id = :plantId")
    Integer getNumberOfPictureForPlant(int plantId);

    @Insert
    void insert(Picture picture);

    @Delete
    void delete(Picture picture);
}
