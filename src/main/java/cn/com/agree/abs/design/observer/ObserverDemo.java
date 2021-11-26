package cn.com.agree.abs.design.observer;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-26 10:10
 */
public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new OctalObserver(subject);
        new BinaryObserver(subject);
        new HexaObserver(subject);

        subject.setState(23);
        subject.setState(1);

    }
}
