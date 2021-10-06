package ua.zhekon;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        Music music = context.getBean("musicBean",Music.class);
//        MusicPlayer musicPlayer = context.getBean("musicPlayerBean",MusicPlayer.class);
        MusicPlayer musicPlayer = context.getBean("musicPlayerListBean",MusicPlayer.class);
        musicPlayer.playMusicList();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        context.close();
    }
}
