package cn.com.agree.abs.design.chainofresponsibility;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-29 14:46
 */
public class InfoLogger extends AbstractLogger {
    public InfoLogger(int info) {
        this.level = info;
    }

    @Override
    protected void write(String message) {
        System.out.println("this is info logger"+message);
    }
}
