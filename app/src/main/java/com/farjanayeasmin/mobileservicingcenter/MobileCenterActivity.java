package com.farjanayeasmin.mobileservicingcenter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MobileCenterActivity extends AppCompatActivity {

    Button btnBashundhara,btnDhanmondi,btnUttara,btnMirpur,btnPaltan,btnGulshan,btnSavar,btnMymensingh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_center);

        btnBashundhara=findViewById(R.id.btn_bashundhara);
        btnDhanmondi=findViewById(R.id.btn_dhanmondi);
        btnUttara=findViewById(R.id.btn_uttara);
        btnMirpur=findViewById(R.id.btn_mirpur);
        btnPaltan=findViewById(R.id.btn_paltan);
        btnGulshan=findViewById(R.id.btn_gulshan);
        btnSavar=findViewById(R.id.btn_savar);
        btnMymensingh=findViewById(R.id.btn_mymensingh);

        btnBashundhara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MobileCenterActivity.this,MblCenterDetailsActivity.class);
                intent.putExtra("center_name","one");
                Toast.makeText(MobileCenterActivity.this, "Bashundhara city shopping complex", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
        btnDhanmondi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MobileCenterActivity.this,MblCenterDetailsActivity.class);
                intent.putExtra("center_name","two");
                Toast.makeText(MobileCenterActivity.this, "Dhanmondi Prince Plaza", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
        btnUttara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MobileCenterActivity.this,MblCenterDetailsActivity.class);
                intent.putExtra("center_name","three");
                Toast.makeText(MobileCenterActivity.this, "North tower Shopping Complex", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
        btnMirpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MobileCenterActivity.this,MblCenterDetailsActivity.class);
                intent.putExtra("center_name","four");
                Toast.makeText(MobileCenterActivity.this, "Dynasty Tower", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        btnPaltan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MobileCenterActivity.this,MblCenterDetailsActivity.class);
                intent.putExtra("center_name","five");
                Toast.makeText(MobileCenterActivity.this, "Tropicana Tower", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        btnGulshan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MobileCenterActivity.this,MblCenterDetailsActivity.class);
                intent.putExtra("center_name","six");
                Toast.makeText(MobileCenterActivity.this, "Molly capita Center", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        btnSavar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MobileCenterActivity.this,MblCenterDetailsActivity.class);
                intent.putExtra("center_name","seven");
                Toast.makeText(MobileCenterActivity.this, "Mahtab Plaza", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        btnMymensingh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MobileCenterActivity.this,MblCenterDetailsActivity.class);
                intent.putExtra("center_name","eight");
                Toast.makeText(MobileCenterActivity.this, "Nokia Care", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

    }
}
