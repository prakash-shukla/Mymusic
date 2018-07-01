package com.example.android.mymusic;

public class SongList {
    String songName;
    String singer;
    int audio;

    public SongList(String name, String artist,int audio) {
        songName = name;
        singer = artist;
        this.audio=audio;

    }

    public String getSongName() {
        return songName;
    }

    public String getSinger() {
        return singer;
    }

    public int getAudio() { return audio; }
}
