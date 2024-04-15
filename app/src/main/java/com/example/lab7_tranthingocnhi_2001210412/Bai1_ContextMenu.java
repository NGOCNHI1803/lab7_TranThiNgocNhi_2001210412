package com.example.lab7_tranthingocnhi_2001210412;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;

public class Bai1_ContextMenu extends AppCompatActivity {
    TextView txtCM;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1_context_menu);
        txtCM = (TextView) findViewById(R.id.tvCM);
        registerForContextMenu(txtCM);

    }
    @SuppressLint("RestrictedApi")
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.option_menu_bai1,menu);

        //Nếu muốn icon hiển thị kèm theo menu
        if(menu instanceof MenuBuilder)
        {
            MenuBuilder m = (MenuBuilder) menu;
            m.setOptionalIconsVisible(true);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        switch (item.getItemId())
//        {
//            case R.id.menuitem_facebook:
//                Toast.makeText(this,"Facebook",Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.menuitem_delete:
//                Toast.makeText(this,"Delete",Toast.LENGTH_SHORT).show();
//                break;
//        }
        int id = item.getItemId();
        if(id==R.id.menuitem_facebook)
            Toast.makeText(this,"Facebook",Toast.LENGTH_SHORT).show();
        else
        if(id==R.id.menuitem_instagram)
            Toast.makeText(this,"Instagram",Toast.LENGTH_SHORT).show();

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.context_menu_bai1,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();

        int id = item.getItemId();
        if(id == R.id.ci_insert){
            Toast.makeText(this,"Insert",Toast.LENGTH_SHORT).show();
        } else if (id == R.id.ci_delete) {
            Toast.makeText(this,"Delete",Toast.LENGTH_SHORT).show();
        }
        return super.onContextItemSelected(item);
    }
}