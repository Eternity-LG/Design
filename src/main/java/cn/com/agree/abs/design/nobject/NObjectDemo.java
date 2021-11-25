package cn.com.agree.abs.design.nobject;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-25 18:10
 */
public class NObjectDemo {
    public static void main(String[] args) {
        new CustomerFactory().getCustomer("A").getName();
        new CustomerFactory().getCustomer("").getName();
        new CustomerFactory().getCustomer("B").getName();
    }

}
