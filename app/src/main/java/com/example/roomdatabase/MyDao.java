package com.example.roomdatabase;

import androidx.room.*;

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

    //update user
    @Update
    public void updateUser(User user);
}
