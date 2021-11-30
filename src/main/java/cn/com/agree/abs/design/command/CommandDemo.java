package cn.com.agree.abs.design.command;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-30 14:41
 */
public class CommandDemo {
    public static void main(String[] args) {
        Stock stock = new Stock();
        SellOrder sellOrder = new SellOrder(stock);
        buyOrder buyOrder = new buyOrder(stock);
        Broker broker = new Broker();
        broker.takeStock(sellOrder);
        broker.takeStock(buyOrder);
        broker.placeOrder();
    }
}
