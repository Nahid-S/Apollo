package com.example.software;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CatBus extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_bus);


    }

    public void gotoBusList(View view) {
        Intent intent = new Intent(CatBus.this,ListBus.class);
        startActivity(intent);
    }

    public void gotoHome(View view) {
        Intent intent = new Intent(CatBus.this,HomeActivity.class);
        startActivity(intent);
    }
}