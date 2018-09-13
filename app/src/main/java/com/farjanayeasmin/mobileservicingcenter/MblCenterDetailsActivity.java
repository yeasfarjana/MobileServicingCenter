package com.farjanayeasmin.mobileservicingcenter;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MblCenterDetailsActivity extends AppCompatActivity {

    ImageView imgRes;
    TextView txtName, txtDesc;
    Button btnCell,btnMap;

    String mobilenumber[] = {"01713384333", "01713384332", "01713384301", "01713541919", "01713384302", "01728585858", " 01818111541", " 1713529828"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mbl_center_details);

        imgRes = findViewById(R.id.img_res);
        txtName = findViewById(R.id.txt_name);
        txtDesc = findViewById(R.id.txt_desc);
        btnCell=findViewById(R.id.btn_cell);
        btnMap=findViewById(R.id.btn_map);

        String getName = getIntent().getExtras().getString("center_name");

        if (getName.equals("one")) {
            imgRes.setImageResource(R.drawable.nkshop1);
            txtName.setText("Bashundhara city shopping complex");
            txtDesc.setText("Address: Level 3, Block B, Shops 1,2,3,4.\n" +
                    "Bashundhara city shopping complex, panthopath, Dhaka 4000\n\nHours: Open 10:00AM Closes 11:30PM\n\nMobile-"+mobilenumber[0]);
            btnCell.setText("CALL");
            btnMap.setText("MAP LOCATION");

            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[0]));
                    if (ActivityCompat.checkSelfPermission(MblCenterDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    ActivityCompat#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for ActivityCompat#requestPermissions for more details.
                        return;
                    }
                    startActivity(intent);
                }
            });
            btnMap.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(MblCenterDetailsActivity.this,MapsActivity.class);
                    intent.putExtra("latitude",22.338400);
                    intent.putExtra("longitude",91.831680);
                    intent.putExtra("name","Bashundhara city shopping complex");
                    startActivity(intent);
                }
            });

        } else if (getName.equals("two")) {
            imgRes.setImageResource(R.drawable.nkshop1);
            txtName.setText("Dhanmondi Prince Plaza");
            txtDesc.setText("Address: Dhanmondi Prince Plaza,5th Floor, 4/2 Sobhanbag, Mirpur road\n" +
                    "Dhanmondi,Dhaka 4000\n\nHours: Open 10.00AM Closes 11:30PM\n\nMobile-"+mobilenumber[1]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[1]));
                    if (ActivityCompat.checkSelfPermission(MblCenterDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    ActivityCompat#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for ActivityCompat#requestPermissions for more details.
                        return;
                    }
                    startActivity(intent);
                }
            });

            btnMap.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(MblCenterDetailsActivity.this,MapsActivity.class);
                    intent.putExtra("latitude",-15.774610);
                    intent.putExtra("longitude",-58.310902);
                    intent.putExtra("name","Dhanmondi Prince Plaza");
                    startActivity(intent);
                }
            });

        } else if (getName.equals("three")) {
            imgRes.setImageResource(R.drawable.nkshop1);
            txtName.setText("North tower Shopping Complex");
            txtDesc.setText("Address: North tower Commercial Shopping Complex,5th Floor, Shop 503, Plot 107, Sector 7, Uttara, Dhaka 1230, Dhaka 4000\n\nHours: Closes soon: 10PM ⋅ Opens 10AM Thu\n\nMobile" +mobilenumber[2]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[2]));
                    if (ActivityCompat.checkSelfPermission(MblCenterDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    ActivityCompat#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for ActivityCompat#requestPermissions for more details.
                        return;
                    }
                    startActivity(intent);
                }
            });

            btnMap.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(MblCenterDetailsActivity.this,MapsActivity.class);
                    intent.putExtra("latitude",-36.340970);
                    intent.putExtra("longitude",-56.740320);
                    intent.putExtra("name","North tower Shopping Complex");
                    startActivity(intent);
                }
            });

        } else if (getName.equals("four")) {
            imgRes.setImageResource(R.drawable.nkshop1);
            txtName.setText("Dynasty Tower");
            txtDesc.setText("Address: Plot 1, Road 12, Block C, Section 6, Pallabi, Mirpur, Dhaka 4000\n\nHours: Open 9.00AM Closes 11:59PM\n\nMobile-"+mobilenumber[3]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[3]));
                    if (ActivityCompat.checkSelfPermission(MblCenterDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    ActivityCompat#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for ActivityCompat#requestPermissions for more details.
                        return;
                    }
                    startActivity(intent);
                }
            });
            btnMap.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(MblCenterDetailsActivity.this,MapsActivity.class);
                    intent.putExtra("latitude",42.138190);
                    intent.putExtra("longitude",24.758370);
                    intent.putExtra("name","Dynasty Tower");
                    startActivity(intent);
                }
            });

        }
        else if (getName.equals("five")) {
            imgRes.setImageResource(R.drawable.nkshop1);
            txtName.setText("Tropicana Tower");
            txtDesc.setText("Address: 5th Floor, 45 Topkhana road,Paltan, Dhaka 4000\n\nHours: Closes  11PM ⋅ Opens 12PM Thu\n\nMobile-"+mobilenumber[4]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[4]));
                    if (ActivityCompat.checkSelfPermission(MblCenterDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    ActivityCompat#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for ActivityCompat#requestPermissions for more details.
                        return;
                    }
                    startActivity(intent);
                }
            });
            btnMap.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(MblCenterDetailsActivity.this,MapsActivity.class);
                    intent.putExtra("latitude",50.614500);
                    intent.putExtra("longitude",5.552470);
                    intent.putExtra("name","Tropicana Tower");
                    startActivity(intent);
                }
            });

        }
        else if (getName.equals("six")) {
            imgRes.setImageResource(R.drawable.nkshop1);
            txtName.setText("Molly capita Center");
            txtDesc.setText("Address: 76 Gulshan Avenue, 2nd Floor, Dhaka  4000\n\nHours: Closes  11PM ⋅ Opens 12PM Thu\n\nMobile-"+mobilenumber[5]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[5]));
                    if (ActivityCompat.checkSelfPermission(MblCenterDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    ActivityCompat#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for ActivityCompat#requestPermissions for more details.
                        return;
                    }
                    startActivity(intent);
                }
            });
            btnMap.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(MblCenterDetailsActivity.this,MapsActivity.class);
                    intent.putExtra("latitude",19.023024);
                    intent.putExtra("longitude",95.651181);
                    intent.putExtra("name","Molly capita Center");
                    startActivity(intent);
                }
            });

        }
        else if (getName.equals("seven")) {
            imgRes.setImageResource(R.drawable.nkshop1);
            txtName.setText("Mahtab Plaza");
            txtDesc.setText("Address: Mahtab Plaza, Under Ground Bazar Bus-Stand,Savar, Dhaka 4000\n\nHours: Closes  11PM ⋅ Opens 12PM Thu\n\nMobile-"+mobilenumber[6]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[6]));
                    if (ActivityCompat.checkSelfPermission(MblCenterDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    ActivityCompat#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for ActivityCompat#requestPermissions for more details.
                        return;
                    }
                    startActivity(intent);
                }
            });
            btnMap.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(MblCenterDetailsActivity.this,MapsActivity.class);
                    intent.putExtra("latitude",29.235620);
                    intent.putExtra("longitude",-81.046180);
                    intent.putExtra("name","Mahtab Plaza");
                    startActivity(intent);
                }
            });

        }
        else if (getName.equals("eight")) {
            imgRes.setImageResource(R.drawable.nkshop1);
            txtName.setText("Nokia Care");
            txtDesc.setText("Address: 76/A Choto Bazar, 1st Floor Mymensingh, Dhaka 4203\n\nHours: Closes  11PM ⋅ Opens 12PM Thu\n\nMobile-"+mobilenumber[7]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[7]));
                    if (ActivityCompat.checkSelfPermission(MblCenterDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    ActivityCompat#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for ActivityCompat#requestPermissions for more details.
                        return;
                    }
                    startActivity(intent);
                }
            });
            btnMap.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(MblCenterDetailsActivity.this,MapsActivity.class);
                    intent.putExtra("latitude",22.364673);
                    intent.putExtra("longitude",91.8249207);
                    intent.putExtra("name","Nokia Care");
                    startActivity(intent);
                }
            });

        }

    }
}
