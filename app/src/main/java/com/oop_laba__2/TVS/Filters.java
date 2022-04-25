package com.oop_laba__2.TVS;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class Filters extends AppCompatActivity {

    private ImageButton layout_img_btm;
    private LinearLayout img_btm;

    @Override
    public void onBackPressed(){
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filters);
        img_btm = findViewById(R.id.filters_back);
        layout_img_btm = findViewById(R.id.filters_back_btn);
        img_btm.setOnClickListener(view -> onBackPressed());
        layout_img_btm.setOnClickListener(view -> onBackPressed());
    }
}