package com.example.thadani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class helpkidstwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpkidstwo);
        ImageView answer = findViewById(R.id.imageButton3);
        answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent(helpkidstwo.this, hardanswertwo.class);
                startActivity(p);
            }
        });
        ImageView tryagain = findViewById(R.id.imageButton2);
        tryagain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent(helpkidstwo.this,tryagain.class);
                startActivity(p);
            }
        });

    }
}