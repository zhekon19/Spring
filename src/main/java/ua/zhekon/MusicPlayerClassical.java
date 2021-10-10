package ua.zhekon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayerClassical {
    String name;
    int volume;

    Music music;

    @Autowired
    public MusicPlayerClassical(@Qualifier("classicalMusic") Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println(music.getSong());
    }

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
}
