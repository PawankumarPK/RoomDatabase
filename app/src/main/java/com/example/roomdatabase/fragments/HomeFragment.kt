package com.example.roomdatabase.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.roomdatabase.MainActivity
import com.example.roomdatabase.R

class HomeFragment : Fragment(), View.OnClickListener {

    private var BnAddUser: Button? = null
    private var BnReadUser: Button? = null
    private var BnDelete: Button? = null
    private var BnUpdate: Button? = null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        BnAddUser = view.findViewById(R.id.bn_add_users)
        BnReadUser = view.findViewById(R.id.bn_view_users)
        BnDelete = view.findViewById(R.id.bn_delete_users)
        BnUpdate = view.findViewById(R.id.bn_update_users)

        BnReadUser!!.setOnClickListener(this)
        BnAddUser!!.setOnClickListener(this)
        BnDelete!!.setOnClickListener(this)
        BnUpdate!!.setOnClickListener(this)

    }

    override fun onClick(view: View) {

        when (view.id) {

            R.id.bn_add_users -> MainActivity.fragmentManager!!.beginTransaction().replace(
                R.id.fragment_container,
                AddUserFragment()
            ).addToBackStack(null).commit()

            R.id.bn_view_users -> MainActivity.fragmentManager!!.beginTransaction().replace(
                R.id.fragment_container,
                ReadUserFragment()
            ).addToBackStack(null).commit()

            R.id.bn_delete_users -> MainActivity.fragmentManager!!.beginTransaction().replace(
                R.id.fragment_container,
                DeleteUserFragment()
            ).addToBackStack(null).commit()

            R.id.bn_update_users -> MainActivity.fragmentManager!!.beginTransaction().replace(
                R.id.fragment_container,
                UpdateFragment()
            ).addToBackStack(null).commit()
        }
    }
}
