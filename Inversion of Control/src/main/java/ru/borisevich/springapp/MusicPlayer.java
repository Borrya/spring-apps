package ru.borisevich.springapp;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // IoC
    public MusicPlayer() {}

    public void setMusic(List<Music> list) {
        System.out.println("Set list: " + list);
        this.musicList = list;
    }

    public List<Music> getMusic() {
        return musicList;
    }

    public void playMusic() {
       for(Music item: musicList){
           System.out.println("Playing: " + item.getSong());
       }
    }
}