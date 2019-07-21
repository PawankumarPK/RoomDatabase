package com.example.roomdatabase;

import androidx.room.Dao;
import androidx.room.Insert;


//second class
@Dao
public interface MyDao {


    @Insert
    public void addUser(User user);
}
