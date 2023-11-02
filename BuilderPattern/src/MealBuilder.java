public class MealBuilder {
    public Meal vegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VeggieBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new DrPepper());
        return meal;
    }
}
