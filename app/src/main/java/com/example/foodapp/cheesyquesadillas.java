package com.example.foodapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class cheesyquesadillas extends AppCompatActivity {
    private Button btnReturn;
//button to choose cheesy quesadillas
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cheesyquesadillas);

        Button Return = findViewById(R.id.btnReturn);

        Return.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(cheesyquesadillas.this, dessertkids.class));
            }
        });
    }
}