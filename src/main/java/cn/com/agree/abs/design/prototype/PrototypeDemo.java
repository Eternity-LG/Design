package cn.com.agree.abs.design.prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        ShapeCache.LoadCache();

        Shape shape = ShapeCache.getShape("1");
        System.out.println(shape.type);
        Shape shape1 = ShapeCache.getShape("2");
        System.out.println(shape1.type  );
    }
}
