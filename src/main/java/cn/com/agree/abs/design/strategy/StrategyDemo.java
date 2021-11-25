package cn.com.agree.abs.design.strategy;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-25 17:51
 */
public class StrategyDemo {
    public static void main(String[] args) {
        int x =3;
        int y =5;
        Context context = new Context(new SubStrategy());
        context.execute(x,y);
    }
}
