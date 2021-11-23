package cn.com.agree.abs.design.factoryabstract;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("I draw a RECTANGLE");
    }
}
