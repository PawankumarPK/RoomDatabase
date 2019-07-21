package com.example.roomdatabase.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.example.roomdatabase.MainActivity;
import com.example.roomdatabase.R;

public class HomeFragment extends Fragment implements View.OnClickListener {

    private Button BnAddUser, BnReadUser, BnDelete, BnUpdate;

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
        BnReadUser = view.findViewById(R.id.bn_view_users);
        BnDelete = view.findViewById(R.id.bn_delete_users);
        BnUpdate = view.findViewById(R.id.bn_update_users);

        BnReadUser.setOnClickListener(this);
        BnAddUser.setOnClickListener(this);
        BnDelete.setOnClickListener(this);
        BnUpdate.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.bn_add_users:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new AddUserFragment()).addToBackStack(null).commit();
                break;

            case R.id.bn_view_users:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ReadUserFragment()).addToBackStack(null).commit();
                break;

            case R.id.bn_delete_users:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new DeleteUserFragment()).addToBackStack(null).commit();
                break;

            case R.id.bn_update_users:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new UpdateFragment()).addToBackStack(null).commit();
                break;
        }
    }
}
