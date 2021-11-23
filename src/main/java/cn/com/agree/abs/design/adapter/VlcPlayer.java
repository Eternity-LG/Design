package cn.com.agree.abs.design.adapter;

public class VlcPlayer implements AdvancedPlayer{
    @Override
    public void playMp4(String fileName) {

    }

    @Override
    public void playVlc(String fileName) {
        System.out.println("vlc");
    }
}
