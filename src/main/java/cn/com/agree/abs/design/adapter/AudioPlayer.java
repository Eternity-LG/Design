package cn.com.agree.abs.design.adapter;

public class AudioPlayer implements MediaPlayer{
    MediaAdapter mediaAdapter;
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")){
            System.out.println("mp3");
        }else if (audioType.equalsIgnoreCase("Vlc")||audioType.equalsIgnoreCase("Mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }else{
            System.out.println("Invalid media."+audioType+"format not support");
        }
    }
}
