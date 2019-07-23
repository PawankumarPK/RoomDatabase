package com.example.roomdatabase;


import androidx.room.Database;
import androidx.room.RoomDatabase;

//third class
@Database (entities = User.class,version = 1)
public abstract class MyDatabase extends RoomDatabase {

    public abstract MyDao myDao();
}
