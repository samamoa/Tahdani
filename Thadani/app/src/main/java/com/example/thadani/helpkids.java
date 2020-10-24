package com.example.thadani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class helpkids extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpkids);
        ImageView answer = findViewById(R.id.chancebutton);
        answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent(helpkids.this, tryagain.class);
                startActivity(p);
            }
        });
        ImageView nexttime = findViewById(R.id.chancebutton2);
        nexttime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent(helpkids.this, answerhard.class);
                startActivity(p);
            }
        });
    }
}