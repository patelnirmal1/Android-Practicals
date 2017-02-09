package com.example.nirmal.intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Bundle data = getIntent().getExtras();
        TextView SecondText = (TextView)findViewById(R.id.SecondText);
        String mainMsg = data.getString("FirstMessage");

        SecondText.setText(mainMsg);

    }

    public void onClick2(View view)
    {
        Intent i2 = new Intent(this,MainActivity.class);
        startActivity(i2);
    }

}
