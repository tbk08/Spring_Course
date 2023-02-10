package first.biybinaz.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private List<String> classicalMusicList = new ArrayList<>();

    {
        classicalMusicList.add("ClassicalMusic1");
        classicalMusicList.add("ClassicalMusic2");
        classicalMusicList.add("ClassicalMusic3");
    }

    @Override
    public List<String> getSong() {
        return classicalMusicList;
    }
}
