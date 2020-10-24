package com.example.thadani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class bravofour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bravofour);
        ImageView nextpage=findViewById(R.id.next3);
        nextpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i;
                i = new Intent(bravofour.this, hard.class);
                startActivity(i);
            }
        });
        final MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.club);
        mediaPlayer.start();

    }
}