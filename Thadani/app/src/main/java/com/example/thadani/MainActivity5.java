package com.example.thadani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
       ImageView start=findViewById(R.id.startbutton);
       start.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent n=new Intent(MainActivity5.this,kidswaterActivity.class);
               startActivity(n);
           }
       });

    }
}