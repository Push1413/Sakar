package com.example.sudhanshu.sakar12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class Rating_nav extends AppCompatActivity {
    RatingBar ratingBar;
    Button submitRateButton;
    TextView rateDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_nav);

        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        submitRateButton = (Button) findViewById(R.id.ratingSubmitButton);
        rateDisplay = (TextView) findViewById(R.id.ratingDisplay);
        rateDisplay.setText("Rate:");
    }
    public void rateSubmit(View view) {
        String ratingValue = String.valueOf(ratingBar.getRating());
        rateDisplay.setText("Rate: " + ratingValue);
        Toast.makeText(getApplicationContext(), " You Rated: " + ratingValue, Toast.LENGTH_LONG).show();
    }
}
