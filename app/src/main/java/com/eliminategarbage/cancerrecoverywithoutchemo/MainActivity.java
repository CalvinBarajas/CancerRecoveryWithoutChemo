package com.eliminategarbage.cancerrecoverywithoutchemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ////////////// BUTTON 1 -- INTRODUCTION ///////////////////////

        //Find your view
        Button introduction = (Button) findViewById(R.id.introduction);

        //Assign a listener to the button
        introduction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Start your second activity
                Intent intent = new Intent(MainActivity.this, Introduction.class);
                startActivity(intent);
            }
        });

        ////////////// BUTTON 2 -- WHY ME ///////////////////////

        //Find your view
        Button whyMe = (Button) findViewById(R.id.why_me);

        //Assign a listener to the button
        whyMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Start your second activity
                Intent intent = new Intent(MainActivity.this, WhyMe.class);
                startActivity(intent);
            }
        });

        ////////////// BUTTON 3 -- FIND PROVIDER ///////////////////////

        //Find your view
        Button findProvider = (Button) findViewById(R.id.find_provider);

        //Assign a listener to the button
        findProvider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Start your second activity
                Intent intent = new Intent(MainActivity.this, FindProvider.class);
                startActivity(intent);
            }
        });

        ////////////// BUTTON 4 -- LIFESTYLE CHANGES ///////////////////////

        //Find your view
        Button lifestyleChanges = (Button) findViewById(R.id.lifestyle_changes);

        //Assign a listener to the button
        lifestyleChanges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Start your second activity
                Intent intent = new Intent(MainActivity.this, LifestyleChanges.class);
                startActivity(intent);
            }
        });

        ////////////// BUTTON 5 -- RECOVERY ///////////////////////

        //Find your view
        Button recovery = (Button) findViewById(R.id.recovery);

        //Assign a listener to the button
        recovery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Start your second activity
                Intent intent = new Intent(MainActivity.this, Recovery.class);
                startActivity(intent);
            }
        });

    }

}
