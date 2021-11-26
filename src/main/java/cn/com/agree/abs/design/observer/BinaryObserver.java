package cn.com.agree.abs.design.observer;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-26 10:23
 */
public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}
