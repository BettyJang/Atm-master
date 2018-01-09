package com.bettyjang.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class AddrActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addr);Spinner spCity = (Spinner) findViewById(R.id.sp_ct);
        final Spinner spArea = (Spinner) findViewById(R.id.sp_ar);
        String[] spCt = {"基隆市","新北市","台北市"};
        final String[] spAr = {"中正區","暖暖區","八堵區"};
        final String[] spAre = {"板橋區","新莊區","永和區"};
        final String[] spAreas = {"士林區","信義區","大安區"};
        ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,spCt);
        spCity.setAdapter(adapter);
        spCity.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0){
                    ArrayAdapter adapter = new ArrayAdapter(AddrActivity.this,
                            android.R.layout.simple_list_item_1,spAr);
                    spArea.setAdapter(adapter);
                }else if (position == 1){
                    ArrayAdapter adapter = new ArrayAdapter(AddrActivity.this,
                            android.R.layout.simple_list_item_1,spAre);
                    spArea.setAdapter(adapter);
                }else {
                    ArrayAdapter adapter = new ArrayAdapter(AddrActivity.this,
                            android.R.layout.simple_list_item_1,spAreas);
                    spArea.setAdapter(adapter);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}