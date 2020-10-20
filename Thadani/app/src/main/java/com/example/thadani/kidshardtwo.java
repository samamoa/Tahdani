package com.example.thadani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class kidshardtwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kidshardtwo);
        ImageButton help =findViewById(R.id.helpbutton2);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m=new Intent(kidshardtwo.this,helpkidstwo.class);
                startActivity(m);
            }
        });
        ImageButton hard =findViewById(R.id.yeah);
        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(kidshardtwo.this,bravo.class);
                startActivity(i);
            }
        });
        ImageButton wrong =findViewById(R.id.wronganswer);
        wrong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent u=new Intent(kidshardtwo.this,gameover.class);
                startActivity(u);
            }
        });
        ImageButton wrongtwo =findViewById(R.id.wronganswer2);
        wrongtwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m=new Intent(kidshardtwo.this,gameover.class);
                startActivity(m);
            }
        });

    }
}