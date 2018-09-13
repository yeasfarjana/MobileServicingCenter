package com.farjanayeasmin.mobileservicingcenter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DivisionActivity extends AppCompatActivity {

    Button btnDhaka,btnCtg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division);

        btnDhaka=findViewById(R.id.btn_dhaka);
        btnCtg=findViewById(R.id.btn_ctg);

        btnDhaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(DivisionActivity.this,MobileCenterActivity.class);
                Toast.makeText(DivisionActivity.this, "Mobile Center of Dhaka", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
        btnCtg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DivisionActivity.this,MobileCenterActivity.class);
                Toast.makeText(DivisionActivity.this, "Mobile Center of Chattogram", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
    }
}
