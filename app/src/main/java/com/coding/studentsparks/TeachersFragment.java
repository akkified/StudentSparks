package com.coding.studentsparks;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class TeachersFragment extends Fragment {

    String[] item = {"","Parlak", "Hunnicutt", "Mathman", "Jeon", "Nikki", "Adel", "Adebayo", "Colangelo"};
    AutoCompleteTextView autoCompleteTextView;
    ArrayAdapter<String> adapterItems;

    String name = "";
    String email = "";
    String skills = "";




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_teachers, container, false);
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        autoCompleteTextView = getView().findViewById(R.id.auto_complete_txt);
        adapterItems = new ArrayAdapter<String>(getActivity(), R.layout.list_item, item);
        autoCompleteTextView.setAdapter(adapterItems);
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item = adapterView.getItemAtPosition(i).toString();
                TextView name_slot = getView().findViewById(R.id.name_slot);
                TextView skills_slot = getView().findViewById(R.id.skills_slot);
                TextView email_slot = getView().findViewById(R.id.email_slot);

                if (item == "Parlak"){
                    name = "Yasin ";
                    email = "yparlak@fultonscienceacademy.org";
                    skills = "Science";
                    name_slot.setText("Yasin Parlak");
                    email_slot.setText(email);
                    skills_slot.setText(skills);

                } else if (item == "Hunnicutt") {
                    name = "Frances Darlene ";
                    email = "fhunnicutt@fultonscienceacademy.org";
                    skills = "Social Studies";
                    name_slot.setText("Frances Hunnicutt");
                    email_slot.setText(email);
                    skills_slot.setText(skills);

                } else if (item == "Mathman") {
                    name = "Dan Butler aka ";
                    email = "dbutler@fultonscienceacademy.org";
                    skills = "Math";
                    name_slot.setText("Mathman");
                    email_slot.setText(email);
                    skills_slot.setText(skills);
                } else if (item == "Jeon") {
                    name = "Uichae ";
                    email = "ujeon@fultonscienceacademy.org";
                    skills = "Orchestra";
                    name_slot.setText("Uichae Jeon");
                    email_slot.setText(email);
                    skills_slot.setText(skills);
                } else if (item == "Nikki") {
                    name = "Coach ";
                    email = "njohnson@fultonscienceacademy.org";
                    skills = "P.E.";
                    name_slot.setText("Coach Nikki");
                    email_slot.setText(email);
                    skills_slot.setText(skills);
                } else if (item == "Adel") {
                    name = "Dina ";
                    email = "delseay@fultonscienceacademy.org";
                    skills = "CPS/Anchor";
                    name_slot.setText("Dina Adel");
                    email_slot.setText(email);
                    skills_slot.setText(skills);
                } else if (item == "Adebayo") {
                    name = "Tiesha ";
                    email = "tadebayo@fultonscienceacademy.org";
                    skills = "E.L.A.";
                    name_slot.setText("Tiesha Adebayo");
                    email_slot.setText(email);
                    skills_slot.setText(skills);
                } else if (item == "Colangelo") {
                    name = "Maria ";
                    email = "mcolangelo@fultonscienceacademy.org";
                    skills = "Spanish";
                    name_slot.setText("Maria Colangelo");
                    email_slot.setText(email);
                    skills_slot.setText(skills);
                } else {
                    name = "";
                    email = "Email: ";
                    skills = "Skills: ";
                    name_slot.setText("Name: ");
                    email_slot.setText(email);
                    skills_slot.setText(skills);
                }




                Toast.makeText(getContext().getApplicationContext(),   name + item, Toast.LENGTH_SHORT).show();
            }
        });

    }
}