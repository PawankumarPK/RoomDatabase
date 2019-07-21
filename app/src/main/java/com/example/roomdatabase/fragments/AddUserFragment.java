package com.example.roomdatabase.fragments;


import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.roomdatabase.MainActivity;
import com.example.roomdatabase.R;
import com.example.roomdatabase.User;

public class AddUserFragment extends Fragment {

    private EditText UserId,UserName,UserEmail;
    private Button BnSave;


    public AddUserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_add_user, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        UserId = view.findViewById(R.id.txt_user_id);
        UserName = view.findViewById(R.id.txt_name);
        UserEmail= view.findViewById(R.id.txt_email);
        BnSave= view.findViewById(R.id.bn_save_user);

        BnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int userid = Integer.parseInt(UserId.getText().toString());
                String username = UserName.getText().toString();
                String useremail= UserEmail.getText().toString();


                User user = new User();
                user.setId(userid);
                user.setName(username);
                user.setEmail(useremail);

                //insert data into table
                MainActivity.myAppDatabase.myDao().addUser(user);
                Toast.makeText(getActivity(), "User Added Successfully  ", Toast.LENGTH_SHORT).show();

                UserId.setText("");
                UserName.setText("");
                UserEmail.setText("");


            }
        });

    }
}
