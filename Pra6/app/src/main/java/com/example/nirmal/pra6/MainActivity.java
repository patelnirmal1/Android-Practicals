package com.example.nirmal.pra6;

import android.support.v7.app.*;
import android.widget.*;
import android.os.*;
import android.view.*;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.TextView;


public class MainActivity extends AppCompatActivity   {

       EditText email,pass;
    Button chk,clr;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText)findViewById(R.id.email);
        pass = (EditText)findViewById(R.id.pass);
        chk = (Button)findViewById(R.id.chk);
        clr = (Button)findViewById(R.id.clr);
        result = (TextView)findViewById(R.id.result);
        chk.setEnabled(false);

        pass.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                String s1,s2;
                s1= email.getText().toString();
                s2= pass.getText().toString();

                if(s1.equals("admin@gmail.com") && s2.equals("pass")){
                    chk.setEnabled(true);
                }
                else
                {
                    chk.setEnabled(false);
                }

            }
        });

        chk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result.setText("Login Done");
                result.setVisibility(View.VISIBLE);
            }
        });
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email.setText("");
                pass.setText("");
                result.setVisibility(View.INVISIBLE);
                chk.setEnabled(false);
            }
        });
    }
}

