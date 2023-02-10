package first.biybinaz.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> rockMusicList = new ArrayList<>();

    {
        rockMusicList.add("rockMusicList1");
        rockMusicList.add("rockMusicList2");
        rockMusicList.add("rockMusicList3");
    }

    @Override
    public List<String> getSong() {
        return rockMusicList;
    }
}
