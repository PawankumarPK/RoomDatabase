package com.example.roomdatabase.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.roomdatabase.R
import com.example.roomdatabase.User
import kotlinx.android.synthetic.main.view_holder.view.*

class RecyclerAdapter(val list: ArrayList<User>) : RecyclerView.Adapter<RecyclerAdapter.viewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        return viewHolder(LayoutInflater.from(parent.context).inflate(R.layout.view_holder, parent, false))

    }

    override fun getItemCount(): Int {
        return list.size

    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {

        holder.onBind(position)
    }

    inner class viewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun onBind(position: Int) {

            val dbData = list[position]

            itemView.mName.text = dbData.username
            itemView.mNameSurname.text = dbData.usersurname
            //itemView.mDob.text = dbData.userdob
            itemView.mEmail.text = dbData.useremail
        }

    }
}