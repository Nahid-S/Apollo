package com.example.software;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CatAdmin extends AppCompatActivity {

    TextView tvback,dev,update;
    private long backPressedTime;
    private Toast backToast;
    private static final int TIME_INTERVAL = 2000; // # milliseconds, desired time passed between two back presses.
    private long mBackPressed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_admin);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        tvback = findViewById(R.id.textView23);
        dev = findViewById(R.id.textView27);
        //update = findViewById(R.id.);



        tvback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CatAdmin.this,HomeActivity.class);
                startActivity(intent);
            }
        });

        dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CatAdmin.this,ListAdmin.class);
                startActivity(intent);
            }
        });

        tvback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CatAdmin.this,HomeActivity.class);
                startActivity(intent);
            }
        });



    }


    public void gotoDev(View view) {

        Intent intent = new Intent(CatAdmin.this,ListAdmin.class);
        startActivity(intent);

    }

    public void gotoHome(View view) {

        Intent intent = new Intent(CatAdmin.this,HomeActivity.class);
        startActivity(intent);

    }

    public void Update(View view) {

        gotoUrl("https://sites.google.com/view/prometheus/projects/smear");

    }

    public void Feedback(View view) {
        gotoUrl("https://forms.gle/NLngACN4ngnFHszt7");

    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }

    public void logout(View view) {
        Intent intent = new Intent(CatAdmin.this,MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }



}