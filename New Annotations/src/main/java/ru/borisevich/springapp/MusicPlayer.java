package ru.borisevich.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private Music musicC;
    private Music musicR;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music musicC, @Qualifier("rockMusic") Music musicR) {
        // @Qualifier определяет id бина. тут используем, чтобы знать какой бин подставлять в Music
        this.musicC = musicC;
        this.musicR = musicR;
    }

    public void playMusic(Enum e) {
        switch (e) {
            case CLASSIC:
                System.out.println("Random classical music: " + musicC.getSong());
                break;
            case ROCK:
                System.out.println("Random rock music: " + musicR.getSong());
                break;
        }
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}