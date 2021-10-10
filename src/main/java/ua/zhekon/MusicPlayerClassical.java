package ua.zhekon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MusicPlayerClassical {
    List<Music> listOfMusic = new ArrayList<>();

    public MusicPlayerClassical(List<Music> listOfMusic) {
        this.listOfMusic = listOfMusic;
    }
    public void playMusic(){
        listOfMusic.stream()
                .map(Music::getSong)
                .flatMap(song -> song.stream())
                .forEach(System.out::println);
    }
}
