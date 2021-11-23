package cn.com.agree.abs.design.prototype;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String,Shape> cache = new Hashtable<>();

    public static Shape getShape(String id) {
        Shape shape = cache.get(id);
        return (Shape) shape.clone();

    }

    public static void LoadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        cache.put(circle.getId(),circle);
        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        cache.put(rectangle.getId(),rectangle);
    }
}
