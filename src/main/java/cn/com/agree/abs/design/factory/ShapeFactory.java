package cn.com.agree.abs.design.factory;

import org.springframework.stereotype.Component;

@Component
public class ShapeFactory {

    public void getShape(String shapeTyp) {
        if (shapeTyp.equalsIgnoreCase("CIRCLE")) {
            new Circle();
        } else if (shapeTyp.equalsIgnoreCase("SQUARE")) {
            new Square();
        } else if (shapeTyp.equalsIgnoreCase("RECTANGLE")) {
            new Rectangle();
        }
    }
}
