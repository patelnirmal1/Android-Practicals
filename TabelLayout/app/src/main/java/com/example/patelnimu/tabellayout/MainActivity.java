package com.example.patelnimu.tabellayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button btn_add,btn_sub,btn_mul,btn_div,clr;
    int x,y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        btn_add = (Button) findViewById(R.id.btn_add);
        btn_sub=(Button) findViewById(R.id.btn_sub);
        btn_mul = (Button) findViewById(R.id.btn_mul);
        btn_div = (Button) findViewById(R.id.btn_div);
        clr = (Button) findViewById(R.id.clr);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int temp1;
                String temp2;
                x = Integer.parseInt(num1.getText().toString());
                y = Integer.parseInt(num2.getText().toString());

                temp1 = x+y;
                temp2 = String.valueOf(temp1);
                Toast.makeText(getApplicationContext(),temp2,Toast.LENGTH_LONG).show();
//                add.setText(temp2);
            }
        });

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int temp3;
                String temp4;
                temp3 = x-y;
                temp4 = String.valueOf(temp3);
                Toast.makeText(getApplicationContext(),temp4,Toast.LENGTH_LONG).show();
            }
        });

        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int temp5;
                String temp6;
                temp5 = x*y;
                temp6 = String.valueOf(temp5);
                Toast.makeText(getApplicationContext(),temp6,Toast.LENGTH_LONG).show();
            }
        });

        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float temp7;
                String temp8;
                temp7 = x/y;
                temp8 = String.valueOf(temp7);
                Toast.makeText(getApplicationContext(),temp8,Toast.LENGTH_LONG).show();
            }
        });

        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1.setText("");
                num2.setText("");
            }
        });
    }

}

