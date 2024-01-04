package com.example.foodone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    AppCompatButton btnuser,btncompany,btnofficial;
    TextView tvsigunup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvsigunup=findViewById(R.id.tvsignup);

        btncompany=findViewById(R.id.btncompany);
        btnuser=findViewById(R.id.btnuser);
        btnofficial=findViewById(R.id.btnofficial);

        btnuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,userlogiinact.class);
                startActivity(intent);
            }
        });
        btnofficial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,officialportal.class);
                startActivity(intent);
            }
        });
        btncompany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,companyloginact.class);
                startActivity(intent);
            }
        });

        tvsigunup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,signupactivity.class);
                startActivity(intent);
            }
        });
    }
}