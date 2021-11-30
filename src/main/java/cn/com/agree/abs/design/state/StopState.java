package cn.com.agree.abs.design.state;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-30 16:00
 */
public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("this is a stop");
        context.setState(this);
    }

    public String toString(){

        return "this is stop";
    }
}