package com.example.sudhanshu.sakar12;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class InfraMinority extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infra_minority);
    }
    public void open1(View view){
        Intent browse = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mhrd.gov.in/idmi"));
        startActivity(browse);
    }
}
