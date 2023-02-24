package com.example.foodapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import org.jetbrains.annotations.Nullable;

public class adultorkidmeals extends AppCompatActivity {
    private Button btnSubmit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adultorkidmeals);
        Button Adults = findViewById(R.id.btnAdults);
        Adults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(adultorkidmeals.this,menucatagories.class));
            }
        });
        Button Kids = findViewById(R.id.btnKids);
        Kids.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(adultorkidmeals.this,menucatagories2.class));
            }
        });

    }
}
