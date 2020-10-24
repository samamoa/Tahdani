package com.example.thadani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class hardtwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hardtwo);
        ImageView help =findViewById(R.id.helpbutton4);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m=new Intent(hardtwo.this,helptwwwo.class);
                startActivity(m);
            }
        });
        ImageView hard =findViewById(R.id.rightbutton5);
        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(hardtwo.this,endbravo.class);
                startActivity(i);
            }
        });
        ImageView wrong =findViewById(R.id.wrongbutton7);
        wrong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent u=new Intent(hardtwo.this,gameover.class);
                startActivity(u);
            }
        });
        ImageView wrongtwo =findViewById(R.id.no);
        wrongtwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m=new Intent(hardtwo.this,gameover.class);
                startActivity(m);
            }
        });
    }
}