package com.example.foodone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class userlogiinact extends AppCompatActivity {

    AppCompatButton btnuserlogin;
    EditText etuserphone,etuserpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userlogiinact);
        etuserpass=findViewById(R.id.etuserpass);
        etuserphone=findViewById(R.id.etuserphone);
        btnuserlogin=findViewById(R.id.btnuserlogin);
        btnuserlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone = etuserphone.getText().toString();
                String passw = etuserpass.getText().toString();
                if (TextUtils.isEmpty(phone) || TextUtils.isEmpty(passw)) {
                    Toast.makeText(userlogiinact.this, "empty fields", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(userlogiinact.this, userportal.class);
                    startActivity(intent);

                }
            }
        });
    }
}