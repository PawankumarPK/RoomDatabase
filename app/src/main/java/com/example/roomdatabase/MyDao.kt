package com.example.roomdatabase

import androidx.room.*


//second class
@Dao
interface MyDao {

    //get Data from DB
    @get:Query("select * from usersDB")
    val user: List<User>


    //insert data in DB
    @Insert
    fun addUser(user: User)

    //delete user from DB
    @Delete
    fun deleteUser(user: User)

    //update user
    @Update
    fun updateUser(user: User)
}
