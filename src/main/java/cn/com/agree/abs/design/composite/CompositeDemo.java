package cn.com.agree.abs.design.composite;

import java.util.List;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-29 14:08
 */
public class CompositeDemo {
    public static void main(String[] args) {
        Employee CEO = new Employee("jojo", "CEO", 100000);
        Employee headSale = new Employee("robert", "head_sale", 10000);
        Employee headMarket = new Employee("luci", "head_market", 10000);
        Employee sale1 = new Employee("s1", "sale", 1000);
        Employee sale2 = new Employee("s2", "sale", 1000);
        Employee market1 = new Employee("m2", "market", 1000);
        CEO.add(headMarket);
        CEO.add(headSale);
        headMarket.add(market1);
        headSale.add(sale1);
        headSale.add(sale2);
        System.out.println(CEO);
        List<Employee> subordinates = CEO.getSubordinates();
        for (Employee subordinate : subordinates) {
            System.out.println(subordinate);
            for (Employee employee : subordinate.getSubordinates()) {
                System.out.println(employee);
            }
        }

    }
}
