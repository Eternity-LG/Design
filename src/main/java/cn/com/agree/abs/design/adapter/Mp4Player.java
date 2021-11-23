package cn.com.agree.abs.design.adapter;

public class Mp4Player implements AdvancedPlayer{
    @Override
    public void playMp4(String fileName) {
        System.out.println("mp4");
    }

    @Override
    public void playVlc(String fileName) {

    }
}
