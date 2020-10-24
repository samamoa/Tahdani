package com.example.thadani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class kidshalf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kidshalf);
        ImageView right =findViewById(R.id.rightbutton);
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(kidshalf.this,kidshalftwo.class);
                startActivity(i);
            }
        });
        ImageView wrong =findViewById(R.id.wrongbutton);
      wrong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent u=new Intent(kidshalf.this,gameover.class);
                startActivity(u);
            }
        });



    }
}