package com.example.sudhanshu.sakar12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;

public class Urban extends AppCompatActivity {
    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_housingandurbanaffairs);
        mainGrid =  findViewById(R.id.gl);
        setSingleEvent(mainGrid);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void setSingleEvent(GridLayout mainGrid) {
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            final int g = i;
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(g==0){
                        Intent intent = new Intent(Urban.this,PooledFinace.class);
                        startActivity(intent);
                    }
                    else if(g == 1){
                        Intent intent = new Intent(Urban.this,PooledFinace.class);
                        startActivity(intent);
                    }
                    else if(g == 2){
                        Intent intent = new Intent(Urban.this,PooledFinace.class);
                        startActivity(intent);
                    }
                    else if(g ==3){
                        Intent intent = new Intent(Urban.this,PooledFinace.class);
                        startActivity(intent);
                    }
                }
            });

        }

    }
}
