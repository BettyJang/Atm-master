package com.bettyjang.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CityActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private String[] cities;
    private String TAG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);
        ListView city = (ListView) findViewById(R.id.city);
        cities = new String[]{"基隆市"," 新北市","台北市"};
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,
                cities);
        city.setAdapter(adapter);
        city.setOnItemClickListener(this);
        //ListView練習
        /* ListView listview = (ListView) findViewById(R.id.list);
        final String[] data = {"AA" , "BB" , "CC"};
        ArrayAdapter adapter2 = new ArrayAdapter(this,
                android.R.layout.simple_expandable_list_item_1,data);
        listview.setAdapter(adapter2);
        listview.setOnItemClickListener(this);*/
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        Log.d(TAG, "onItemClick:  " +position+"/"+cities[position] );

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
