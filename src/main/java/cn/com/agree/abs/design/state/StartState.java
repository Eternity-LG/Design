package cn.com.agree.abs.design.state;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-30 15:56
 */
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("this is a start");
        context.setState(this);
    }

    public String toString(){

        return "this is start";
    }
}
