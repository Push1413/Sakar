package com.example.sudhanshu.sakar12;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BetiBachao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beti_bachao);
    }
    public void openbrowser(View view){
        Intent browse = new Intent(Intent.ACTION_VIEW, Uri.parse("http://wcd.nic.in/bbbp-schemes"));
        startActivity(browse);
    }
}
