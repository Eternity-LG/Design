package cn.com.agree.abs.design.strategy;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-25 17:49
 */
public class SubStrategy implements Strategy {
    @Override
    public int operate(int x, int y) {
        return x * y;
    }
}
