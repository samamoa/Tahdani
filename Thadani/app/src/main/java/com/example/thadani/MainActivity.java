package com.example.thadani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String name;
    EditText nameInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameInput=(EditText)findViewById(R.id.nickname);
     ImageButton button=findViewById(R.id.imageButton);
     button.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             name=nameInput.getText().toString();
           Text(name);
             Intent next=new Intent(MainActivity.this,MainActivity4.class);
             startActivity(next);
         }


     });



    }
    private void Text(String text){
        Toast.makeText(MainActivity.this,text,Toast.LENGTH_SHORT).show();
    }
}