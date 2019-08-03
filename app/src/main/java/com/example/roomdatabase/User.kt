package com.example.roomdatabase

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "usersDB")
class User {

    @PrimaryKey
    var id: Int? = null

    @ColumnInfo(name = "user_name")
    var username: String? = null

    @ColumnInfo(name = "user_surname")
    var usersurname: String? = null

    @ColumnInfo(name = "user_email")
    var useremail: String? = null

    @ColumnInfo(name = "user_dob")
    var userdob: Int? = null
}