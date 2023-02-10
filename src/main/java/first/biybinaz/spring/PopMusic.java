package first.biybinaz.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PopMusic implements Music {
    private List<String> popMusicList = new ArrayList<>();

    {
        popMusicList.add("popMusicList1");
        popMusicList.add("popMusicList2");
        popMusicList.add("popMusicList3");
    }

    @Override
    public List<String> getSong() {
        return popMusicList;
    }
}
