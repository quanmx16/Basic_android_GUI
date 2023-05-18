package com.example.lab1_maixuanquan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity4 extends AppCompatActivity {

    FloatingActionButton switchToActivity2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        switchToActivity2 = findViewById(R.id.fab);
        switchToActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchActivities();
            }
        });

    }
    private void switchActivities() {
        Intent switchActivityIntent = new Intent(this, MainActivity5.class);
        startActivity(switchActivityIntent);
    }
}