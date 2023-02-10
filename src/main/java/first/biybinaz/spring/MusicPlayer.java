package first.biybinaz.spring;

public class MusicPlayer {

    private Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {
    }

    public void playMusic() {
        System.out.println("Playing: "+music.getSong());
    }
}
