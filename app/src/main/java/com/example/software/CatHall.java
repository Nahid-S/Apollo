package com.example.software;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CatHall extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_hall);
    }

    public void gotoYKSG(View view) {
        startActivity(new Intent(CatHall.this,ListHall.class));
    }

    public void gotoHome(View view) {
        startActivity(new Intent(CatHall.this,HomeActivity.class));
    }
}