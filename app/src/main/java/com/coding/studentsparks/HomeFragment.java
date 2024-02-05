package com.coding.studentsparks;

import android.os.Bundle;

import androidx.credentials.CredentialManager;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;

public class HomeFragment extends Fragment {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Context context = requireContext();
        CredentialManager credentialManager = CredentialManager.create(context);
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
}