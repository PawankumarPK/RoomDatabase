package com.example.roomdatabase

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.room.Room
import com.example.roomdatabase.fragments.HomeFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fragmentManager = supportFragmentManager

        myAppDatabase =
            Room.databaseBuilder(applicationContext, MyDatabase::class.java, "userdb").allowMainThreadQueries().build()

        if (findViewById<View>(R.id.fragment_container) != null) {
            if (savedInstanceState != null) {
                return
            }
            fragmentManager.beginTransaction().add(R.id.fragment_container, HomeFragment()).addToBackStack(null)
                .commit()
        }


    }

    companion object {

        var fragmentManager: FragmentManager
        var myAppDatabase: MyDatabase
    }
}
