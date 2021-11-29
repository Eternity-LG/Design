package cn.com.agree.abs.design.chainofresponsibility;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-29 14:20
 */
public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        InfoLogger infoLogger = new InfoLogger(AbstractLogger.INFO);
        DebugLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);
        ErrorLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);

        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);
        String message = "打个日志";

        infoLogger.logMessage(3,message);

    }
}
