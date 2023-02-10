package first.biybinaz.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private Music music;
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music, @Qualifier("rockMusic") Music music1, @Qualifier("popMusic") Music music2) {
        this.music = music;
        this.music1 = music1;
        this.music2 = music2;
    }

    public void playMusic(Enum manuscript) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        if (manuscript == Manuscript.CLASSICALMUSIC)
            System.out.println(music.getSong().get(randomNumber));
        if (manuscript == Manuscript.ROCKMUSIC)
            System.out.println(music1.getSong().get(randomNumber));
        if (manuscript == Manuscript.POPMUSIC)
            System.out.println(music2.getSong().get(randomNumber));
    }
}
