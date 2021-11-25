package cn.com.agree.abs.design.nobject;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-25 18:10
 */
public class CustomerFactory {

    private final String[] names = {"A", "B", "C"};

    public AbstractCustomer getCustomer(String name) {
        for (String s : names) {
            if (s.equalsIgnoreCase(name)) {
                return new RandomCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
