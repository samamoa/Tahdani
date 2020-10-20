package com.example.thadani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class helpkids extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpkids);
        ImageButton answer = findViewById(R.id.chancebutton);
        answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent(helpkids.this, kidshardtwo.class);
                startActivity(p);
            }
        });
        ImageButton nexttime = findViewById(R.id.chancebutton2);
        nexttime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent(helpkids.this, gameover.class);
                startActivity(p);
            }
        });
    }
}