package com.example.roomdatabase.fragments;


import android.os.Bundle;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.roomdatabase.MainActivity;
import com.example.roomdatabase.R;

public class HomeFragment extends Fragment implements View.OnClickListener {

    private Button BnAddUser;

    public HomeFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        BnAddUser = view.findViewById(R.id.bn_add_users);
        BnAddUser.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.bn_add_users:
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,new AddUserFragment()).commit();
            break;
        }
    }
}
