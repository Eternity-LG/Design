package cn.com.agree.abs.design.factoryabstract;

public class ColorFactory extends AbstractFactory{
    public Color getColor(String color){
        if (color.equalsIgnoreCase("RED")){
            new Red();
        }else if(color.equalsIgnoreCase("BLACK")){
            new Black();
        }else if(color.equalsIgnoreCase("BLUE")){
            new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }
}
