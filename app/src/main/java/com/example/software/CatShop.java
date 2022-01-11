package com.example.software;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CatShop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_shop);


    }

    public void gotoFoodList(View view) {

        Intent intent = new Intent(CatShop.this,ListFood.class);
        startActivity(intent);

    }

    public void gotoHome(View view) {
        startActivity(new Intent(CatShop.this,HomeActivity.class));
    }
}