package ru.borisevich.springapp;

public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Bohemian Rhapsody";
    }
}