package com.example.software;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ListFood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_food);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ListView resultListView = (ListView) findViewById(R.id.result_food);

        HashMap<String, String> nameAddress = new HashMap<>();
        nameAddress.put(" Kacchi ","Half \nPrice: 80 \nAvailability (12 PM to 3 PM)");
        nameAddress.put(" Kacchi","Full \nPrice: 150 \nAvailability (12 PM to 3 PM)");
        nameAddress.put(" Chicken Polaw","Full \nPrice: 60 \nAvailability (12 PM to 3 PM)");
        nameAddress.put(" Egg Polaw","Full \nPrice: 40 \nAvailability (12 PM to 3 PM)");
        nameAddress.put(" Teheri","Half \nPrice: 80 \nAvailability (Special)");
        nameAddress.put(" Roast Polaw","Full \nPrice: 100 \nAvailability (Special)");
        nameAddress.put(" Soft Drinks","Cola \nPrice: 15/30/60 \nAvailability (9 AM to 8PM)");
        nameAddress.put(" Beverage","Juice \nPrice: 10/15/20/30/40 \nAvailability (9 AM to 8PM)");
        nameAddress.put(" Chocolate","Packs \nPrice: 120 \nAvailability (12 PM to 3 PM)");


        List<HashMap<String, String>> listItem = new ArrayList<>();
        SimpleAdapter adapter = new SimpleAdapter(this, listItem, R.layout.list_food_item,new String[]{"First Line","Second Line"},
                new int[]{R.id.textF1, R.id.textF2});

        Iterator it = nameAddress.entrySet().iterator();
        while (it.hasNext())
        {
            HashMap<String,String> resultsMap = new HashMap<>();
            Map.Entry pair = (Map.Entry)it.next();
            resultsMap.put("First Line", pair.getKey().toString());
            resultsMap.put("Second Line", pair.getValue().toString());
            listItem.add(resultsMap);

        }

        resultListView.setAdapter(adapter);


    }

    public void gotoHome(View view) {

        Intent intent = new Intent(ListFood.this,HomeActivity.class);
        startActivity(intent);

    }

    public void gotoFood(View view) {
        Intent intent = new Intent(ListFood.this,CatShop.class);
        startActivity(intent);
    }
}