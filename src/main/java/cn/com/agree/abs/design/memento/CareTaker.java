package cn.com.agree.abs.design.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-30 17:34
 */
public class CareTaker {
    private static final List<Memento> MM = new ArrayList<>();

    public Memento get(int index){
        return MM.get(index);
    }

    public void add(Memento memento){
        MM.add(memento);
    }
}
