package cn.com.agree.abs.design.create;

public abstract class Buger implements Iterm {

    @Override
    public abstract float price();

    @Override
    public IPacking packing() {
        return new Wrapper();
    }
}
