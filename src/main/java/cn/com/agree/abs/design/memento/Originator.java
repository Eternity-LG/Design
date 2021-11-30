package cn.com.agree.abs.design.memento;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-30 17:32
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveToMemento(){
        return new Memento(this.state);
    }

    public void getMemento(Memento memento){
        this.state = memento.getState();
    }

}
