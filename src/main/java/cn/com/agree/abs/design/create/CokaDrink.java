package cn.com.agree.abs.design.create;

public class CokaDrink extends ColdDrink {
    @Override
    public String name() {
        return "Coka";
    }

    @Override
    public float price() {
        return 1F;
    }
}
