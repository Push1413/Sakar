package com.example.sudhanshu.sakar12;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MaitriVandana extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maitri_vandana);
    }
    public void openbvan(View view){
        Intent browse = new Intent(Intent.ACTION_VIEW, Uri.parse("http://wcd.nic.in/schemes-listing/2405"));
        startActivity(browse);
    }
}
