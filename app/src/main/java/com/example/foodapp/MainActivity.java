package com.example.foodapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    private EditText edtUsername, edtPassword, edtEmail;
    private Button btnSubmit;
    private TextView txtLoginInfo;
    private boolean isSigningUp = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //activity to create email, password, and username.
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        edtUsername = findViewById(R.id.edtUsername);
        //button to create new account
        btnSubmit = findViewById(R.id.btnSubmit);

        txtLoginInfo = findViewById(R.id.txtLoginInfo);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //activity for logging into app. This uses toast to display "Sorry, try again" when the wrong username or password is input.
                if (edtEmail.getText().toString().isEmpty() || edtPassword.getText().toString().isEmpty()) {
                    if (isSigningUp && edtUsername.getText().toString().isEmpty()) {
                        Toast.makeText(MainActivity.this, "Sorry, try again", Toast.LENGTH_SHORT).show();
                        return;

                    }
                }
                if (isSigningUp) {
                    handleSignUp();
                } else {
                    handleLogin();
                }
            }
        });

        txtLoginInfo.setOnClickListener(new View.OnClickListener() {
            //this allows the user to switch between logging in and creating an account
            @Override
            public void onClick(View view) {
                if (isSigningUp) {
                    isSigningUp = false;
                    edtUsername.setVisibility(View.GONE);
                    btnSubmit.setText("Log in");
                    txtLoginInfo.setText("Sign Up");
                } else {
                    isSigningUp = true;
                    edtUsername.setVisibility(View.VISIBLE);
                    btnSubmit.setText("Sign Up");
                    txtLoginInfo.setText("Existing Account?");
                }
            }
        });
    }
    //we used firebase for storing our username and passwords. Our firebase account is managed by Nathan and noah.
    //this is where the user creates their account.
    //using toast allows the text "Signed up successfully" to be displayed.
    private void handleSignUp() {
        FirebaseAuth.getInstance().createUserWithEmailAndPassword(edtEmail.getText().toString(), edtPassword.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(MainActivity.this, "Signed up successfully", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, task.getException().getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    //this allows the user to login using firebase.
    //we use toast here as well to display "Logged in successfully".
    private void handleLogin(){
        FirebaseAuth.getInstance().signInWithEmailAndPassword(edtEmail.getText().toString(),edtPassword.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    startActivity(new Intent(MainActivity.this,adultorkidmeals.class));
                    Toast.makeText(MainActivity.this, "Logged in successfully", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, task.getException().getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}