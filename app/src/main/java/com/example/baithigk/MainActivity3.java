package com.example.baithigk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main3);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String ten = bundle.getString("name");
        String moTa = bundle.getString("for");
        double gia = bundle.getDouble("cost");
        int anh = bundle.getInt("image");

        TextView name = findViewById(R.id.id_ten_main3);
        TextView cost = findViewById(R.id.id_gia_main3);
        ImageView image = findViewById(R.id.idimageman3);

        name.setText(ten);
        cost.setText(String.valueOf(gia));
        image.setImageResource(anh);
    }
}