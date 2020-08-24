package com.example.teamorange_capstone_android.RoomDB.Dao;

import com.example.teamorange_capstone_android.RoomDB.Entity.LoginEntity;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface LoginDao {
    @Query("SELECT * FROM LoginEntity")
    List<LoginEntity> getAll();


    /*
      Insert the object in database

     */
    @Insert
    void insert(LoginEntity loginEntity);

    /*
      update the object in database

     */
    @Update
    void update(LoginEntity loginEntity);

    /*
      delete the object from database

     */
    @Delete
    void delete(LoginEntity loginEntity);

    /*
     delete list of objects from database

     */
    @Delete
    void delete(LoginEntity... loginEntities);      // LoginEntity... is varargs, loginEntities note is an array

    @Query("DELETE FROM LoginEntity")
    void deleteAll();
}
