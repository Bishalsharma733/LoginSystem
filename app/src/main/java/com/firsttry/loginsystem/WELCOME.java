package com.firsttry.loginsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class WELCOME extends AppCompatActivity {
    TextView displayEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        displayEmail= findViewById(R.id.displayEmail);
        String email = getIntent().getStringExtra("email");
        String password = getIntent().getStringExtra("password");
        displayEmail.setText(email);
    }
}