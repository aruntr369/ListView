package com.arun.listview;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    private static final String TAG = "Main Acivity 2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d(TAG, "onCreate: Started");
        ListView mListView =(ListView) findViewById(R.id.listview);

        Person john = new Person("john","12-4-1999","male");
        Person john1 = new Person("john1","12-4-1998","male");
        Person john2 = new Person("john2","12-4-1999","female");
        Person john3 = new Person("john3","12-4-1999","male");
        Person john4 = new Person("john4","12-4-1999","male");
        Person john5 = new Person("john5","12-4-1999","male");
        Person john6 = new Person("john6","12-4-1999","male");
        Person john7 = new Person("john7","12-4-1999","female");
        Person john8 = new Person("john8","12-4-1999","male");
        Person john9 = new Person("john9","12-4-1999","male");
        Person john0 = new Person("john0","12-4-1999","male");
        Person john11 = new Person("john11","12-4-1999","male");
        Person john12 = new Person("john12","12-4-1999","male");
        Person john13 = new Person("john13","12-4-1999","male");
        Person john14 = new Person("john14","12-4-1999","male");
        Person john15 = new Person("john15","12-4-1999","male");
        Person john16 = new Person("john16","12-4-1997","male");
        Person john17 = new Person("john17","12-4-1995","male");
        Person john18 = new Person("john18","12-4-1995","male");

        //add thw person to an ArryList
        ArrayList<Person> peoplelist=new  ArrayList<>();
        peoplelist.add(john);
        peoplelist.add(john1);
        peoplelist.add(john2);
        peoplelist.add(john3);
        peoplelist.add(john4);
        peoplelist.add(john5);
        peoplelist.add(john6);
        peoplelist.add(john7);
        peoplelist.add(john8);
        peoplelist.add(john9);
        peoplelist.add(john0);
        peoplelist.add(john11);
        peoplelist.add(john12);
        peoplelist.add(john13);
        peoplelist.add(john14);
        peoplelist.add(john15);
        peoplelist.add(john16);
        peoplelist.add(john17);
        peoplelist.add(john18);

        PersonListAdapter adapter =new  PersonListAdapter(this,R.layout.adapter_view_layout,peoplelist);
        mListView.setAdapter(adapter);

    }
}