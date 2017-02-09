package com.example.nirmal.prac8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText num;
    Button reverse,clear;
    int temp,reversenum =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        num = (EditText) findViewById(R.id.number);
        reverse = (Button) findViewById(R.id.reverse);
        clear = (Button) findViewById(R.id.clear);

        reverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = Integer.parseInt(num.getText().toString());
                reversenum =0;
                while( temp != 0 )
                {
                    reversenum = reversenum * 10;
                    reversenum = reversenum + temp%10;
                    temp = temp/10;
                }

                Toast.makeText(getApplicationContext(),String.valueOf(reversenum), Toast.LENGTH_LONG).show();
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num.setText("");
            }
        });
    }

}
