package cn.com.agree.abs.design.chainofresponsibility;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-29 14:48
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("this is a error log"+ message);
    }
}
