package com.oop_laba__2.TVS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button1, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button_main_register_confirmation);
        button2 = findViewById(R.id.button_main_filters);
        button3 = findViewById(R.id.button_main_share_collection);

        button1.setOnClickListener(view -> {
            Intent register = new Intent(MainActivity.this, RegisterConfirmation.class);
            startActivity(register);
        });

        button2.setOnClickListener(view -> {
            Intent register = new Intent(MainActivity.this, Filters.class);
            startActivity(register);
        });

        button3.setOnClickListener(view -> {
            Intent register = new Intent(MainActivity.this, News.class);
            startActivity(register);
        });
    }
}