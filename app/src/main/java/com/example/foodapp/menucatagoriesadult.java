package com.example.foodapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class menucatagoriesadult extends AppCompatActivity {
private Button btnSubmit;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menucatagories);

        Button Italian = findViewById(R.id.btnSubmit6);
        Italian.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(menucatagoriesadult.this, page1.class));
            }
        });
        Button Kids = findViewById(R.id.btnSubmit7);
        Kids.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(menucatagoriesadult.this, page2.class));
            }

        });
    }
}

