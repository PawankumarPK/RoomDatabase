package com.example.roomdatabase.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.example.roomdatabase.MainActivity;
import com.example.roomdatabase.R;
import com.example.roomdatabase.User;

import java.util.List;

public class ReadUserFragment extends Fragment {

    private TextView TxtInfo;


    public ReadUserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_read_user, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TxtInfo = view.findViewById(R.id.txt_display_info);

        List<User> users = MainActivity.myAppDatabase.myDao().getUsers();
        String info = "";

        for (User usr : users) {

            int id = usr.getId();
            String name = usr.getName();
            String email = usr.getEmail();

            info = info + "\n\n" + "Id : "+ id +"\nName : " + name + "\n" + "Email : "+ email;
        }
        TxtInfo.setText(info);

    }
}
