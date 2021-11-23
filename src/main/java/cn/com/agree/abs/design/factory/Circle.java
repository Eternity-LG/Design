package cn.com.agree.abs.design.factory;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("I draw a CIRCLE");
    }
}
