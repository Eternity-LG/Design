package cn.com.agree.abs.design.template;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-25 18:00
 */
public class BasketballGame extends Game {
    @Override
    void endGame() {
        System.out.println("basketball end");
    }

    @Override
    void startGame() {
        System.out.println("basketball start");
    }

    @Override
    void initialGame() {
        System.out.println("basketball init");
    }
}
