package com.prpt.alumniconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Signup extends AppCompatActivity {
    EditText sign_firstname, sign_lastname, sign_email, sign_pass, sign_dept, sign_id, sign_batch, sign_session;
    Button signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        sign_firstname= findViewById(R.id.sign_firstname);
        sign_lastname= findViewById(R.id.sign_lastname);
        sign_email= findViewById(R.id.sign_email);
        sign_pass= findViewById(R.id.sign_pass);
        sign_dept= findViewById(R.id.sign_dept);
        sign_id = findViewById(R.id.sign_id);
        sign_batch= findViewById(R.id.sign_batch);
        sign_session= findViewById(R.id.sign_session);
        signup= findViewById(R.id.sign_button);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Signup_Item b= new Signup_Item();
                b.setFname(sign_firstname.getText().toString());
                b.setBatch(sign_batch.getText().toString());
                b.setLname(sign_lastname.getText().toString());
                b.setEmail(sign_email.getText().toString());
                b.setPass(sign_pass.getText().toString());
                b.setDept(sign_dept.getText().toString());
                b.setId(sign_id.getText().toString());
                b.setSession(sign_session.getText().toString());

            }
        });
    }
}