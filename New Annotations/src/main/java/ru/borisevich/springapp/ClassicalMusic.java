package ru.borisevich.springapp;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music {
    private List<String> classicSongs = new ArrayList<>();

    @Override
    public String getSong() {
        classicSongs.add("Bohemian Rhapsody");
        classicSongs.add("Shakespear");
        classicSongs.add("Duma");

        Random rand = new Random();
        String randomElement = classicSongs.get(rand.nextInt(classicSongs.size()));
        return  randomElement;
    }

}