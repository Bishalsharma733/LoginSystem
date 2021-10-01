package com.firsttry.loginsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView email;
    TextView password;
    TextView login;

    public static final String MyPREFERENCES = "MyPrefs" ;
    public static final String Email = "email";

    SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         email = findViewById(R.id.email);
         password = findViewById(R.id.password);
         login = findViewById(R.id.button);

        login.setOnClickListener(view -> {
            String userPassword = email.getText().toString();
            String userEmail = email.getText().toString();

            if ((userEmail.isEmpty())||(userPassword.length()<8)){
                Toast.makeText(MainActivity.this, "Email must be defined and password must be 8 characters long", Toast.LENGTH_SHORT).show();
            }
            else{
                Intent intent = new Intent(MainActivity.this,WELCOME.class);
                intent.putExtra("email",userEmail);
                 this.sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(Email, userEmail);
                editor.apply();
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString(Email, userEmail);
                editor.commit();

                startActivity(intent);
            }




        });

    }
}
