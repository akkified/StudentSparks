package com.coding.studentsparks;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.credentials.CredentialManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.ListFragment;
import androidx.navigation.ui.AppBarConfiguration;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity{
    com.google.android.material.navigation.NavigationView navigationView;

    TodoFragment todoFragment = new TodoFragment();
    DrawingFragment drawingFragment = new DrawingFragment();

    HomeFragment homeFragment = new HomeFragment();

    TeachersFragment teachersFragment = new TeachersFragment();

    WavgFragment wavgFragment = new WavgFragment();
    Login login = new Login();

    public static SharedPreferences sharedPreferences;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharedPreferences = getSharedPreferences("my_list_prefs", Context.MODE_PRIVATE);


        navigationView = findViewById(R.id.navigation_view);

        getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragment).commit();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.todo){
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, todoFragment).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).commit();
                        return true;
                } else if (id == R.id.drawing) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, drawingFragment).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).commit();
                    return true;
                } else if (id == R.id.teachers) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, teachersFragment).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).commit();
                    return true;
                } else if (id == R.id.wavg) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, wavgFragment).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).commit();
                    return true;
                } else if (id == R.id.home) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragment).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).commit();
                    return true;
                } else if (id == R.id.login) {
                    startActivity(new Intent(MainActivity.this, Login.class));
                    return true;
                }




                return false;

            }

        });

    }

}