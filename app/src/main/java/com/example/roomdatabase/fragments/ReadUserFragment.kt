package com.example.roomdatabase.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.roomdatabase.MainActivity
import com.example.roomdatabase.R
import com.example.roomdatabase.User


class ReadUserFragment : Fragment() {

    private var TxtInfo: TextView? = null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_read_user, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        TxtInfo = view.findViewById(R.id.txt_display_info)

        val users = MainActivity.myAppDatabase!!.myDao().users
        var info = ""

        for (usr in users) {

            val id = usr.id
            val name = usr.name
            val email = usr.email

            info = "$info\n\nId : $id\nName : $name\nEmail : $email"
        }
        TxtInfo!!.text = info

    }
}// Required empty public constructor
