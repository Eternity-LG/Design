package cn.com.agree.abs.design.factoryabstract;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("I draw a CIRCLE");
    }
}
