package com.example.sudhanshu.sakar12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
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

public class CompleteYourProfile1 extends AppCompatActivity {
    Button done;
    EditText ccaste,caadhar,cdistrict,cpincode,nationality,email,cgender,cdisability,cms,cocuupation,cincome,ccategory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_your_profile);

        ccaste = findViewById(R.id.cast);
        caadhar = findViewById(R.id.adharno);
        cdistrict = findViewById(R.id.district);
        cpincode = findViewById(R.id.pincode);
        nationality = findViewById(R.id.natonality);
        email = findViewById(R.id.cemail);
        cgender = findViewById(R.id.gender);
        cdisability = findViewById(R.id.disability);
        cms =findViewById(R.id.ms);
        cocuupation = findViewById(R.id.occupation);
        cincome = findViewById(R.id.income);
        ccategory = findViewById(R.id.categorytext);
        done = findViewById(R.id.btndone);




        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendprofile();
            }
        });
    }
    @Override
    public void onBackPressed(){

    }

    private void sendprofile() {



    final String radio_gender = cgender.getText().toString();
    final String radio_MS = cms.getText().toString();
    final String radio_disability = cdisability.getText().toString();
    final String catogory = ccategory.getText().toString();
    final String occupation =cocuupation.getText().toString();
    final String income =cincome.getText().toString();
    final String caste = ccaste.getText().toString();
        final String aadhar = caadhar.getText().toString();
        final String district = cdistrict.getText().toString();
        final String pin = cpincode.getText().toString();
        final String nation = nationality.getText().toString();
        final String email1 = email.getText().toString();


        RequestQueue queue1 = Volley.newRequestQueue(CompleteYourProfile1.this);
        StringRequest request = new StringRequest(Request.Method.POST, Config.CSIGNUP_URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(CompleteYourProfile1.this, "Admin:" + response, Toast.LENGTH_LONG).show();
                Log.i("My success", "" + response);
                startActivity(new Intent(CompleteYourProfile1.this,Login.class));
                finish();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(CompleteYourProfile1.this, "my error :" + error, Toast.LENGTH_LONG).show();
                Log.i("My error", "" + error);
            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {

                Map<String, String> map = new HashMap<String, String>();
                map.put("AadhaarNo",aadhar);
                map.put("Religion",caste);
                map.put("District",district);
                map.put("Pincode",pin);
               map.put("Gender",radio_gender );
                map.put("Marital",radio_MS);
               map.put("Category",catogory);
                map.put("Nationality",nation);
                map.put("Income",income);
                map.put("Occupation",occupation);
              map.put("Disability",radio_disability);
                map.put("Email",email1);

                return map;
            }

        };
        queue1.add(request);
    }

}
