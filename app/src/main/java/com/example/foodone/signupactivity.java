package com.example.foodone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class signupactivity extends AppCompatActivity {
    AppCompatButton btnsignupuser,btnsignupcompany;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signupactivity);

        btnsignupcompany=findViewById(R.id.btnsigupcompany);
        btnsignupuser=findViewById(R.id.btnsigupuser);

        btnsignupcompany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(signupactivity.this,companysignup.class);
                startActivity(i1);


            }
        });

        btnsignupuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(signupactivity.this,usersignupactivity.class);
                startActivity(i2);

            }
        });


    }
}