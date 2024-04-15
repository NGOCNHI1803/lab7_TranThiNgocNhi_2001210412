package com.example.lab7_tranthingocnhi_2001210412;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Bai3_Bottom_Navigation_View extends AppCompatActivity {
    ActionBar actionBar;
    BottomNavigationView bottomNavigationView;
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3_bottom_navigation_view);

        actionBar = getSupportActionBar();
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        frameLayout = (FrameLayout) findViewById(R.id.frame_container);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment;
                int id = item.getItemId();
                if(id == R.id.navigation_shop){
                    item.setTitle("Shop");
                    loadFragment(new FragmentShop());
                    return true;
                } else if (id == R.id.navigation_gifts) {
                    item.setTitle("Gift");
                    loadFragment(new FragmentGift());
                    return true;
                } else if (id == R.id.navigation_cart) {
                    item.setTitle("Cart");
                    loadFragment(new FragmentCart());
                    return true;
                }else if (id == R.id.navigation_profile) {
                    item.setTitle("Profile");
                    loadFragment(new FragmentProfile());
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