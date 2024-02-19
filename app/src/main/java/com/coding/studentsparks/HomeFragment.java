package com.coding.studentsparks;

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

    String[] item = {"Settings", "Profile", "Logout"};
    AutoCompleteTextView autoCompleteTextView;
    ArrayAdapter<String> adapterItems;



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
        autoCompleteTextView = getView().findViewById(R.id.auto_complete_txt);
        adapterItems = new ArrayAdapter<String>(getActivity(), R.layout.list_item, item);
        autoCompleteTextView.setAdapter(adapterItems);
        autoCompleteTextView.setOnItemClickListener((adapterView, view1, i, l) -> {
//      String item = adapterView.getItemAtPosition(i).toString();

        });

    }
}