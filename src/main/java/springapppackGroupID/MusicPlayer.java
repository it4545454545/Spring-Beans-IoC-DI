package springapppackGroupID;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String nameOfPlayer;
    @Value("${musicPlayer.volume}")
    private int volume;
    List<Music> musicList;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic() {
        Random random = new Random();
        return
                musicList.get(random.nextInt(musicList.size())).getSong() + "\n Name of player: " + nameOfPlayer + "\n Volume: " + volume;
    }
}

