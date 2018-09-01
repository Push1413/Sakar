package com.example.sudhanshu.sakar12;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash_Main extends AppCompatActivity {
    private static int SPLASH_TIME =2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__main);
        getSupportActionBar().setTitle("               Welcome To SAKAR");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(Splash_Main.this,Login.class);
                startActivity(homeIntent);
                finish();
            }
        },SPLASH_TIME);
    }
}
