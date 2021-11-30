package cn.com.agree.abs.design.memento;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-30 17:39
 */
public class MementoDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("1");
        originator.setState("2");
        careTaker.add(originator.saveToMemento());
        originator.setState("3");
        careTaker.add(originator.saveToMemento());
        System.out.println("Current State: " + originator.getState());
        originator.getMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());


    }
}
