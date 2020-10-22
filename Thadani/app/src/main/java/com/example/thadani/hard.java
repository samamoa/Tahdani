package com.example.thadani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class hard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hard);
        ImageButton help =findViewById(R.id.helpbutton3);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m=new Intent(hard.this,hhhelp.class);
                startActivity(m);
            }
        });
        ImageButton hard =findViewById(R.id.rightbutton4);
        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(hard.this,hardtwo.class);
                startActivity(i);
            }
        });
        ImageButton wrong =findViewById(R.id.wrongbutton5);
        wrong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent u=new Intent(hard.this,gameover.class);
                startActivity(u);
            }
        });
        ImageButton wrongtwo =findViewById(R.id.wrongbutton6);
        wrongtwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m=new Intent(hard.this,gameover.class);
                startActivity(m);
            }
        });
    }
}