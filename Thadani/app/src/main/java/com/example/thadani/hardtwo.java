package com.example.thadani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class hardtwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hardtwo);
        ImageButton help =findViewById(R.id.helpbutton4);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m=new Intent(hardtwo.this,helptwwwo.class);
                startActivity(m);
            }
        });
        ImageButton hard =findViewById(R.id.rightbutton5);
        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(hardtwo.this,endbravo.class);
                startActivity(i);
            }
        });
        ImageButton wrong =findViewById(R.id.wrongbutton7);
        wrong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent u=new Intent(hardtwo.this,gameover.class);
                startActivity(u);
            }
        });
        ImageButton wrongtwo =findViewById(R.id.hardbutton3);
        wrongtwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m=new Intent(hardtwo.this,gameover.class);
                startActivity(m);
            }
        });
    }
}