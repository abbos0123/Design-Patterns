package uz.uniquecode.model;

import uz.uniquecode.adapter.MediaAdapter;
import uz.uniquecode.adapter.MediaAdapterImpl;

/**
 * Author: Abbos Fayziboev
 * Date: 12/04/23
 * Email: abbosFayziboev@gmail.com
 */
public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3"))
            System.out.println("Playing mp3 file. Name: " + fileName);
        else
            System.out.println("This format is not supported....");
    }
}
