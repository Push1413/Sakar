package com.example.sudhanshu.sakar12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;

public class Electronics extends AppCompatActivity {
    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronics);
        mainGrid = (GridLayout) findViewById(R.id.greedy);
        setSingleEvent(mainGrid);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void setSingleEvent(GridLayout mainGrid) {
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            final int fine = i;
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(fine==0){
                        Intent intent = new Intent(Electronics.this,PooledFinace.class);
                        startActivity(intent);
                    }
                    else if(fine == 1){
                        Intent intent = new Intent(Electronics.this,FasalBima.class);
                        startActivity(intent);
                    }
                    else if(fine == 2){
                        Intent intent = new Intent(Electronics.this,MidMeal.class);
                        startActivity(intent);
                    }
                    else if(fine ==3){
                        Intent intent = new Intent(Electronics.this,JDY.class);
                        startActivity(intent);
                    }
                }
            });

        }
    }
}
