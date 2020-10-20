package com.example.thadani;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        ArrayList<qiz> question = new ArrayList<>();
        qiz n1 = new qiz(R.drawable.waterdrops, R.drawable.wat222,"level one");
        qiz n2 = new qiz(R.drawable.firewater, R.drawable.haf,"level two");
        qiz n3 = new qiz(R.drawable.fire, R.drawable.fi,"level three");

        question.add(n1);
        question.add(n2);
        question.add(n3);
        RecyclerView rv = findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);

        rv.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        qizAdapter adapter= new qizAdapter(question,this);
        rv.setAdapter(adapter);
    }

}
