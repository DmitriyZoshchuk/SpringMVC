package ua.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private  Music music;
    @Value("${musicPlayer.name}")
    private  String name;
    @Value("${musicPlayer.volume}")
    private  int volume;
    @Autowired

    public MusicPlayer(@Qualifier("rockMusic")Music music){
        this.music = music;
    }


    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusic(Music music)
{
    this.music = music;
}
    public String playMusic(){
        return music.getSong();
    }
}
