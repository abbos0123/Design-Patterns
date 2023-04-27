package uz.uniquecode;

import uz.uniquecode.model.MediaPlayer;

/**
 * Author: Abbos Fayziboev
 * Date: 12/04/23
 * Email: abbosFayziboev@gmail.com
 */
public class Player {
    private MediaPlayer mediaPlayer;

    public Player(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    public void changeMediaPlayer(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    public void play(String audioType, String fileName) {
        mediaPlayer.play(audioType, fileName);
    }
}
