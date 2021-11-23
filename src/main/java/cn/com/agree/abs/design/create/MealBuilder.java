package cn.com.agree.abs.design.create;

public class MealBuilder {

    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addIterm(new CokaDrink());
        meal.addIterm(new VegBuger());
        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addIterm(new PepsiDrink());
        meal.addIterm(new VegBuger());
        return meal;
    }

}
