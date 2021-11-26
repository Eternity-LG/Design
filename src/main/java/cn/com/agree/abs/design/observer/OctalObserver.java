package cn.com.agree.abs.design.observer;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-26 10:24
 */
public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: "
                + Integer.toOctalString(subject.getState()));
    }
}
