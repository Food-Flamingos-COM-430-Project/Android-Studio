package com.example.foodapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
public class menucatagories extends Activity {
    private Button btnSubmit;
    private boolean Italian = true;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menucatagories);

        btnSubmit = findViewById(R.id.btnSubmit);
        txtLoginInfo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (Italian) {
                    Italian = true;
                    btnSubmit.setText("Italian");
                }


        }


    }
}