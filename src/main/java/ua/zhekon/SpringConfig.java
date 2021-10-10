package ua.zhekon;

import com.sun.org.apache.bcel.internal.generic.ARETURN;
import org.springframework.context.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("ua.zhekon")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }
    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public List<Music> musicBeans(){
        List<Music> list = new ArrayList();
        list.add(classicalMusic());
        list.add(rockMusic());
        return list;
    }
    @Bean
    public MusicPlayerClassical musicPlayerClassical(){
        return new MusicPlayerClassical(musicBeans());
    }

}
