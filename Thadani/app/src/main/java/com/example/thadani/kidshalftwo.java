package com.example.thadani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class kidshalftwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kidshalftwo);
        ImageButton lasthalf = findViewById(R.id.imageButton30);
        lasthalf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent(kidshalftwo.this, bravo.class);
                startActivity(p);
            }
        });
        ImageButton wrong =findViewById(R.id.imageButton26);
        wrong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m=new Intent(kidshalftwo.this,gameover.class);
                startActivity(m);
            }
        });
        ImageButton buttonf =findViewById(R.id.twentyone);
        buttonf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itwo =new Intent(kidshalftwo.this,gameover.class);
                startActivity(itwo);
            }
        });



    }
}