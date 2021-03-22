package com.example.sudhanshu.sakar12;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import android.view.View;
import android.widget.GridLayout;

public class RuralDevelopment extends AppCompatActivity {
    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruraldevelopment);
        mainGrid = (GridLayout) findViewById(R.id.gridrural);
        openScheme(mainGrid);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void openScheme(GridLayout mainGrid) {
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            final int finalj = i;
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(finalj==0){
                        Intent intent = new Intent(RuralDevelopment.this,DDUKaushalyaYojana.class);
                        startActivity(intent);
                    }
                   else if(finalj == 1){
                        Intent intent = new Intent(RuralDevelopment.this,Manrega.class);
                        startActivity(intent);
                    }
                    else if(finalj == 2){
                        Intent intent = new Intent(RuralDevelopment.this,Manrega.class);
                        startActivity(intent);
                    }
                    else if(finalj ==3){
                        Intent intent = new Intent(RuralDevelopment.this,Manrega.class);
                        startActivity(intent);
                    }
                }
            });

        }
    }
}
