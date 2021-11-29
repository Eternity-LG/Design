package cn.com.agree.abs.design.chainofresponsibility;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-29 14:47
 */
public class DebugLogger extends AbstractLogger {
    public DebugLogger(int debug) {
        this.level = debug;
    }

    @Override
    protected void write(String message) {
        System.out.println("this is debug log"+message);
    }
}
