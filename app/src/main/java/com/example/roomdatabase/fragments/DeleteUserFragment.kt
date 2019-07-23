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


class DeleteUserFragment : Fragment() {

    private var TxtUserId: EditText? = null
    private var DeleteButton: Button? = null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_delete_user, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        TxtUserId = view.findViewById(R.id.delete)
        DeleteButton = view.findViewById(R.id.bn_delete_users)

        DeleteButton!!.setOnClickListener {
            val id = Integer.parseInt(TxtUserId!!.text.toString())

            val user = User()
            user.id = id
            MainActivity.myAppDatabase!!.myDao().deleteUser(user)

            Toast.makeText(context, "User Successfully Delete", Toast.LENGTH_SHORT).show()
            TxtUserId!!.setText("")
        }
    }
}// Required empty public constructor
