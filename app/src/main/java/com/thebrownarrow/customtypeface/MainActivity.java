package com.thebrownarrow.customtypeface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Chronometer;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup radioGroup = (RadioGroup)findViewById(R.id.rg_gender);
        Chronometer chronometer = (Chronometer)findViewById(R.id.chronometer);

        radioGroup.clearCheck();
        chronometer.start();
    }
}
