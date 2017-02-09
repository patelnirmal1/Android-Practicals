package com.example.nirmal.demo1;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.graphics.Color;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout mylayout = new RelativeLayout(this);
        final Button myButton = new Button(this);
        myButton.setText("Click Here");

        mylayout.setBackgroundColor(Color.WHITE);
        myButton.setBackgroundColor(Color.GRAY);

        RelativeLayout.LayoutParams buttonDetails =
                new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT
                );

        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);
        mylayout.addView(myButton,buttonDetails);

        final EditText uname = new EditText(this);

        myButton.setId(1);
        uname.setId(2);

        RelativeLayout.LayoutParams uDetails =
                new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT
                );
        uDetails.addRule(RelativeLayout.ABOVE,myButton.getId());
        uDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        uDetails.addRule(RelativeLayout.CENTER_VERTICAL);
        uDetails.setMargins(0,0,0,50);

        mylayout.addView(uname,uDetails);

        final TextView tv = new TextView(this);
        final RelativeLayout.LayoutParams tDetails =
                new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT
                );
        tDetails.addRule(RelativeLayout.BELOW,myButton.getId());
        tDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        tDetails.addRule(RelativeLayout.CENTER_VERTICAL);
        tDetails.setMargins(0,50,0,0);
        mylayout.addView(tv,tDetails);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String result = uname.getText().toString();
                tv.setText(result);
            }
        });

        Resources r = getResources();
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,500, r.getDisplayMetrics());
        uname.setWidth(px);
        setContentView(mylayout);
    }
}
