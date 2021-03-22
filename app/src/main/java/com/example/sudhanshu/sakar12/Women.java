package com.example.sudhanshu.sakar12;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import android.view.View;
import android.widget.GridLayout;

public class Women extends AppCompatActivity {
    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_womanandchilddevelopment);
        mainGrid = (GridLayout) findViewById(R.id.gridw);
        setSingleEvent(mainGrid);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void setSingleEvent(GridLayout mainGrid) {
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            final int wo = i;
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(wo==0){
                        Intent intent = new Intent(Women.this,MaitriVandana.class);
                        startActivity(intent);
                    }
                    else if(wo == 1){
                        Intent intent = new Intent(Women.this,BetiBachao.class);
                        startActivity(intent);
                    }
                    else if(wo == 2){
                        Intent intent = new Intent(Women.this,MaitriVandana.class);
                        startActivity(intent);
                    }
                    else if(wo ==3){
                        Intent intent = new Intent(Women.this,BetiBachao.class);
                        startActivity(intent);
                    }
                }
            });

        }
    }
}
