package com.example.thadani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class kidshalf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kidshalf);
        ImageButton half =findViewById(R.id.rightbutton);
        half.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(kidshalf.this,kidshalftwo.class);
                startActivity(i);
            }
        });
        ImageButton wrong =findViewById(R.id.wrongbutton);
      wrong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent u=new Intent(kidshalf.this,gameover.class);
                startActivity(u);
            }
        });
        ImageButton wrongtwo =findViewById(R.id.wrongbutton2);
        wrongtwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m=new Intent(kidshalf.this,gameover.class);
                startActivity(m);
            }
        });



    }
}