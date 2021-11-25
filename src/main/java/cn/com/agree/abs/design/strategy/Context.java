package cn.com.agree.abs.design.strategy;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-25 17:50
 */
public class Context {
    private Strategy strategy;
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public int execute(int x,int y){
        return strategy.operate(x,y);
    }
}
