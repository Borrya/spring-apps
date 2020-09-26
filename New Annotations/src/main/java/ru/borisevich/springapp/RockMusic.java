package ru.borisevich.springapp;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music {
    private List<String> rockSongs = new ArrayList<>();
    @Override
    public String getSong() {
        rockSongs.add("Antivist");
        rockSongs.add("Sleepwalking");
        rockSongs.add("Can u feel my heart");

        Random rand = new Random();
        String randomElement = rockSongs.get(rand.nextInt(rockSongs.size()));
        return  randomElement;
    }
}