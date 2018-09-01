package com.example.sudhanshu.sakar12;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JDY extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jdy);
    }
    public void openjdy(View view){
        Intent browse = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sbi.co.in/portal/web/agriculture-banking/pmjdy-gallery"));
        startActivity(browse);
    }
}
