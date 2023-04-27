package uz.uniquecode.adapter;

import uz.uniquecode.model.AdvancedMediaPlayer;
import uz.uniquecode.model.Mp4Player;
import uz.uniquecode.model.VclPlayer;

/**
 * Author: Abbos Fayziboev
 * Date: 12/04/23
 * Email: abbosFayziboev@gmail.com
 */
public class MediaAdapterImpl implements MediaAdapter{
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapterImpl(String audioType){
        if(audioType.equalsIgnoreCase("vcl") ){
            advancedMediaPlayer = new VclPlayer();

        }else if (audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vcl")){
            advancedMediaPlayer.playVlc(fileName);
        }

        else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
