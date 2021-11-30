package cn.com.agree.abs.design.flyweight;

import java.util.HashMap;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-30 11:37
 */
public class ShapeFactory {
    public static final HashMap<String, Shape> CircleMap = new HashMap<>();
    public static Shape getCircle(String color){
        Circle circle = (Circle) CircleMap.get(color);

        if (circle==null){
            circle = new Circle(color);
            CircleMap.put(color,circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
