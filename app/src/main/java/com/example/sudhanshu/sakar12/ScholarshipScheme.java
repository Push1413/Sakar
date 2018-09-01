package com.example.sudhanshu.sakar12;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ScholarshipScheme extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scholarship_scheme);
    }
    public void openscholar(View view){
        Intent browse = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mhrd.gov.in/idmi"));
        startActivity(browse);
    }
}
