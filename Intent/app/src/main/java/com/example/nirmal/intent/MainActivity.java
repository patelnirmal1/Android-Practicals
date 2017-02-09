package com.example.nirmal.intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view)
    {

        Intent i = new Intent(this,Activity2.class);

        EditText FirstInput = (EditText)findViewById(R.id.FirstInput);
        String msg=FirstInput.getText().toString();
        i.putExtra("FirstMessage",msg);
        startActivity(i);




    }

}
