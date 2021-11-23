package cn.com.agree.abs.design.create;

public class MealBuilderPartternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder1 = new MealBuilder();
        Meal meal1 = mealBuilder1.prepareVegMeal();
        float cost1 = meal1.getCost();
        System.out.println("共消费:"+cost1);
        meal1.showIterms();

        System.out.println("\n");

        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.prepareNonVegMeal();
        float cost = meal.getCost();
        System.out.println("共消费:"+cost);
        meal.showIterms();

    }
}
