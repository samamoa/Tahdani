package com.example.thadani;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ArrayList<quiz> ques = new ArrayList<>();
     quiz p1=new quiz("Easy",R.drawable.waterdrops);
     quiz p2=new quiz("Medium",R.drawable.firewater);
     quiz p3=new quiz("Hard",R.drawable.fire);


     ques.add(p1);
     ques.add(p2);
     ques.add(p3);

        ArrayList<qiz2> question = new ArrayList<>();
        qiz2 n1=new qiz2("Easy",R.drawable.waterdrops);
        qiz2 n2=new qiz2 ("Medium",R.drawable.firewater);
        qiz2 n3=new qiz2 ("Hard",R.drawable.fire);


       question.add(n1);
        question.add(n2);
        question.add(n3);



    }  }

