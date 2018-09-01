package com.example.sudhanshu.sakar12;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PooledFinace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pooled_finace);
    }
    public void openpool(View view){
        Intent browse = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.india.gov.in/pooled-finance-development-fund-scheme"));
        startActivity(browse);
    }
}
