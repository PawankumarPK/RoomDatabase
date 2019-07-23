package com.example.roomdatabase


import androidx.room.Database
import androidx.room.RoomDatabase

//third class
@Database(entities = [User::class], version = 1)
abstract class MyDatabase : RoomDatabase() {

    abstract fun myDao(): MyDao
}
