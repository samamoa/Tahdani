package com.example.thadani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class hhhelp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hhhelp);
        ImageButton right =findViewById(R.id.imageButton5);
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o=new Intent(hhhelp.this,answer.class);
                startActivity(o);
            }
        });
        ImageButton gameover =findViewById(R.id.rightbutton2);
        gameover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o=new Intent(hhhelp.this,tryagain.class);
                startActivity(o);
            }
        });
    }
}