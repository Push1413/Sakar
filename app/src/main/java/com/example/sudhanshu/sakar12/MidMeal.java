package com.example.sudhanshu.sakar12;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MidMeal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mid_meal);
    }
    public void openmeal(View view){
        Intent browse = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mdm.nic.in/"));
        startActivity(browse);
    }
}
