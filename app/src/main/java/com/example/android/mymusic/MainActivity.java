package com.example.android.mymusic;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;


public class MainActivity extends AppCompatActivity {
    private MediaPlayer music;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button move=(Button) findViewById(R.id.next);

        music=MediaPlayer.create(this,R.raw.everybody);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextactivity=new Intent(MainActivity.this,LoginActivity.class);
                startActivity(nextactivity);

            }
        });
    }
}
