package BuilderPattern;

public class BuilderDemo {

	public static void main(String[] args) {
		MealBuilder builder= new MealBuilder();
		Meal meal= builder.prepareVegMeal();
		meal.getItems();
		meal.getCost();
		Meal nonVeg=builder.prepareNonVegMeal();
		nonVeg.getItems();
		nonVeg.getCost();
		
	}

}
