package com.example.cper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        Thread td=new Thread(){
            @Override
            public void run() {
                super.run();
               try {
                   sleep(6000);
               }catch (Exception e){
                   e.printStackTrace();
               }finally {
                   Intent intent=new Intent(SplashActivity.this,MainActivity.class);
                   startActivity(intent);
                   finish();
               }
            }
        };td.start();
    }
}