package cn.com.agree.abs.design.factoryabstract;

import org.springframework.stereotype.Component;

@Component
public class ShapeFactory extends AbstractFactory{

    @Override
    public Color getColor(String colorType) {
        return null;
    }

    public Shape getShape(String shapeTyp) {
        if (shapeTyp.equalsIgnoreCase("CIRCLE")) {
            new Circle();
        } else if (shapeTyp.equalsIgnoreCase("SQUARE")) {
            new Square();
        } else if (shapeTyp.equalsIgnoreCase("RECTANGLE")) {
            new Rectangle();
        }
        return null;
    }
}
