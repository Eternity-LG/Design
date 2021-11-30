package cn.com.agree.abs.design.state;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-30 15:57
 */
public class Context {
    private State state;

    public Context() {
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }


}
