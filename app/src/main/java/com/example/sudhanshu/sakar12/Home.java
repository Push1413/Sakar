package com.example.sudhanshu.sakar12;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.google.android.material.navigation.NavigationView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;
import android.app.AlertDialog;
import android.content.DialogInterface;

public class Home extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener
         {
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    private GridLayout mainGrid1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mainGrid1 = findViewById(R.id.mainGrid);
        setSingleEvent(mainGrid1);

        mDrawerLayout = findViewById(R.id.drawerlayout);
        mToggle = new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open,R.string.close);

        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("SELECT MINISTRY");
      NavigationView navigationView = findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);
    }
             @Override
             public void onBackPressed() {
                 new AlertDialog.Builder(this)
                         .setIcon(android.R.drawable.ic_dialog_alert)
                         .setTitle("Closing Activity")
                         .setMessage("Are you sure you want to close the app?")
                         .setPositiveButton("Yes", new DialogInterface.OnClickListener()
                         {
                             @Override
                             public void onClick(DialogInterface dialog, int which) {
                                 finish();
                             }

                         })
                         .setNegativeButton("No", null)
                         .show();
             }

    private void setSingleEvent(GridLayout mainGrid) {
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(finalI==0){
                     //   Toast.makeText(Home.this,"0",Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(Home.this,Agri.class);
                        startActivity(intent);
                    }
                    else if(finalI == 1){
                  //      Toast.makeText(Home.this,"1",Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(Home.this,RuralDevelopment.class);
                        startActivity(intent);
                    }
                    else if(finalI == 2){
                      //  Toast.makeText(Home.this,"0",Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(Home.this,Women.class);
                        startActivity(intent);
                    }
                    else if(finalI ==3){
                      //  Toast.makeText(Home.this,"0",Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(Home.this,HumanDevelopment.class);
                        startActivity(intent);
                    }
                    else if(finalI ==4){
                        //Toast.makeText(Home.this,"0",Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(Home.this,Finance.class);
                        startActivity(intent);
                    }
                    else if(finalI ==5){
                       // Toast.makeText(Home.this,"0",Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(Home.this,MinortyAffairs.class);
                        startActivity(intent);
                    }
                    else if(finalI ==6){
                       // Toast.makeText(Home.this,"0",Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(Home.this,Electronics.class);
                        startActivity(intent);
                    }
                    else if(finalI ==7){
                      //  Toast.makeText(Home.this,"0",Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(Home.this,Urban.class);
                        startActivity(intent);
                    }


                }
            });

        }


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (mToggle.onOptionsItemSelected(item)){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

   @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.nav_scheme){
            Intent intent = new Intent(Home.this,Home.class);
            startActivity(intent);
            }
        if(id==R.id.nav_setting){
            Toast.makeText(this,"Update is coming!",Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.nav_share){
            Intent intent = new Intent(Home.this,Share_nav.class);
            startActivity(intent);
        }

      if(id==R.id.nav_logout){
          SharedPreferences sharedPreferences = getSharedPreferences(Config.SHARED_PREF_NAME, Context.MODE_PRIVATE);
          SharedPreferences.Editor editor = sharedPreferences.edit();
          editor.clear();
          editor.commit();
          Intent intent = new Intent(Home.this,Login.class);
           startActivity(intent);
           finish();
      }
      if(id==R.id.nav_FeedBack){
          Intent intent = new Intent(Home.this,FeedBack_nav.class);
          startActivity(intent);
      }
      if(id==R.id.nav_RateUs){
            Intent intent = new Intent(Home.this,Rating_nav.class);
            startActivity(intent);
      }
       return false;
    }
}
