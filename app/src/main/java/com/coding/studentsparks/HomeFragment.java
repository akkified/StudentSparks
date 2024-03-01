package com.coding.studentsparks;


import static com.coding.studentsparks.Login.name;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.credentials.CredentialManager;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;

public class HomeFragment extends Fragment {

    TextView name_tv;
    TextView hello_tv;




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        name_tv = view.findViewById(R.id.name_tv);
        hello_tv = view.findViewById(R.id.hello_tv);
        if (name != null) {
            hello_tv.setText("Hello, ");
            name_tv.setText(name);
        }
        if (name == null || name == ""){
            hello_tv.setText("Hello!");
            name_tv.setText("");
        }


    }
}