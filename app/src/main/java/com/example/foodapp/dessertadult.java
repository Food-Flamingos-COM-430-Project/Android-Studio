package com.example.foodapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import org.jetbrains.annotations.Nullable;

public class dessertadult extends AppCompatActivity {
    private Button btnMeal;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dessertadult);
        Button Return = findViewById(R.id.btnReturn);
        Button Meal1 = findViewById(R.id.btnMeal1);
        Button Meal2 = findViewById(R.id.btnMeal2);
        Button Meal3 = findViewById(R.id.btnMeal3);
        Return.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(dessertadult.this, appitizerentreedessertadult.class));
            }
        });
        Meal1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(dessertadult.this, appitizerentreedessertadult.class));
            }
        });
        Meal2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(dessertadult.this, appitizerentreedessertadult.class));
            }
        });
        Meal3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(dessertadult.this, appitizerentreedessertadult.class));
            }
        });
    }
}