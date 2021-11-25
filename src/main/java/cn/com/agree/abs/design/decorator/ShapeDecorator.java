package cn.com.agree.abs.design.decorator;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-25 17:01
 */
public abstract class ShapeDecorator implements Shape{
    protected Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        shape.draw();
    }
    public abstract void paint();
}
