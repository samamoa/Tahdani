package com.example.thadani;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ArrayList<quiz> ques = new ArrayList<>();
        quiz p1 = new quiz(R.drawable.waterdrops, R.drawable.wat222,"level water");
        quiz p2 = new quiz(R.drawable.firewater, R.drawable.haf,"level half");
        quiz p3 = new quiz(R.drawable.fire, R.drawable.fi,"level fire");

        ques.add(p1);
        ques.add(p2);
        ques.add(p3);


        RecyclerView rv = findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);

        rv.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        quizAdapter adapter = new quizAdapter(ques, this);
        rv.setAdapter(adapter);
    }
}

