package com.example.foodapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import org.jetbrains.annotations.Nullable;

public class entreekids extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entreekids);
        Button Return = findViewById(R.id.btnReturn);
        Button Meal1 = findViewById(R.id.btnMeal1);
        Button Meal2 = findViewById(R.id.btnMeal2);
        Button Meal3 = findViewById(R.id.btnMeal3);
        Button Meal4 = findViewById(R.id.btnMeal4);
        Return.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(entreekids.this, appitizerentreedessertkids.class));
            }
        });
        Meal1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(entreekids.this, macandcheesebites.class));
            }
        });
        Meal2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(entreekids.this, pigsinablanket.class));
            }
        });
        Meal3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(entreekids.this, corndogs.class));
            }
        });
        Meal4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(entreekids.this, turkeyjambalaya.class));
            }
        });
    }
}