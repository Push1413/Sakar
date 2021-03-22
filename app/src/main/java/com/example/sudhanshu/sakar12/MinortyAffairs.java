package com.example.sudhanshu.sakar12;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import android.view.View;
import android.widget.GridLayout;

public class MinortyAffairs extends AppCompatActivity {
    GridLayout mainGrid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minortyaffairs);
        mainGrid = (GridLayout) findViewById(R.id.gridminor);
        setSingleEvent(mainGrid);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void setSingleEvent(GridLayout mainGrid) {
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            final int f3 = i;
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(f3==0){
                        Intent intent = new Intent(MinortyAffairs.this,ScholarshipScheme.class);
                        startActivity(intent);
                    }
                    else if(f3 == 1){
                        Intent intent = new Intent(MinortyAffairs.this,ScholarshipScheme.class);
                        startActivity(intent);
                    }
                    else if(f3 == 2){
                        Intent intent = new Intent(MinortyAffairs.this,ScholarshipScheme.class);
                        startActivity(intent);
                    }
                    else if(f3 ==3){
                        Intent intent = new Intent(MinortyAffairs.this,ScholarshipScheme.class);
                        startActivity(intent);
                    }
                }
            });

        }
    }
}
