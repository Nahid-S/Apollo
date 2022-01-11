package com.example.software;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ListAdmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_admin);
    }

    public void gotoAdmin(View view) {

        Intent intent = new Intent(ListAdmin.this,CatAdmin.class);
        startActivity(intent);

    }
}