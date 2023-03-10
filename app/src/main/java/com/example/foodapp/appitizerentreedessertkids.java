package com.example.foodapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import org.jetbrains.annotations.Nullable;

public class appitizerentreedessertkids extends AppCompatActivity {
    private Button btnMeal;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appitizerentredessertadult);
        Button Return = findViewById(R.id.btnReturn);
        Button Appitizer = findViewById(R.id.btnMeal);
        Button Entree = findViewById(R.id.btnMeal2);
        Button Dessert = findViewById(R.id.btnMeal3);

        Return.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(appitizerentreedessertkids.this, adultorkidmeals.class));
            }
        });
        //button to select appetizer for kids
        Appitizer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(appitizerentreedessertkids.this,appitizerskids.class));
            }
        });
        //button to select entree for kids
        Entree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(appitizerentreedessertkids.this,entreekids.class));
            }
        });
        //button to select dessert for kids
        Dessert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(appitizerentreedessertkids.this,dessertkids.class));
            }
        });

    }
}
