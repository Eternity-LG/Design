package cn.com.agree.abs.design.sigleton;

import sun.security.jca.GetInstance;

/**
 * 饿汉 线程安全
 */
public class Singleton3 {
    private Singleton3() {
    }

    private static Singleton3 instance;

    public static synchronized Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }

}
