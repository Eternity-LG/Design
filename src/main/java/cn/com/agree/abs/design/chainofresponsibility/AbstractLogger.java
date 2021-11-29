package cn.com.agree.abs.design.chainofresponsibility;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-29 14:36
 */
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;
    protected int level;
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger abstractLogger) {
        this.nextLogger = abstractLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level == level) {
            write(message);
        } else if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    protected abstract void write(String message);

}
