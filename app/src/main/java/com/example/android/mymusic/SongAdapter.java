package com.example.android.mymusic;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<SongList> {
    public SongAdapter(Activity contect,ArrayList<SongList> song){
        super(contect,0,song);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if(convertView==null)
        {
            convertView=LayoutInflater.from(getContext()).inflate(R.layout.listview,parent,false);
        }
        SongList currentPosition=getItem(position);
        TextView song=(TextView) convertView.findViewById(R.id.song);
        song.setText(currentPosition.getSongName());
        TextView sing=(TextView) convertView.findViewById(R.id.singer);
        sing.setText(currentPosition.getSinger());
        return  convertView;

    }
}
