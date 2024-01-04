package com.example.foodone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class companyportal extends AppCompatActivity {
    AutoCompleteTextView atv2;
    AppCompatButton btnrequest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_companyportal);

        btnrequest=findViewById(R.id.btnrequest);
        atv2=findViewById(R.id.atv2);

        String arr[]={"Madhapur",
                "Gachibowli","Kondapur","Nallagandla","kaimnagar","khammam","kamareddy","narsapur","medak","chintal","Kukatpally","Manikonda","Jubilee Hills","Banjara Hills","Behumpet","Miyapur"};

        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.select_dialog_item,arr);
        atv2.setThreshold(1);
        atv2.setAdapter(adapter);

        btnrequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(companyportal.this,response.class);
                startActivity(intent);
            }
        });
    }
}