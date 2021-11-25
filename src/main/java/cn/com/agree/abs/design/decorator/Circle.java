package cn.com.agree.abs.design.decorator;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-25 17:00
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("this is a circle");
    }
}
