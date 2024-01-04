package com.example.foodone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class companysignup extends AppCompatActivity {
    AppCompatButton btnsignup3;
    EditText etcname,etcaddress,etcpass,etcemail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_companysignup);

        btnsignup3=findViewById(R.id.btnsignup3);
        etcname=findViewById(R.id.etcname);
        etcemail=findViewById(R.id.etcemail);
        etcpass=findViewById(R.id.etcpass);
        etcaddress=findViewById(R.id.etcaddress);

        btnsignup3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cname=etcname.getText().toString();
                String cpass=etcpass.getText().toString();
                String cemail=etcemail.getText().toString();
                String caddress=etcaddress.getText().toString();

                if(TextUtils.isEmpty(cname)||TextUtils.isEmpty(cpass)||TextUtils.isEmpty(cemail)||TextUtils.isEmpty(caddress)){
                    Toast.makeText(companysignup.this, "empty fields", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(companysignup.this, "account created !", Toast.LENGTH_SHORT).show();
                    Intent ii = new Intent(companysignup.this, MainActivity.class);
                    startActivity(ii);
                    finish();

                }
            }
        });

    }

}