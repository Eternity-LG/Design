package cn.com.agree.abs.design.nobject;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-25 18:07
 */
public class NullCustomer extends AbstractCustomer{
    @Override
    public void getName() {
        System.out.println("Not Available in Customer Database");
    }

    @Override
    public boolean isNill() {
        return true;
    }
}
