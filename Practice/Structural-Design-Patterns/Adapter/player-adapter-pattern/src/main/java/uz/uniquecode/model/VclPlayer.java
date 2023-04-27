package uz.uniquecode.model;

/**
 * Author: Abbos Fayziboev
 * Date: 12/04/23
 * Email: abbosFayziboev@gmail.com
 */
public class VclPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vcl file. Name : " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //do nothing ...
    }
}
