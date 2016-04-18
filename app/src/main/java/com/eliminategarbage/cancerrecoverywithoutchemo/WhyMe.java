package com.eliminategarbage.cancerrecoverywithoutchemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WhyMe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_why_me);

        // Return home button on every sub-page, takes you back home when you click btn.
        Button btnReturnHome = (Button) findViewById(R.id.return_me_home);
        btnReturnHome.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
    }
}
