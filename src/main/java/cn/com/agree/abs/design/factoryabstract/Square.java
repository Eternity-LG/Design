package cn.com.agree.abs.design.factoryabstract;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("I draw a SQUARE");
    }
}
