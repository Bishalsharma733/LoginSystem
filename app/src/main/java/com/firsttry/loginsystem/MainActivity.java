package com.firsttry.loginsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView email;
    TextView password;
    TextView login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         email = findViewById(R.id.email);
         password = findViewById(R.id.password);
         login = findViewById(R.id.button);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                String userEmail = email.getText().toString();
//                if (userEmail.isEmpty())
//                {
//                    Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
//                }
//                String userPassword = email.getText().toString();
//                if (userPassword.isEmpty())
//                {
//                    Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
//                }
//
//
//
//                Intent intent = new Intent(MainActivity.this,WELCOME.class);
//                startActivity(intent);
                String userPassword = email.getText().toString();
                String userEmail = email.getText().toString();

                if ((userEmail.isEmpty())||(userPassword.length()<8)){
                    Toast.makeText(MainActivity.this, "Email must be defined and password must be 8 characters long", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(MainActivity.this,WELCOME.class);
                    intent.putExtra("email",userEmail);
                    startActivity(intent);
                }




            }
        });

    }
}