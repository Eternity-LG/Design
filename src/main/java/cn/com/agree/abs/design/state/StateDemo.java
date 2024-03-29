package cn.com.agree.abs.design.state;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-30 16:01
 */
public class StateDemo {
    public static void main(String[] args) {
        Context context = new Context();
        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());
        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }
}
