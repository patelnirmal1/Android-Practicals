package com.example.nirmal.pra3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    EditText email;
    EditText pass;
    Button chk;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        email = (EditText) findViewById(R.id.email);
        pass = (EditText) findViewById(R.id.pass);
        chk = (Button) findViewById(R.id.chk);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv1.setVisibility(View.INVISIBLE);
        chk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (email.getText().toString().equals("admin") && pass.getText().toString().equals("admin"))
                {
                    tv1.setVisibility(View.VISIBLE);
                    tv1.setText("Login Succesfully");
                }
                else
                {
                    tv1.setVisibility(View.INVISIBLE);
                    Toast.makeText(getApplicationContext(),"Login Failed",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
