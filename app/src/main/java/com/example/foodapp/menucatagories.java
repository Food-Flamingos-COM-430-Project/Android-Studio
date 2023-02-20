package com.example.foodapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class menucatagories extends Activity {
    private Button btnSubmit;
    @Override
    protected void onCreate (@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menucatagories);
    }
    private void onClick(View view){
        boolean italian = true;
        if (italian){
            italian = true;
            btnSubmit.setText("Italian");
            startActivity(new Intent(menucatagories.this,page1.class));
        }
    }

}
