package cn.com.agree.abs.design.memento;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-30 17:31
 */
public class Memento {
    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private  String state;


}
