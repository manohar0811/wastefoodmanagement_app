package com.example.foodone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class excessactivity extends AppCompatActivity {

    AppCompatButton btnsubmit;
    EditText etaddr,etquantity,ettime,ettype;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_excessactivity);

        btnsubmit=findViewById(R.id.btnsubmit);
        ettype=findViewById(R.id.ettype);
        ettime=findViewById(R.id.ettime);
        etquantity=findViewById(R.id.etquantity);
        etaddr=findViewById(R.id.etaddr);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String type=ettype.getText().toString();
                String time=ettime.getText().toString();
                String quan=etquantity.getText().toString();
                String addr=etaddr.getText().toString();
                if(TextUtils.isEmpty(type)||TextUtils.isEmpty(time)||TextUtils.isEmpty(quan)||TextUtils.isEmpty(addr)){
                    Toast.makeText(excessactivity.this, "empty fields", Toast.LENGTH_SHORT).show();
                }else {
                    Intent intent = new Intent(excessactivity.this, response.class);
                    startActivity(intent);
                }
            }
        });
    }
}