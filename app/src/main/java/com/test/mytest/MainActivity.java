package com.test.mytest;

import android.graphics.Color;
import android.nfc.Tag;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{

    private String TAG = MainActivity.class.getCanonicalName();
    private ConstraintLayout constraintLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        constraintLayout = findViewById(R.id.cview);
        Button button = findViewById(R.id.button);
        Button button1 = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Color changed to gray");
                constraintLayout.setBackgroundColor(Color.GRAY);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Color changed to green");
                constraintLayout.setBackgroundColor(Color.GREEN);
            }
        });

    }

}
