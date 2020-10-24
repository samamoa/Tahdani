package com.example.thadani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class kidshalftwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kidshalftwo);
        ImageView right = findViewById(R.id.imageButton30);
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent(kidshalftwo.this, bravotwo.class);
                startActivity(p);
            }
        });
        ImageView wrong =findViewById(R.id.imageButton26);
        wrong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m=new Intent(kidshalftwo.this,gameover.class);
                startActivity(m);
            }
        });


    }
}