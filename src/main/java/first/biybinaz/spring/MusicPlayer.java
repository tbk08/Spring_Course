package first.biybinaz.spring;

public class MusicPlayer {

    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    private Music music;

    public void setMusic(Music music) {
        this.music = music;
    }

    public MusicPlayer() {
    }

    public void playMusic() {
        System.out.println("Playing: "+music.getSong());
    }
}
