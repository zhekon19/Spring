package ua.zhekon;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Annotation;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

public class TestSpring {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//        context.close();
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic(Ganre.ROCK);
        System.out.println(musicPlayer.getVolume());
        context.close();
    }
}
