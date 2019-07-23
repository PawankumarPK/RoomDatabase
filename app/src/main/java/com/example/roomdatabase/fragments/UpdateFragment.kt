package com.example.roomdatabase.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.roomdatabase.MainActivity
import com.example.roomdatabase.R
import com.example.roomdatabase.User


class UpdateFragment : Fragment() {

    private var UserId: EditText? = null
    private var UserName: EditText? = null
    private var UserEmail: EditText? = null
    private var BnUpdate: Button? = null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_update, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        UserId = view.findViewById(R.id.txt_user_id)
        UserName = view.findViewById(R.id.txt_name)
        UserEmail = view.findViewById(R.id.txt_email)
        BnUpdate = view.findViewById(R.id.update_user)

        BnUpdate!!.setOnClickListener {
            val id = Integer.parseInt(UserId!!.text.toString())
            val name = UserName!!.text.toString()
            val email = UserEmail!!.text.toString()


            val user = User()

            user.id = id
            user.name = name
            user.email = email

            MainActivity.myAppDatabase!!.myDao().updateUser(user)
            Toast.makeText(context, "User Update Successful", Toast.LENGTH_SHORT).show()

            UserId!!.setText("")
            UserName!!.setText("")
            UserEmail!!.setText("")
        }
    }
}// Required empty public constructor
