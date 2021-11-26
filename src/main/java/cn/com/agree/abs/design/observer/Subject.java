package cn.com.agree.abs.design.observer;

import java.util.ArrayList;
import java.util.List;


/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-26 10:15
 */
public class Subject {

    private List<Observer> observers = new  ArrayList<>();

    private int state;

    public void del(Observer object){
        observers.remove(object);
    }

    public void attach(Observer obj){
        observers.add(obj);
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();

        }
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }
}
