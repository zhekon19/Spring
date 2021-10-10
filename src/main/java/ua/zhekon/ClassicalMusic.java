package ua.zhekon;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class ClassicalMusic implements Music {
    Ganre ganre = Ganre.CLASSICAL;
    List<String> list = new ArrayList<>();
    {
        list.add("1 Sempony");
        list.add("4 Season");
        list.add("Water melody");

    }

    @Override
    public List<String> getSong() {
        return list;
    }
}
