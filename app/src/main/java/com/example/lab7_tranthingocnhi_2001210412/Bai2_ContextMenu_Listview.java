package com.example.lab7_tranthingocnhi_2001210412;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class Bai2_ContextMenu_Listview extends AppCompatActivity {
    ListView lvLanguage;
    ArrayList<String> arrayList;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2_context_menu_listview);

        lvLanguage = (ListView) findViewById(R.id.lvLanguage);
        String[] languages = getResources().getStringArray(R.array.languages);
        arrayList = new ArrayList<String>(Arrays.asList(languages));

        adapter = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, arrayList);
        lvLanguage.setAdapter(adapter);

        //registerForContextMenu(lvLanguage);

       lvLanguage.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              view.setBackgroundColor(getResources().getColor(R.color.dark_gray));
               // Hiển thị context menu
               registerForContextMenu(view);
               openContextMenu(view);
               unregisterForContextMenu(view);
           }
       });

    }
    /*void loadData(){
        arrayList = new ArrayList<String>();
        arrayList.add("Python");
        arrayList.add("Java");
        arrayList.add("Ruby");
        arrayList.add("C++");
        arrayList.add("C#");
        arrayList.add("Asp.net");
        arrayList.add("PHP");
    }*/


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.context_menu_bai2, menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        if (info == null) {
            return super.onContextItemSelected(item);
        }
        int pos = info.position;
        String i = adapter.getItem(pos);
        int id = item.getItemId();
        if(id == R.id.delete){
            arrayList.remove(pos);
            adapter.notifyDataSetChanged();
            Toast.makeText(getApplicationContext(), "Delete '" +i+ "' at row " +info.id, Toast.LENGTH_LONG).show();
        } else if (id == R.id.Uppercase) {
            Toast.makeText(getApplicationContext(), "Uppercase", Toast.LENGTH_LONG).show();

        } else if (id == R.id.Lowercase) {
            Toast.makeText(getApplicationContext(), "Lowercase", Toast.LENGTH_LONG).show();
        }
        return super.onContextItemSelected(item);
    }
}