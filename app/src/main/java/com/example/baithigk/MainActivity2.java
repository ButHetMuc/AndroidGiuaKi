package com.example.baithigk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ListView listView;
        MatKinhAdapter adapter;
        ArrayList<MatKinh> listData;

        listView = findViewById(R.id.id_list_view_main2);
        listData = new ArrayList<>();

        listData.add(new MatKinh("platis optical",15,"for man",R.drawable.niceglass2_removebg_preview_1));
        listData.add(new MatKinh("Non-Platis",19,"for man",R.drawable.g_rm_1));
        listData.add(new MatKinh("platis optical",10,"for man",R.drawable.niceglass4_removebg_preview_1));
        listData.add(new MatKinh("platis optical",15,"for man",R.drawable.niceglass6_removebg_preview_1));
        listData.add(new MatKinh("platis optical",15,"for man",R.drawable.niceglass2_removebg_preview_1));

        adapter = new MatKinhAdapter(listData,MainActivity2.this,R.layout.list_item_layout);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent();
                intent.setClass(MainActivity2.this,MainActivity3.class);
                Bundle bundle = new Bundle();
                bundle.putString("name",listData.get(i).getTenMk());
                bundle.putDouble("cost",listData.get(i).getGiaMk());
                bundle.putString("for",listData.get(i).getForMk());
                bundle.putInt("image",listData.get(i).getFlagImage());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }
}