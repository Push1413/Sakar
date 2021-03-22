package com.example.sudhanshu.sakar12;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Profile_nav extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_nav);
        Intent intent = getIntent();
        String name =intent.getStringExtra("username");
        String email =intent.getStringExtra("email");
        String mobileno =intent.getStringExtra("mobile");
        TextView textView = findViewById(R.id.nameb);
        TextView textView1 = findViewById(R.id.emailb);
        TextView textView2 = findViewById(R.id.phoneb);
        textView.setText(name);
        textView1.setText(email);
        textView2.setText(mobileno);

        }
}
