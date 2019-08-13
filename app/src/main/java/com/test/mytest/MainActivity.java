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
    }

    public void ChangetoGreen(View view)
    {
        constraintLayout.setBackgroundColor(Color.GREEN);
    }

    public void ChangetoGray(View view)
    {
        constraintLayout.setBackgroundColor(Color.GRAY);
    }
}
