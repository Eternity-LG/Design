package cn.com.agree.abs.design.decorator;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-25 17:04
 */
public class DecoratorDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
        RedShapeDecorator shapeDecorator = new RedShapeDecorator(circle);
        shapeDecorator.draw();
        BlueShapeDecorator blueShapeDecorator = new BlueShapeDecorator(circle);
        blueShapeDecorator.draw();

    }
}
