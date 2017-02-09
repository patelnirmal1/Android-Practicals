package com.example.nirmal.pra7;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.*;
//import android.view.View.OnFocusChangeListener;
import android.widget.*;
//import android.widget.EditText;
//import android.widget.TextView;
//import android.widget.Toast;

public class MainActivity extends Activity implements OnFocusChangeListener {
    EditText uname;
    EditText pwd;
    Button btn1;
    TextView t1;
    int flag1=0,flag2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uname=(EditText)findViewById(R.id.editText1);
        pwd=(EditText)findViewById(R.id.editText2);
        btn1=(Button)findViewById(R.id.button1);


        uname.setOnFocusChangeListener(this);
        pwd.setOnFocusChangeListener(this);


    }

    @Override
    public void onFocusChange(View arg0, boolean arg1) {
        // TODO Auto-generated method stub
        if(arg0.getId()
                ==R.id.editText1)
        {
            if(!uname.isFocused())
            {
                if(uname.getText().toString().equals("admin@gmail.com"))
                {
                    flag1=1;
                }
                else
                {
                    flag1=0;
                    uname.setError("Invalid username");
                }
            }
        }
        else
        {
            if(!pwd.isFocused())
            {
                if(pwd.getText().toString().equals("admin"))
                {
                    flag2=1;
                }
                else
                {
                    flag2=0;
                    pwd.setError("Invalid password");
                }
            }
        }

        if(flag1==1 && flag2==1)
        {
            btn1.setEnabled(true);
        }
        else
        {
            btn1.setEnabled(false);
        }

        btn1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Toast.makeText(MainActivity.this, "LoginSucess Full",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
