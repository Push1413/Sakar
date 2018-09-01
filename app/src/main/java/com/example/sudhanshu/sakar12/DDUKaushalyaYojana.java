package com.example.sudhanshu.sakar12;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DDUKaushalyaYojana extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ddukaushalya_yojana);
    }
    public void openweb(View view){
        Intent browse = new Intent(Intent.ACTION_VIEW, Uri.parse("http://ddugky.gov.in/apply-now"));
        startActivity(browse);
    }
}
