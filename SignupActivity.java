package com.example.voteforwaste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class SignupActivity extends AppCompatActivity {

    TextInputEditText firstname;
    TextInputEditText lastname;
    TextInputEditText phonenumber;
    TextInputEditText password;
    TextInputEditText confirmpassword;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        firstname = (TextInputEditText)findViewById(R.id.signupfirstname);
        lastname = (TextInputEditText)findViewById(R.id.signuplastname);
        password = (TextInputEditText)findViewById(R.id.signuppassword);
        phonenumber = (TextInputEditText)findViewById(R.id.signupphonenumber);
        confirmpassword = (TextInputEditText)findViewById(R.id.signupconfirmpassword);
        register = findViewById(R.id.signupButton);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignupActivity.this,MainActivity.class));
            }
        });



    }
}
