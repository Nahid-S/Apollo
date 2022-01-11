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

public class ListBus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_bus);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ListView resultListView = (ListView) findViewById(R.id.result_listview);
        HashMap<String, String> nameAddress = new HashMap<>();
        nameAddress.put("Dhanmondi <> DSC","Time: 4.00 PM, 2:40 PM,\n5.20 PM, 9.10 PM");
        nameAddress.put("Uttara - Rajlokkhi <> DSC\n","Time: 4.00 PM, 2:40 PM,\n5.20 PM, 9.10 PM");
        nameAddress.put("Tongi College Gate <> DSC","Time: 2:40 PM, 2:40 PM\n9.10 PM");
        nameAddress.put("ECB Chattor <> Mirpur <> DSC","Time: 2:40 PM(Mirpur 10 only\n5.20 PM, 5.20 PM");
        nameAddress.put("DSC>MC","Time: 4.00 PM \nPossible Bus No:27,3,9 \nStaff: Mr. Nayon Khan (01713493085)");
        nameAddress.put("MC>DSC>MC","Time: 2.00 PM \nPossible Bus No:11,7,8 \nStaff: Mr. Main Uddin (01713493082)");
        nameAddress.put("DSC>Mirpur>DSC","Time: 4.00 PM \nPossible Bus No:27 \nStaff: Mr. Md. Nurul Amin (01733944956)");


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

    public void gotoBus(View view) {
        startActivity(new Intent(ListBus.this,CatBus.class));
    }

    public void gotoHome(View view) {
        startActivity(new Intent(ListBus.this,HomeActivity.class));
    }
}