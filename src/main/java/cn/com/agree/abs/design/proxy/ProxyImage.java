package cn.com.agree.abs.design.proxy;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-25 17:37
 */
public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage( String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage==null){
            this.realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
