package com.example.thadani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class half extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_half);
        ImageButton half =findViewById(R.id.half);
        half.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(half.this,halftwo.class);
                startActivity(i);
            }
        });
        ImageButton wrong =findViewById(R.id.half2);
        wrong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent u=new Intent(half.this,gameover.class);
                startActivity(u);
            }
        });
        ImageButton wrongtwo =findViewById(R.id.half3);
        wrongtwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m=new Intent(half.this,gameover.class);
                startActivity(m);
            }
        });

    }
}