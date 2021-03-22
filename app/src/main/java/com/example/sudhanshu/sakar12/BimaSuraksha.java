package com.example.sudhanshu.sakar12;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BimaSuraksha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bima_suraksha);
    }
    public void opensite(View view){
        Intent browse = new Intent(Intent.ACTION_VIEW, Uri.parse("https://retail.onlinesbi.com/retail/login.htm"));
        startActivity(browse);
    }
}
