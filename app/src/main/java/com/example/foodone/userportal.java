package com.example.foodone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class userportal extends AppCompatActivity {

    AppCompatButton btnexcess,btnneed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userportal);

        btnexcess=findViewById(R.id.btnexcess);
        btnneed=findViewById(R.id.btnneed);

        btnexcess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(userportal.this,excessactivity.class);
                startActivity(intent);
            }
        });
        btnneed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(userportal.this,needactivity.class);
                startActivity(intent);
            }
        });
    }
}