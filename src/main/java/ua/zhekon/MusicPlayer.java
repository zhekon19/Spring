package ua.zhekon;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    private Music music;
    private String name;
    private int volume;


    public MusicPlayer() {
    }

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void setMusic(Music music) {
        this.music = music;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void playMusic() {
        System.out.println(music.getSong());
    }
    public void playMusicList(){
        for (Music music : musicList) {
            System.out.println(music.getSong());
        }
    }
}
