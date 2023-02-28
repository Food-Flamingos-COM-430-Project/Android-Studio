package com.example.foodapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class creamytomatoadult extends AppCompatActivity {
    private Button btnReturn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.creamytomatoadult);

        Button Return = findViewById(R.id.btnReturn);
        Return.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(creamytomatoadult.this, appitizersadult.class));
            }
        });
    }
}