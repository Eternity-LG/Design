package cn.com.agree.abs.design.Facade;

public class FacadePatternDemo {
   public static void main(String[] args) {
      ShowMaker shapeMaker = new ShowMaker();

      shapeMaker.drawCircle();
      shapeMaker.drawRectangle();
   }
}