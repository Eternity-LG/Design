package cn.com.agree.abs.design.prototype;

public class Circle extends Shape{
    public Circle() {
        type = "CIRCLE";
    }

    @Override
    void draw() {
        System.out.println("I'm a cicle");
    }
}
