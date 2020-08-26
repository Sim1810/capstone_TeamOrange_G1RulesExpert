package com.android.q1learningapp.RoomDB.AppDatabase;

import com.android.q1learningapp.RoomDB.Dao.LoginDao;
import com.android.q1learningapp.RoomDB.Entity.LoginEntity;

import androidx.room.Database;
import androidx.room.RoomDatabase;
//App database that will create instance of our data manipulation objects
@Database(entities = {LoginEntity.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract LoginDao loginDao();

}