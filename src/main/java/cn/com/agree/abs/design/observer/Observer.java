package cn.com.agree.abs.design.observer;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-26 10:16
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
