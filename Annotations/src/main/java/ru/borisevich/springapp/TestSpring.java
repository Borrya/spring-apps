package ru.borisevich.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        // ApplicationContext javaConfigContext =
        //        new AnnotationConfigApplicationContext("имя класса");
        // если делать через аннотации, а не xml файл.

        Music musicPlayer = context.getBean("classicalMusic", Music.class);
        MusicPlayer classicalMusicPlayer = new MusicPlayer(musicPlayer);
        classicalMusicPlayer.playMusic();

        context.close();
    }
}