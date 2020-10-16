package com.example.thadani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        ImageView kids=findViewById(R.id.imageView3);
        kids.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextTwo=new Intent(MainActivity4.this,MainActivity2.class);
                startActivity(nextTwo);
            }
        });
        ImageView bigger=findViewById(R.id.imageView4);
        bigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextThree=new Intent(MainActivity4.this,test.class);
                startActivity(nextThree);
            }
        });
        }
        }