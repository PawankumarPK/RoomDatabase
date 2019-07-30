package com.example.roomdatabase


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


//first class
@Entity(tableName = "users")
class User {

    @PrimaryKey
    var id: Int = 0

    @ColumnInfo(name = "user_name")
    var name: String? = null

    @ColumnInfo(name = "user_email")
    var email: String? = null
}
