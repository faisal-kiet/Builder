
public class MealBuilder {

	public Meal prepareVegMeal(){
		Meal meal =new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}
	
	public Meal prepareVegMealWithPakola(){
		Meal meal =new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Pakola());
		return meal;
	}

	public Meal prepareNonVegMeal(){
		Meal meal=new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
	
	public Meal prepareNonVegMealWithPakola(){
		Meal meal=new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pakola());
		return meal;
	}
}
