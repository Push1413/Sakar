package com.example.sudhanshu.sakar12;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import android.view.View;
import android.widget.GridLayout;

public class Agri extends AppCompatActivity {
    GridLayout mainGrid1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agricultureandfarmerwelfare);
        mainGrid1 =  findViewById(R.id.grid);
        setSingleEvent(mainGrid1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void setSingleEvent(GridLayout mainGrid) {
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            final int set = i;
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(set==0){
                        Intent intent = new Intent(Agri.this,FasalBima.class);
                        startActivity(intent);
                    }
                    else if(set == 1){
                        Intent intent = new Intent(Agri.this,KrishiVikas.class);
                        startActivity(intent);
                    }
                    else if(set == 2){
                        Intent intent = new Intent(Agri.this,KrishiVikas.class);
                        startActivity(intent);
                    }
                    else if(set ==3){
                        Intent intent = new Intent(Agri.this,KrishiVikas.class);
                        startActivity(intent);
                    }
                }
            });

        }
    }
}
