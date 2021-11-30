package cn.com.agree.abs.design.command;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-30 14:29
 */
public class buyOrder implements Order {
    private Stock abcstock;

    public buyOrder(Stock abcstock) {
        this.abcstock = abcstock;
    }

    @Override
    public void execute() {
        abcstock.sell();
    }
}
