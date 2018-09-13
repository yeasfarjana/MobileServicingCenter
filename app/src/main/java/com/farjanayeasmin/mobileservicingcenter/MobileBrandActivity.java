package com.farjanayeasmin.mobileservicingcenter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MobileBrandActivity extends AppCompatActivity {

    Button btnNokia,btnSamsung,btnHuawei,btnXiaomi,btnSymphony,btnOppo,btniPhone,btnWalton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_brand);

        btnNokia=findViewById(R.id.btn_nokia);
        btnSamsung=findViewById(R.id.btn_samsung);
        btnHuawei=findViewById(R.id.btn_huawei);
        btnXiaomi=findViewById(R.id.btn_xiaomi);
        btnSymphony=findViewById(R.id.btn_symphony);
        btnOppo=findViewById(R.id.btn_oppo);
        btniPhone=findViewById(R.id.btn_iphone);
        btnWalton=findViewById(R.id.btn_walton);



        btnNokia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MobileBrandActivity.this,DivisionActivity.class);
                Toast.makeText(MobileBrandActivity.this, "Dhaka or Chattogram", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
        btnSamsung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MobileBrandActivity.this,DivisionActivity.class);
                Toast.makeText(MobileBrandActivity.this, "Dhaka or Chattogram", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
        btnHuawei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MobileBrandActivity.this,DivisionActivity.class);
                Toast.makeText(MobileBrandActivity.this, "Dhaka or Chattogram", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
        btnXiaomi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MobileBrandActivity.this,DivisionActivity.class);
                Toast.makeText(MobileBrandActivity.this, "Dhaka or Chattogram", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });

        btnSymphony.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MobileBrandActivity.this,DivisionActivity.class);
                Toast.makeText(MobileBrandActivity.this, "Dhaka or Chattogram", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
        btnOppo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MobileBrandActivity.this,DivisionActivity.class);
                Toast.makeText(MobileBrandActivity.this, "Dhaka or Chattogram", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
        btniPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MobileBrandActivity.this,DivisionActivity.class);
                Toast.makeText(MobileBrandActivity.this, "Dhaka or Chattogram", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
        btnWalton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MobileBrandActivity.this,DivisionActivity.class);
                Toast.makeText(MobileBrandActivity.this, "Dhaka or Chattogram", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });


    }
}
