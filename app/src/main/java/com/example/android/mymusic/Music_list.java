package com.example.android.mymusic;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Music_list extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_list);


       /*ArrayList<SongList> songs=new ArrayList<SongList>();
        songs.add(new SongList("everybody hates me","chain Smoker",R.raw.everybody));
        songs.add(new SongList("I am sick boy","chain Smoker",R.raw.sickboy));
        songs.add(new SongList("Somebody","chain Smoker",R.raw.somebody));
        songs.add(new SongList("you owe  me","chain Smoker",R.raw.youoweme));*/
      final ArrayList<SongList> songs= new ArrayList<SongList>();
       songs.add(new SongList("Everybody hates me","ChainSmoker",R.raw.everybody));
        songs.add(new SongList("I am sick boy","ChainSmoker",R.raw.sickboy));
        songs.add(new SongList("Somebody ","ChainSmoker",R.raw.somebody));
        songs.add(new SongList("You owe me","ChainSmoker",R.raw.youoweme));

             SongAdapter item=new SongAdapter(this,songs);
                ListView list=(ListView) findViewById(R.id.list);
        list.setAdapter(item);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position ,long id) {
                SongList song=songs.get(position);
                mp=MediaPlayer.create(Music_list.this,song.getAudio());
                mp.start();

            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        mp.pause();
    }
}
