package com.coding.studentsparks;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class WavgFragment extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_wavg, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        EditText ela = view.findViewById(R.id.subela);
        EditText math = view.findViewById(R.id.submath);
        EditText sci = view.findViewById(R.id.subsci);
        EditText ss = view.findViewById(R.id.subss);
        EditText wl = view.findViewById(R.id.subwl);
        Button calc = view.findViewById(R.id.calc);
        TextView gpa = view.findViewById(R.id.gpa);


        calc.setOnClickListener(v -> {
            float num1 = Float.parseFloat(ela.getText().toString());
            float num2 = Float.parseFloat(math.getText().toString());
            float num3 = Float.parseFloat(sci.getText().toString());
            float num4 = Float.parseFloat(ss.getText().toString());
            float num5 = Float.parseFloat(wl.getText().toString());
            float sum = num1 + num2 + num3 + num4 + num5;

            float avg = sum / 5;

            String avg1 = Float.toString(avg);

            gpa.setText(avg1);

        });
    }
}