package com.eliminategarbage.cancerrecoverywithoutchemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Recovery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recovery);

        // Return home button on every sub-page, takes you back home when you click btn.
        Button btnReturnHome = (Button) findViewById(R.id.return_me_home);
        btnReturnHome.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

    }

    /*
     * The following METHOD is executed when someone clicks on one of the radio buttons
     * in the RECOVERY sub-level page.  This section is added to illustrate that the
     * author has a good grasp of if-then-else statements.  This has been formatted as a quiz
     * question.
     */

    // This is where we process The Quiz Results radio-button results
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // object to be used to display what healthcare provider they need to have
        TextView textView = (TextView) findViewById(R.id.recovery_bottom_text);

        // Example of if-then-else statement usage
        // Check which radio button was clicked and display text accordingly
        if ((view.getId() == R.id.radio_five_hundred) && checked) {
            textView.setText("Try Again");
        } else if ((view.getId() == R.id.radio_one_thousand) && checked) {
            textView.setText("Try Again");
        } else if ((view.getId() == R.id.radio_fifteen_hundred) && checked) {
            textView.setText("Correct!!");
        }

    }

}
