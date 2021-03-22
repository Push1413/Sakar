package com.example.sudhanshu.sakar12;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import android.view.View;
import android.widget.GridLayout;

public class HumanDevelopment extends AppCompatActivity {
    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_humanresourcedevelopment);
        mainGrid = (GridLayout) findViewById(R.id.gridh);
        setSingleEvent(mainGrid);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void setSingleEvent(GridLayout mainGrid) {
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            final int f2 = i;
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(f2==0){
                        Intent intent = new Intent(HumanDevelopment.this,MidMeal.class);
                        startActivity(intent);
                    }
                    else if(f2 == 1){
                        Intent intent = new Intent(HumanDevelopment.this,InfraMinority.class);
                        startActivity(intent);
                    }
                    else if(f2 == 2){
                        Intent intent = new Intent(HumanDevelopment.this,InfraMinority.class);
                        startActivity(intent);
                    }
                    else if(f2 ==3){
                        Intent intent = new Intent(HumanDevelopment.this,InfraMinority.class);
                        startActivity(intent);
                    }
                }
            });

        }
    }
}
