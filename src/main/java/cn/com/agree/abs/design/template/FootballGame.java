package cn.com.agree.abs.design.template;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-25 17:58
 */
public class FootballGame extends Game {
    @Override
    void endGame() {
        System.out.println("football end");
    }

    @Override
    void startGame() {
        System.out.println("football start");
    }

    @Override
    void initialGame() {
        System.out.println("football init");
    }
}
