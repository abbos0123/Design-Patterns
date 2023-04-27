package uz.uniquecode;

import uz.uniquecode.adapter.MediaAdapter;
import uz.uniquecode.adapter.MediaAdapterImpl;
import uz.uniquecode.model.AudioPlayer;
public class UserApplication {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        Player player = new Player(audioPlayer);
        player.play("mp3", "choliqushi");

        MediaAdapter adapter = new MediaAdapterImpl("mp4");
        player.changeMediaPlayer(adapter);
        player.play("mp4", "Choliqushi movie");

        adapter = new MediaAdapterImpl("vcl");
        player.changeMediaPlayer(adapter);
        player.play("vcl", "VCL format file");
    }
}