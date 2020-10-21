package com.example.thadani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class bravo extends AppCompatActivity {
    Intent n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bravo);
       Bundle bundle=getIntent().getExtras();
     final  String s=bundle.getString("level");
        ImageButton nextpage=findViewById(R.id.imageButton6);
       nextpage.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent i;
               if(s=="water"){
                   i=new Intent(bravo.this,kidshalf.class);
                   startActivity(i);
               }
               else if(s=="half"){
                   i=new Intent(bravo.this,kidshard.class);
                   startActivity(i);
               }
               else if (s=="water two"){
                   i=new Intent(bravo.this,halftwo.class);
                   startActivity(i);
               }

           }
       });

    }
}