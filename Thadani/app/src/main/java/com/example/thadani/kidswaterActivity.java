package com.example.thadani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class kidswaterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kidswater);
        ImageButton questwo = findViewById(R.id.yesbutton);
        questwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(kidswaterActivity.this, kidswatertwoActivity.class);
                startActivity(i);
            }
        });

        ImageButton wrong =findViewById(R.id.falsebutton);
        wrong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m=new Intent(kidswaterActivity.this,gameover.class);
                startActivity(m);
            }
        });

    }}