package com.eliminategarbage.cancerrecoverywithoutchemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class FindProvider extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_provider);

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
     * in the FIND PROVIDER sub-level page.
     */

    // This is where we process FIND PROVIDER radio-button results
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // object to be used to display what healthcare provider they need to have
        TextView textView = (TextView) findViewById(R.id.fp_bottom_text);

        // Check which radio button was clicked and display text accordingly
        switch (view.getId()) {
            case R.id.radio_under_five:
                if (checked)
                    textView.setText(getString(R.string.radio_under_five));
                break;
            case R.id.radio_five_to_ten:
                if (checked)
                    textView.setText(getString(R.string.radio_five_to_ten));
                break;
            case R.id.radio_over_ten:
                if (checked)
                    textView.setText(getString(R.string.radio_over_ten));
                break;
        }
    }

}
