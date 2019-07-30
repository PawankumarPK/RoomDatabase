package com.example.roomdatabase.fragments


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.roomdatabase.MainActivity
import com.example.roomdatabase.R
import com.example.roomdatabase.User


class AddUserFragment : Fragment() {

    private var UserId: EditText? = null
    private var UserName: EditText? = null
    private var UserEmail: EditText? = null
    private var BnSave: Button? = null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_add_user, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        UserId = view.findViewById(R.id.txt_user_id)
        UserName = view.findViewById(R.id.txt_name)
        UserEmail = view.findViewById(R.id.txt_email)
        BnSave = view.findViewById(R.id.bn_save_user)

        BnSave!!.setOnClickListener {
            val userid = Integer.parseInt(UserId!!.text.toString())
            val username = UserName!!.text.toString()
            val useremail = UserEmail!!.text.toString()


            val user = User()
            user.id = userid
            user.name = username
            user.email = useremail

            //insert data into table
            MainActivity.myAppDatabase!!.myDao().addUser(user)
            Toast.makeText(activity, "User Added Successfully  ", Toast.LENGTH_SHORT).show()

            UserId!!.setText("")
            UserName!!.setText("")
            UserEmail!!.setText("")
        }

    }
}// Required empty public constructor
