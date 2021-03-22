package com.example.sudhanshu.sakar12;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Manrega extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manrega);
    }
    public void openman(View view){
        Intent browse = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.nrega.nic.in/netnrega/mgnrega_new/Nrega_home.aspx"));
        startActivity(browse);
    }
}
