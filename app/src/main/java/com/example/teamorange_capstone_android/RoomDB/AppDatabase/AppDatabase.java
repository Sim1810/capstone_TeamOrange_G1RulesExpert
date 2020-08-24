package com.example.teamorange_capstone_android.RoomDB.AppDatabase;

import com.example.teamorange_capstone_android.RoomDB.Entity.LoginEntity;

import androidx.room.Database;
import androidx.room.RoomDatabase;
//App database that will create instance of our data manipulation objects
@Database(entities = {LoginEntity.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract LoginDao loginDao();

}