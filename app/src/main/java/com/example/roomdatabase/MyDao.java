package com.example.roomdatabase;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;


//second class
@Dao
public interface MyDao {


    //insert data in DB
    @Insert
    public void addUser(User user);

    //get Data from DB
    @Query("select * from users")
    public List<User> getUsers();

    //delete user from DB
    @Delete
    public void deleteUser(User user);
}
