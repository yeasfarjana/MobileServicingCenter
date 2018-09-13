package com.farjanayeasmin.mobileservicingcenter;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashAnimActivity extends AppCompatActivity {

    TextView txtMblAnimation;
    private static int splashTimeOut=4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_anim);

        txtMblAnimation=findViewById(R.id.txt_AnimMbl);

        txtMblAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //load animation or initialize
                Animation rotate= AnimationUtils.loadAnimation(SplashAnimActivity.this,R.anim.rotate);
                txtMblAnimation.startAnimation(rotate);

            }
        });

        txtMblAnimation.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                txtMblAnimation.clearAnimation();
                return true;
            }
        });

        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(SplashAnimActivity.this,MobileBrandActivity.class);
                startActivity(i);
                finish();
            }
        },splashTimeOut);
    }
}
