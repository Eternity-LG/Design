package cn.com.agree.abs.design.factoryabstract;

public class Black implements Color {
    @Override
    public void fill() {
        System.out.println("I'm black");
    }
}
