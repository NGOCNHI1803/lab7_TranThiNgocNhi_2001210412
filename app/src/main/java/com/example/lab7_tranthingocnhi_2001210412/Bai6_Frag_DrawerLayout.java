package com.example.lab7_tranthingocnhi_2001210412;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class Bai6_Frag_DrawerLayout extends AppCompatActivity {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai6_frag_drawer_layout);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_nav, R.string.close_nav);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_drawer);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.nav_home) {
                    item.setChecked(true); // Đặt item "Home" là được chọn
                    loadFragment(new FragHomeBai6()); // Load FragmentHomeBai6 mới
                    drawerLayout.closeDrawer(GravityCompat.START); // Đóng ngăn kéo sau khi chọn xong
                    return true;
                } else if (id == R.id.app_cycling) {
                    item.setChecked(true); // Đặt item "Home" là được chọn
                    loadFragment(new FragCycling()); // Load FragmentHomeBai6 mới
                    drawerLayout.closeDrawer(GravityCompat.START);
                } else if (id == R.id.app_bus) {
                    item.setChecked(true); // Đặt item "Home" là được chọn
                    loadFragment(new FragBus()); // Load FragmentHomeBai6 mới
                    drawerLayout.closeDrawer(GravityCompat.START);
                } else if (id == R.id.app_plane) {
                    item.setChecked(true); // Đặt item "Home" là được chọn
                    loadFragment(new FragmentPlane()); // Load FragmentHomeBai6 mới
                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                return false;
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) { // Nếu nút home được nhấn
            if (!drawerLayout.isDrawerOpen(GravityCompat.START)) { // Kiểm tra nếu ngăn kéo (drawer) chưa mở
                drawerLayout.openDrawer(GravityCompat.START); // Mở ngăn kéo
            } else {
                drawerLayout.closeDrawer(GravityCompat.START); // Đóng ngăn kéo nếu nó đã mở
            }
            return true;
        } else if (id == R.id.app_cycling) {
            if (!drawerLayout.isDrawerOpen(GravityCompat.START)) { // Kiểm tra nếu ngăn kéo (drawer) chưa mở
                drawerLayout.openDrawer(GravityCompat.START);
                drawerLayout.setBackgroundColor(getColor(R.color.teal_200));// Mở ngăn kéo
            } else {
                drawerLayout.closeDrawer(GravityCompat.START); // Đóng ngăn kéo nếu nó đã mở
            }
            return true;
        } else if (id == R.id.app_bus) {
            if (!drawerLayout.isDrawerOpen(GravityCompat.START)) { // Kiểm tra nếu ngăn kéo (drawer) chưa mở
                drawerLayout.openDrawer(GravityCompat.START);
                drawerLayout.setBackgroundColor(getColor(R.color.teal_200));// Mở ngăn kéo
            } else {
                drawerLayout.closeDrawer(GravityCompat.START); // Đóng ngăn kéo nếu nó đã mở
            }
            return true;
        } else if (id == R.id.app_plane) {
            if (!drawerLayout.isDrawerOpen(GravityCompat.START)) { // Kiểm tra nếu ngăn kéo (drawer) chưa mở
                drawerLayout.openDrawer(GravityCompat.START);
                drawerLayout.setBackgroundColor(getColor(R.color.teal_200));// Mở ngăn kéo
            } else {
                drawerLayout.closeDrawer(GravityCompat.START); // Đóng ngăn kéo nếu nó đã mở
            }
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    void loadFragment(Fragment fragment){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.content_frame_bai6, fragment);
        ft.commit();
    }
}