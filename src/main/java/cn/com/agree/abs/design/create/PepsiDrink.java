package cn.com.agree.abs.design.create;

public class PepsiDrink extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 99F;
    }
}
