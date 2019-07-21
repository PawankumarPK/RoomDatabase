package com.example.roomdatabase.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.example.roomdatabase.MainActivity;
import com.example.roomdatabase.R;
import com.example.roomdatabase.User;

public class UpdateFragment extends Fragment {

    private EditText UserId, UserName, UserEmail;
    private Button BnUpdate;


    public UpdateFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_update, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        UserId = view.findViewById(R.id.txt_user_id);
        UserName = view.findViewById(R.id.txt_name);
        UserEmail = view.findViewById(R.id.txt_email);
        BnUpdate = view.findViewById(R.id.update_user);

        BnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int id = Integer.parseInt(UserId.getText().toString());
                String name = UserName.getText().toString();
                String email = UserEmail.getText().toString();



                User user = new User();

                user.setId(id);
                user.setName(name);
                user.setEmail(email);

                MainActivity.myAppDatabase.myDao().updateUser(user);
                Toast.makeText(getContext(), "User Update Successful", Toast.LENGTH_SHORT).show();

                UserId.setText("");
                UserName.setText("");
                UserEmail.setText("");

            }
        });
    }
}
