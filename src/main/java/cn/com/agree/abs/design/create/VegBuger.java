package cn.com.agree.abs.design.create;

public class VegBuger extends Buger {
    @Override
    public String name() {
        return "vegetables";
    }

    @Override
    public float price() {
        return 0.25F;
    }
}
