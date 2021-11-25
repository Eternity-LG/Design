package cn.com.agree.abs.design.bridge;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-25 16:02
 */
public abstract class Shape {

    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }
    public abstract void draw();

}
