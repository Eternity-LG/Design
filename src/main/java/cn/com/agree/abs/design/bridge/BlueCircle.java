package cn.com.agree.abs.design.bridge;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-25 16:04
 */
public class BlueCircle implements DrawAPI{

    @Override
    public void drawCircle(int x, int y, String color) {
        System.out.println("this is a Circle:"+x+"----"+y+"----"+color);
    }
}
