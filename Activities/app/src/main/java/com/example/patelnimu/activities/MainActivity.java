package com.example.patelnimu.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    String msg = "Android";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg,"The onCreate() method");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg,"The onStart() method");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(msg,"The onResume() method");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(msg,"The onPause() method");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg,"The onStop() method");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(msg,"The onDestroy() method");
    }
}
