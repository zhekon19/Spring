package ua.zhekon;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class RockMusic implements Music {
    Ganre ganre = Ganre.ROCK;
    List<String> list = new ArrayList<>();
    {
        list.add("Rad door");
        list.add("Murmaider");
        list.add("Water good");
    }
    @Override
    public List<String> getSong() {
        return list;
    }
}
