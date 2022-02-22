package com.arun.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list =(ListView) findViewById(R.id.thelist);

        List<String> names = new ArrayList<>();
        names.add("raj");
        names.add("roy");
        names.add("amal");
        names.add("ajith");
        names.add("steve");

        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.list_item_layout,names);
        list.setAdapter(adapter);
    }
}