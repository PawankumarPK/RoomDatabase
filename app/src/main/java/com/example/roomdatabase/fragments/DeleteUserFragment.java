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

public class DeleteUserFragment extends Fragment {

    private EditText TxtUserId;
    private Button DeleteButton;


    public DeleteUserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_delete_user, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TxtUserId = view.findViewById(R.id.delete);
        DeleteButton = view.findViewById(R.id.bn_delete_users);

        DeleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int id = Integer.parseInt(TxtUserId.getText().toString());

                User user = new User();
                user.setId(id);
                MainActivity.myAppDatabase.myDao().deleteUser(user);

                Toast.makeText(getContext(), "User Successfully Delete", Toast.LENGTH_SHORT).show();
                TxtUserId.setText("");

            }
        });
    }
}
