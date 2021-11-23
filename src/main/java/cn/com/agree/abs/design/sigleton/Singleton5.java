package cn.com.agree.abs.design.sigleton;

import java.security.PublicKey;

public enum Singleton5 {
    INSTANCE;

    public static Singleton5 getInstance() {
        return INSTANCE;
    }
}
