package com.example.lab7_tranthingocnhi_2001210412;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnBai1, btnBai2, btnBai3, btnBai5, btnBai6, btnBai7, btnBai4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }
    void addControls(){
        btnBai1 = (Button) findViewById(R.id.btnBai1TL);
        btnBai2 = (Button) findViewById(R.id.btnBai2TL);
        btnBai3 = (Button) findViewById(R.id.btnBai3TL);
        btnBai4 = findViewById(R.id.btnBai4);

        btnBai5 = findViewById(R.id.btnBai5VN);
        btnBai6 = findViewById(R.id.btnBai6VN);
    }
    void addEvents(){
        btnBai1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Bai1_ContextMenu.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Loading Context Menu", Toast.LENGTH_LONG).show();
            }
        });
        btnBai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Bai2_ContextMenu_Listview.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Loading Bài 2", Toast.LENGTH_LONG).show();
            }
        });
        btnBai3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Bai3_Bottom_Navigation_View.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Loading Bài 3", Toast.LENGTH_LONG).show();
            }
        });
        btnBai4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Bai4_Navigation_Drawer.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Loading Bài 4", Toast.LENGTH_LONG).show();
            }
        });
        btnBai5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Bai5_Frag_Nav_Tab.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Loading Bài 5", Toast.LENGTH_LONG).show();
            }
        });
        btnBai6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Bai6_Frag_DrawerLayout.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Loading Bài 6", Toast.LENGTH_LONG).show();
            }
        });

    }
}