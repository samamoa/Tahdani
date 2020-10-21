package com.example.thadani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class halftwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halftwo);
        ImageButton half =findViewById(R.id.yyyyes);
        half.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(halftwo.this,bravo.class);
                i.putExtra("level","half two");
                startActivity(i);
            }
        });
        ImageButton wrong =findViewById(R.id.nooooooo);
        wrong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent u=new Intent(halftwo.this,gameover.class);
                startActivity(u);
            }
        });

    }
}