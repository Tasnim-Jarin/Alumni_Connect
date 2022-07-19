package com.prpt.alumniconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {
    EditText login_email, login_pass;
    Button login_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login_email=findViewById(R.id.login_email);
        login_pass=findViewById(R.id.login_pass);
        login_button=findViewById(R.id.login_button);
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signInWithEmailAndPassword(login_email.getText().toString(), login_pass.getText().toString());
            }
        });
    }
}