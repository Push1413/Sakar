package com.example.sudhanshu.sakar12;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FeedBack_nav extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback_nav);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Button startBtn = (Button) findViewById(R.id.sendEmail);
        startBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                sendEmail();
            }
        });
    }

    @SuppressLint("LongLogTag")
    protected void sendEmail() {
        Log.i("Send email", "");
        String[] TO = {"pratikgeca06@gmail.com"};
        String[] CC = {""};
        Intent emailIntent = new Intent(Intent.ACTION_SEND);

        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_CC, CC);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "App Feedback");
        emailIntent.putExtra(Intent.EXTRA_TEXT,"");

        try {
            startActivity(Intent.createChooser(emailIntent, "Send mail..."));

            Log.i("Finished sending email...", "");
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(FeedBack_nav.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
        }
    }
}