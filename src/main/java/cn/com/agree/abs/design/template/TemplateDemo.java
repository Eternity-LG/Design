package cn.com.agree.abs.design.template;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-25 18:00
 */
public class TemplateDemo {
    public static void main(String[] args) {
        BasketballGame basketballGame = new BasketballGame();
        basketballGame.play();
        System.out.println();
        FootballGame footballGame = new FootballGame();
        footballGame.play();
    }
}
