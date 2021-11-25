package cn.com.agree.abs.design.bridge;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-25 16:05
 */
public class BridgeDemo {
    public static void main(String[] args) {
        Circle blue = new Circle(1, 2, "blue", new BlueCircle());
        blue.draw();
        Circle red = new Circle(3, 6, "red", new RedCircle());
        red.draw();
    }
}
