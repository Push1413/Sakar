package com.example.sudhanshu.sakar12;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import android.view.View;
import android.widget.GridLayout;

public class Finance extends AppCompatActivity {
    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finance);
        mainGrid = (GridLayout) findViewById(R.id.greep);
        setSingleEvent(mainGrid);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void setSingleEvent(GridLayout mainGrid) {
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            final int f1 = i;
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (f1 == 0) {
                        Intent intent = new Intent(Finance.this, JDY.class);
                        startActivity(intent);
                    } else if (f1 == 1) {
                        Intent intent = new Intent(Finance.this, BimaSuraksha.class);
                        startActivity(intent);
                    } else if (f1 == 2) {
                        Intent intent = new Intent(Finance.this, StartupIndia.class);
                        startActivity(intent);
                    } else if (f1 == 3) {
                        Intent intent = new Intent(Finance.this, StartupIndia.class);
                        startActivity(intent);
                    }
                }
            });

        }
    }
}
