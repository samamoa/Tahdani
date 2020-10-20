package com.example.thadani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class kidswatertwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kidswatertwo);
        ImageButton lastwater = findViewById(R.id.truebutton);
        lastwater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent(kidswatertwoActivity.this, bravo.class);
                startActivity(p);
            }
        });
        ImageButton wrong =findViewById(R.id.fbutton);
        wrong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m=new Intent(kidswatertwoActivity.this,gameover.class);
                startActivity(m);
            }
        });
    }}