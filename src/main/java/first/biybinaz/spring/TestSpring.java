package first.biybinaz.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        musicPlayer.playMusic(Manuscript.CLASSICALMUSIC);
        musicPlayer.playMusic(Manuscript.ROCKMUSIC);
        musicPlayer.playMusic(Manuscript.POPMUSIC);
        context.close();
    }
}
