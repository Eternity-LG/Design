package cn.com.agree.abs.design.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-30 14:33
 */
public class Broker {
    List<Order> arrayList = new ArrayList<>();

    public void takeStock(Order order){
        arrayList.add(order);
    }

    public void  placeOrder(){
        for (Order order : arrayList) {
            order.execute();
        }
        arrayList.clear();
    }
}
