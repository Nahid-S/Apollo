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

public class ListHall extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_hall);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ListView resultListView = (ListView) findViewById(R.id.result_listview);
        HashMap<String, String> nameAddress = new HashMap<>();
        nameAddress.put("Electrician","Name: Rajib,\nNumber:01883183601");
        nameAddress.put("Lift Operator\n","Name: Atfan,\nNumber:01745663930");
        nameAddress.put("IT Management","Name: Dilip,\nNumber:01779588173");
        nameAddress.put("Electrician","Name: Sahadar,\nNumber:01841840335");
        nameAddress.put("Canteen","Name: Sakib,\nNumber:01721920394");
        nameAddress.put("Grap Food","Name: Sohan,\nNumber:01521448442");



        List<HashMap<String, String>> listItem = new ArrayList<>();
        SimpleAdapter adapter = new SimpleAdapter(this, listItem, R.layout.list_item,new String[]{"First Line","Second Line"},
                new int[]{R.id.text1, R.id.text2});

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
        startActivity(new Intent(ListHall.this,HomeActivity.class));
    }

    public void gotoHall(View view) {
        startActivity(new Intent(ListHall.this,CatHall.class));
    }
}