package com.example.roomdatabase.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.roomdatabase.R
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mInsertData.setOnClickListener {
            fragmentManager!!.beginTransaction()
                .replace(R.id.mFrameContainer, AddUserFragment())
                .addToBackStack(null)
                .commit()
        }

        mGetData.setOnClickListener {
            fragmentManager!!.beginTransaction()
                .replace(R.id.mFrameContainer, ReadUserFragment())
                .addToBackStack(null)
                .commit()
        }
        mDeleteData.setOnClickListener {
            fragmentManager!!.beginTransaction()
                .replace(R.id.mFrameContainer, DeleteUserFragment())
                .addToBackStack(null)
                .commit()
        }
        mUpdateData.setOnClickListener {
            fragmentManager!!.beginTransaction()
                .replace(R.id.mFrameContainer, UpdateFragment())
                .addToBackStack(null)
                .commit()
        }
        mGetDataList.setOnClickListener {
            fragmentManager!!.beginTransaction()
                .replace(R.id.mFrameContainer, GetDataIntoRecycler())
                .addToBackStack(null)
                .commit()
        }
    }


}
