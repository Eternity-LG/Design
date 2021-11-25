package cn.com.agree.abs.design.template;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-25 17:57
 */
public abstract class Game {
    abstract void endGame();
    abstract void startGame();
    abstract void initialGame();

    public final void play(){
        initialGame();
        startGame();
        endGame();
    }
}
