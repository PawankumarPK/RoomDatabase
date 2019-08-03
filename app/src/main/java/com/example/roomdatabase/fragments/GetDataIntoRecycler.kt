package com.example.roomdatabase.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.roomdatabase.MainActivity
import com.example.roomdatabase.R
import com.example.roomdatabase.User
import com.example.roomdatabase.adapter.RecyclerAdapter
import kotlinx.android.synthetic.main.fragment_get_data_into_recycler.*


class GetDataIntoRecycler : Fragment() {

    private var listDB: ArrayList<User> = ArrayList()

    private lateinit var adapter: RecyclerAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_get_data_into_recycler, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        mRecyclerView.layoutManager = LinearLayoutManager(context)
        adapter = RecyclerAdapter(listDB)
        mRecyclerView.adapter = adapter

        mGetListData()
    }

    private fun mGetListData() {
        val listData = MainActivity.INSTANCE!!.myDao().user
        listDB.addAll(listData)
        adapter.notifyDataSetChanged()
    }

}

