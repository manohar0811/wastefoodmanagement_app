package com.example.foodone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class needactivity extends AppCompatActivity {
    AutoCompleteTextView atv;
    AppCompatButton btnsearch2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_needactivity);
        btnsearch2=findViewById(R.id.btnsearch2);
        atv=findViewById(R.id.atv);

        String arr[]={"Madhapur",
                "Gachibowli","Kondapur","Nallagandla","kaimnagar","khammam","kamareddy","narsapur","medak","chintal","Kukatpally","Manikonda","Jubilee Hills","Banjara Hills","Behumpet","Miyapur"};

        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.select_dialog_item,arr);
        atv.setThreshold(1);
        atv.setAdapter(adapter);

        btnsearch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String res=atv.getText().toString();
                if(TextUtils.isEmpty(res)){
                    Toast.makeText(needactivity.this, "empty field", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent=new Intent(needactivity.this,searchresult.class);
                    startActivity(intent);
                }
            }
        });
    }
}