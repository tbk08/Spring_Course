package first.biybinaz.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private Music music;
    private Music music1;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music, @Qualifier("rockMusic") Music music1) {
        this.music = music;
        this.music1 = music1;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
