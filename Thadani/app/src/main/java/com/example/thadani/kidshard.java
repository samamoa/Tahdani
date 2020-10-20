package com.example.thadani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class kidshard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kidshard);
        ImageButton help =findViewById(R.id.helpbutton);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m=new Intent(kidshard.this,helpkids.class);
                startActivity(m);
            }
        });
        ImageButton hard =findViewById(R.id.hardbutton2);
        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(kidshard.this,kidshardtwo.class);
                startActivity(i);
            }
        });
        ImageButton wrong =findViewById(R.id.hardbutton);
        wrong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent u=new Intent(kidshard.this,gameover.class);
                startActivity(u);
            }
        });
        ImageButton wrongtwo =findViewById(R.id.hardbutton3);
        wrongtwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m=new Intent(kidshard.this,gameover.class);
                startActivity(m);
            }
        });


    }
}