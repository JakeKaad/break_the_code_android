package com.epicodus.breakthecode.ui;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.epicodus.breakthecode.R;

import org.w3c.dom.Text;


public class EnrollActivity extends ActionBarActivity {

    private EditText mEmailText;
    private EditText mNameText;
    private Button mSubmitButton;
    private TextView mThankYouText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enroll);

        mEmailText = (EditText) findViewById(R.id.emailText);
        mNameText = (EditText) findViewById(R.id.nameText);
        mSubmitButton = (Button) findViewById(R.id.submitButton);
        mThankYouText = (TextView) findViewById(R.id.thankYouLabel);

        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mNameText.getText().toString();
                String email = mEmailText.getText().toString();
                String message = String.format(
                        "Hello %s, thank you for interest in Break the Code!\n\n" +
                                "We have sent more information an email to %s",
                        name,
                        email);
                mThankYouText.setText(message);
                mEmailText.setVisibility(View.INVISIBLE);
                mNameText.setVisibility(View.INVISIBLE);
                mSubmitButton.setVisibility(View.INVISIBLE);
                mThankYouText.setVisibility(View.VISIBLE);
            }
        });

    }
}
