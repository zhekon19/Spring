package ua.zhekon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class MusicPlayer {
    String name;
    @Value("${musicPlayer.volume}")
    int volume;

    private Music classicalMusic;
    private Music rockMusic;

    @PostConstruct
    public void preInit() {
        System.out.println("Music Player is init");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Music player vas destroy");
    }

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music classicalMusic, @Qualifier("rockMusic") Music rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public String getName() {
        return name;
    }

    @Value("${musicPlayer.name}")
    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic(Ganre ganre) {
        if (ganre == Ganre.CLASSICAL) {

            classicalMusic.getSong().forEach(System.out::println);
        } else if (ganre == Ganre.ROCK) {
            rockMusic.getSong().forEach(System.out::println);
        }
    }

}
