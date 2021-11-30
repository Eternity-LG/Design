package cn.com.agree.abs.design.Facade;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-30 11:17
 */
public class ShowMaker {
    private Shape circle;
    private Shape rectangle;

    public ShowMaker() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
    }
    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
}
