package cn.com.agree.abs.design.proxy;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-25 17:36
 */
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFile(fileName);
    }

    private void loadFile(String fileName) {
        System.out.println("this is loadFile"+fileName);
    }

    @Override
    public void display() {
        System.out.println("this is a RealDisplay"+fileName);
    }
}
