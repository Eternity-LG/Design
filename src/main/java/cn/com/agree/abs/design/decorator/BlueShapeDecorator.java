package cn.com.agree.abs.design.decorator;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-25 17:11
 */
public class BlueShapeDecorator extends ShapeDecorator {

    public BlueShapeDecorator(Shape shape) {
        super(shape);
    }

    public void draw() {
        shape.draw();
        paint();
    }
    @Override
    public void paint() {
        System.out.println("this is blue Bounds");
    }
}
