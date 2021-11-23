package cn.com.agree.abs.design.create;

public abstract class ColdDrink implements Iterm {

    @Override
    public abstract float price();

    @Override
    public IPacking packing() {
        return new Bottal();
    }
}
