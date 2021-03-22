package com.example.sudhanshu.sakar12;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
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
import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.google.common.collect.Range;

import java.util.HashMap;
import java.util.Map;

public class SignUp extends AppCompatActivity {

    EditText sname,semailid,spassword,smobileno,sage,sstate;
    Button register;
    private AwesomeValidation awesomeValidation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);

        sname = (EditText) findViewById(R.id.signname);
        semailid = (EditText) findViewById(R.id.signemailid);
        spassword = (EditText) findViewById(R.id.signpassword);
        smobileno = (EditText) findViewById(R.id.signphone);
        sage = (EditText) findViewById(R.id.signage);
        sstate = (EditText)findViewById(R.id.signstate);
        register = (Button) findViewById(R.id.buttonsign);

        awesomeValidation.addValidation(this, R.id.signname, "^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$", R.string.nameerror);
        awesomeValidation.addValidation(this, R.id.signemailid, Patterns.EMAIL_ADDRESS, R.string.emailerror);
        awesomeValidation.addValidation(this, R.id.signphone, "^[2-9]{2}[0-9]{8}$", R.string.mobileerror);
        awesomeValidation.addValidation(this, R.id.signage, Range.closed(13, 60), R.string.ageerror);


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (awesomeValidation.validate()) {
                    Send();
                }
                else {
                    Toast.makeText(SignUp.this,"Enter correct credentials.",Toast.LENGTH_LONG).show();
                }
                }
        });

    }
    @Override
    public void onBackPressed(){
        Intent intent = new Intent(SignUp.this,Login.class);
        startActivity(intent);
        finish();
    }


    private void Send(){
        final String mobileNo = smobileno.getText().toString();
        final String name = sname.getText().toString();
        final String paswd = spassword.getText().toString();
        final String emai = semailid.getText().toString();
        final String age = sage.getText().toString();
        final String state = sstate.getText().toString();


        RequestQueue queue = Volley.newRequestQueue(SignUp.this);
        StringRequest request = new StringRequest(Request.Method.POST, Config.SIGNUP_URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                Toast.makeText(SignUp.this, "Admin:" + response, Toast.LENGTH_LONG).show();
                Log.i("My success", "" + response);
                SharedPreferences sharedPreferences = SignUp.this.getSharedPreferences(Config.SHARED_PREF_NAME, Context.MODE_PRIVATE);

                //Creating editor to store values to shared preferences
                SharedPreferences.Editor editor = sharedPreferences.edit();

                //Adding values to editor
                editor.putBoolean(Config.LOGGEDIN_SHARED_PREF, true);
                editor.putString(Config.EMAIL_SHARED_PREF, emai);
            //    editor.putString(Config.NAME_SHARED_PREF, name);
            //    editor.putString(Config.MOBILE_SHARED_PREF, mobileNo);

                //Saving values to editor
                editor.commit();

                startActivity(new Intent(SignUp.this,CompleteYourProfile1.class));
                finish();


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Toast.makeText(SignUp.this, "my error :" + error, Toast.LENGTH_LONG).show();
                Log.i("My error", "" + error);
            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {

                Map<String, String> map = new HashMap<String, String>();
                map.put("Name",name);
                map.put("Email", emai);
                map.put("Password", paswd);
                map.put("MobileNo", mobileNo);
                map.put("Age", age);
                map.put("State",state);
                return map;
            }
        };
        queue.add(request);


    }

    public void openlogin(View view) {
        Intent intent = new Intent(SignUp.this,Login.class);
        startActivity(intent);
        finish();
    }
}
