package cn.com.agree.abs.forDependency;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.util.ArrayList;
import java.util.List;
 
public class FastJsonTest {
 
    /** 商品信息 */
    private static class Item{
        private String itemId;      // 商品Id
        private String itemName;    // 商品名称
        private Order order;        // 关联订单
 
        public String getItemId() { return itemId; }
        public void setItemId(String itemId) { this.itemId = itemId; }
        public String getItemName() { return itemName; }
        public void setOrder( Order order) { this.order = order; }
        public Order getOrder() { return order; }
        public void setItemName(String itemName) { this.itemName = itemName; }
    }
 
    /** 订单信息 */
    private static class Order{
        private String orderId;     // 订单Id
        private String orderName;   // 订单名称
        private Item item;          // 关联商品
 
        public String getOrderId() { return orderId; }
        public void setOrderId(String orderId) { this.orderId = orderId; }
        public String getOrderName() { return orderName; }
        public void setOrderName(String orderName) { this.orderName = orderName; }
        public Item getItem() { return item; }
        public void setItem( Item item) { this.item = item; }
    }

    public static void test_fastjson(){
        Item item = new  Item();
        item.setItemId("13518");
        item.setItemName("IT无知君");
        Order order = new  Order();
        order.setOrderId("18712");
        order.setOrderName("天涯未远，有缘再见");
 
        // 1、验证“验证FastJson的重复引用”
        List<Item> list = new ArrayList<>();
        list.add(item);
        list.add(item);
        list.add(item);
        System.out.println("1.默认缺省打开时，list1 = " + JSON.toJSONString(list));
        System.out.println("2.关闭缺省打开时，list2 = " + JSON.toJSONString(list, SerializerFeature.DisableCircularReferenceDetect));
        System.out.println("3.再次使用缺省时，list3 = " + JSON.toJSONString(list));
 
        // 2、验证“验证FastJson的循环引用”
        item.setOrder(order);
        order.setItem(item);
        System.out.println("4.默认缺省打开时，item1 = " + JSON.toJSONString(item));
        System.out.println("5.默认缺省打开时，order1 = " + JSON.toJSONString(order));
        try {
            System.out.println("6.关闭缺省打开时，item2 = " + JSON.toJSONString(item, SerializerFeature.DisableCircularReferenceDetect));
        } catch (Exception e) {
            System.out.println("7.这行代码执行不到，因为StackOverflowError不属于Exception。");
        }
        System.out.println("8.这行代码也执行不到，因为系统已经出现了StackOverflowError（堆栈溢出错误）！");
    }

    public static void main(String[] args) {
        test_fastjson();
    }
}