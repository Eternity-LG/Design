package cn.com.agree.abs.design.bridge;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-25 16:03
 */
public class Circle extends Shape{
    private int x,y;
    private String color;


    protected Circle(int x,int y,String color,DrawAPI drawAPI) {
        super(drawAPI);
        this.color = color;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(x,y,color);
    }
}
