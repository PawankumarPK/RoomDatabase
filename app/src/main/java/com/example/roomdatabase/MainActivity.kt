package com.example.roomdatabase

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import com.example.roomdatabase.fragments.HomeFragment

class MainActivity : AppCompatActivity() {

    companion object {
        var INSTANCE: MyDatabase? = null
        private var db: MyDatabase? = null
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        INSTANCE = getAppDataBase(applicationContext)!!
        // MyDB = Room.databaseBuilder(applicationContext, MyDatabase::class.java, "userDB").allowMainThreadQueries().build()
        loadFragment()
    }

    fun getAppDataBase(context: Context): MyDatabase? {
        if (INSTANCE == null) {
            synchronized(MyDatabase::class) {
                INSTANCE = Room.databaseBuilder(context.applicationContext, MyDatabase::class.java, "myDB")
                    .allowMainThreadQueries().build()
            }
        }
        return INSTANCE
    }

    private fun loadFragment() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.mFrameContainer, HomeFragment())
            .addToBackStack(null)
            .commit()
    }
}//add Live Data with view model
