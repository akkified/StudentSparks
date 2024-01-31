package com.coding.studentsparks;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    TodoFragment todoFragment = new TodoFragment();
    TeachersFragment teachersFragment = new TeachersFragment();
    DrawingFragment drawingFragment = new DrawingFragment();





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        getSupportFragmentManager().beginTransaction().replace(R.id.container, todoFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.todo){
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, todoFragment).commit();
                        return true;
                } else if (id == R.id.teachers) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, teachersFragment).commit();
                    return true;
                } else if (id == R.id.drawing) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, drawingFragment).commit();
                    return true;
                }




                return false;

            }
        });

    }
}