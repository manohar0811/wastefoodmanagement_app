package com.example.foodone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class usersignupactivity extends AppCompatActivity {
    AppCompatButton btnsignup2;
    EditText etpass,etname,etphone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usersignupactivity);

        btnsignup2=findViewById(R.id.btnsignup2);
        etpass=findViewById(R.id.etpass);
        etphone=findViewById(R.id.etphone);
        etname=findViewById(R.id.etname);

        btnsignup2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name=etname.getText().toString();
                String phone=etphone.getText().toString();
                String pass=etpass.getText().toString();
                if(TextUtils.isEmpty(name)||TextUtils.isEmpty(phone)||TextUtils.isEmpty(pass)){
                    Toast.makeText(usersignupactivity.this, "empty fields", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(usersignupactivity.this, "account created !", Toast.LENGTH_SHORT).show();
                    Intent ii = new Intent(usersignupactivity.this, MainActivity.class);
                    startActivity(ii);
                   finish();
                }
            }
        });
    }
}