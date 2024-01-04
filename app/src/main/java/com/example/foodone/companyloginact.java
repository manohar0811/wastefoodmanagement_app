package com.example.foodone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class companyloginact extends AppCompatActivity {
    EditText etcompanyname,etcompanypass;
    AppCompatButton btncompanylogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_companyloginact);
        etcompanyname=findViewById(R.id.etcompanyname);
        etcompanypass=findViewById(R.id.etcompanypass);
        btncompanylogin=findViewById(R.id.btncompanylogin);

        btncompanylogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String namec = etcompanyname.getText().toString();
                String passc = etcompanypass.getText().toString();
                if (TextUtils.isEmpty(namec) || TextUtils.isEmpty(passc)) {
                    Toast.makeText(companyloginact.this, "empty fields", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(companyloginact.this, companyportal.class);
                    startActivity(intent);

                }
            }
        });
    }
}