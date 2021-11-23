package cn.com.agree.abs.design.prototype;

public class Rectangle extends Shape{
    public Rectangle() {
        type = "RECTANGLE";
    }

    @Override
    void draw() {
        System.out.println("I'm a Rectangle");
    }
}
