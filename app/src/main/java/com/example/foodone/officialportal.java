package com.example.foodone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class officialportal extends AppCompatActivity {
    AppCompatButton btncheck;
    EditText oet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_officialportal);
        btncheck=findViewById(R.id.btncheck);
        oet=findViewById(R.id.oet);
        btncheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String code = oet.getText().toString();
                if (TextUtils.isEmpty(code)) {
                    Toast.makeText(officialportal.this, "empty field", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(officialportal.this, showrequests.class);
                    startActivity(intent);
                }
            }
        });
    }
}