package com.example.lab7_tranthingocnhi_2001210412;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Bai5_Frag_Nav_Tab extends AppCompatActivity {

    ActionBar actionBar;
    BottomNavigationView bottomNavigationView;
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai5_frag_nav_tab);

        actionBar = getSupportActionBar();
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        frameLayout = (FrameLayout) findViewById(R.id.frame_container);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment;
                int id = item.getItemId();
                if(id == R.id.app_bar_home){
                    item.setTitle("Home");
                    loadFragment(new FragmentHome());
                    //item.setChecked(true);
                    //ColorStateList colorStateList = ContextCompat.getColorStateList(getApplicationContext(), R.color.bgIcon);
                    //bottomNavigationView.setItemIconTintList(colorStateList);

                    return true;
                } else if (id == R.id.app_bar_No) {
                    item.setTitle("Notification");
                    loadFragment(new FragmentNotification());
                    //actionBar.setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(getApplicationContext(), R.color.bgIcon)));
                    return true;
                } else if (id == R.id.app_Search) {
                    item.setTitle("Search");
                    loadFragment(new FragmentSearch());
                    //actionBar.setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(getApplicationContext(), R.color.bgIcon)));
                    return true;
                }else if (id == R.id.app_bar_Cafe) {
                    item.setTitle("Cafe");
                    loadFragment(new FragmentCafe());
                    //actionBar.setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(getApplicationContext(), R.color.bgIcon)));
                    return true;
                }
                return false;
            }
        });
    }




    void loadFragment(Fragment fragment){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frame_container, fragment);
        ft.commit();

    }
}