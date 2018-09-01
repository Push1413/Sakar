package com.example.sudhanshu.sakar12;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;


public class Login extends AppCompatActivity implements View.OnClickListener{
    private EditText editTextEmail;
    private EditText editTextPassword;
    private Button buttonLogin;

    private boolean loggedIn = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        editTextEmail = (EditText) findViewById(R.id.emailid);
        editTextPassword = (EditText) findViewById(R.id.user_password);
        buttonLogin = findViewById(R.id.buttonl1);
        buttonLogin.setOnClickListener(this);
    }
    @Override
    public void onBackPressed(){
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Exit")
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
    @Override
    protected void onResume() {
        super.onResume();

        SharedPreferences sharedPreferences = getSharedPreferences(Config.SHARED_PREF_NAME,Context.MODE_PRIVATE);
        loggedIn = sharedPreferences.getBoolean(Config.LOGGEDIN_SHARED_PREF, false);


        //If we will get true
        if(loggedIn){
            //We will start the Profile Activity
            Intent intent = new Intent(Login.this, Home.class);
            startActivity(intent);
        }
    }

        private void Login(){
            final String email = editTextEmail.getText().toString().trim();
            final String password = editTextPassword.getText().toString().trim();

            //Creating a string request
            StringRequest stringRequest = new StringRequest(Request.Method.POST, Config.LOGIN_URL,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            //If we are getting success from server
                            if(response.equalsIgnoreCase(Config.LOGIN_SUCCESS)){
                                //Creating a shared preference
                              //  Toast.makeText(Login.this,response,Toast.LENGTH_LONG).show();
                                SharedPreferences sharedPreferences = Login.this.getSharedPreferences(Config.SHARED_PREF_NAME, Context.MODE_PRIVATE);

                                //Creating editor to store values to shared preferences
                                SharedPreferences.Editor editor = sharedPreferences.edit();

                                //Adding values to editor
                                editor.putBoolean(Config.LOGGEDIN_SHARED_PREF, true);
                                editor.putString(Config.EMAIL_SHARED_PREF, email);

                                //Saving values to editor
                                editor.commit();

                                //Starting profile activity
                                Intent intent = new Intent(Login.this, Home.class);
                                startActivity(intent);
                            }else{
                                //If the server response is not success
                                //Displaying an error message on toast
                                Toast.makeText(Login.this, "Invalid username or password", Toast.LENGTH_LONG).show();
                            }
                        }
                    },
                    new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            //You can handle error here if you want
                        }
                    }){
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {
                    Map<String,String> params = new HashMap<>();
                    //Adding parameters to request
                  //  Toast.makeText(Login.this,""+email,Toast.LENGTH_LONG).show();
                    params.put(Config.KEY_EMAIL, email);
                    params.put(Config.KEY_PASSWORD, password);

                    //returning parameter
                    return params;
                }
            };

            //Adding the string request to the queue
            RequestQueue requestQueue = Volley.newRequestQueue(this);
            requestQueue.add(stringRequest);
        }




    public void SignUpUser(View view){
        startActivity(new Intent(this,SignUp.class));
    }

    @Override
    public void onClick(View view) {
        Login();
    }

}
