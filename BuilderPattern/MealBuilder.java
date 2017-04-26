package BuilderPattern;

public class MealBuilder {
	public Meal prepareVegMeal(){
		Meal vegMeal= new Meal();
		vegMeal.addItem(new VegBurger());
		vegMeal.addItem(new Coke());
		return vegMeal;
		
	}
public Meal prepareNonVegMeal(){
	Meal nonvegMeal= new Meal();
	nonvegMeal.addItem(new NonVegBurger());
	nonvegMeal.addItem(new Pepsi());
	return nonvegMeal;
	}
}
