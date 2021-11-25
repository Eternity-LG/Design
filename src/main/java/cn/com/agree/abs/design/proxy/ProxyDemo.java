package cn.com.agree.abs.design.proxy;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-25 17:35
 */
public class ProxyDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        //图像将从磁盘加载
        image.display();
        System.out.println("------------------------");
        //图像将无法从磁盘加载
        image.display();
    }
}
