import java.util.ArrayList;

public class Menu {

	// All drinks
	ArrayList<Drink> drinks;
	// All foods
	ArrayList<Food> foods;
	// All meals
	ArrayList<Meal> meals;

	/*
	 * Constructor
	 * Creates the arrays for drinks, foods, and meals
	 */
	public Menu()
	{
		drinks = new ArrayList<Drink>();
		foods = new ArrayList<Food>();
		meals = new ArrayList<Meal>();
	}
	
	/*
	 * Adds a drink to the menu
	 */
	public void addDrink(Drink drink)
	{
		drinks.add(drink);
	}
	
	/*
	 * Adds a food to the menu
	 */
	public void addFood(Food food)
	{
		foods.add(food);
	}
	
	/*
	 * Adds a meal to the menu
	 */
	public void addMeal(Meal meal)
	{
		meals.add(meal);
	}
	
	/*
	 * Gets the list of drinks
	 */
	public ArrayList<Drink> getDrinks()
	{
		return drinks;
	}
	
	/*
	 * Gets the list of foods
	 */
	public ArrayList<Food> getFoods()
	{
		return foods;
	}
	
	/*
	 * Gets the list of meals
	 */
	public ArrayList<Meal> getMeals()
	{
		return meals;
	}
}
