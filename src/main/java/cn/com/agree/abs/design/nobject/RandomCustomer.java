package cn.com.agree.abs.design.nobject;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-25 18:06
 */
public class RandomCustomer extends AbstractCustomer {
    public RandomCustomer(String name) {
        this.name = name;
    }

    @Override
    public void getName() {
        System.out.println("this is :"+name);
    }

    @Override
    public boolean isNill() {
        return false;
    }
}
