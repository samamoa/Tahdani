package com.example.thadani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class watertwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watertwo);
        ImageButton right =findViewById(R.id.rightbutton3);
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o=new Intent(watertwo.this,bravo.class);
                startActivity(o);
            }
        });
        ImageButton w =findViewById(R.id.wrongbutton4);
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o=new Intent(watertwo.this,gameover.class);
                startActivity(o);
            }
        });

    }
}