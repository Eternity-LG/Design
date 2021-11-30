package cn.com.agree.abs.design.command;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-30 14:28
 */
public class SellOrder implements Order {
    private Stock abcstock;

    public SellOrder(Stock stock) {
        this.abcstock = stock;
    }

    @Override
    public void execute() {
        abcstock.buy();
    }
}
