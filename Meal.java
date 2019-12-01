
public class Meal {
	
	// Name of meal
	private String name;
	// List of drinks
	private Drink drink;
	// List of foods
	private Food food;
	// Cost of meal
	private double cost;
	
	/*
	 * Constructor
	 * Sets the drink and food
	 * Calculates cost based on the sum of drink and food cost
	 */
	public Meal(String name, Drink drink, Food food)
	{
		this.name = name;
		this.drink = drink;
		this.food = food;
		this.cost = drink.getCost() + food.getCost();
	}
	
	/*
	 * Gets the meal's name
	 */
	public String getName()
	{
		return name;
	}
	
	/*
	 * Gets the meal's drink
	 */
	public String getDrink()
	{
		return drink.getName();
	}
	
	/*
	 * Gets the meal's name
	 */
	public String getFood()
	{
		return food.getName();
	}
	
	/*
	 * Gets the meal's cost
	 */
	public double getCost()
	{
		return cost;
	}
	
	/*
	 * Sets the meal's drink
	 */
	public void setDrink(Drink drink)
	{
		this.drink = drink;
	}
	
	/*
	 * Sets the meal's food
	 */
	public void setFood(Food food)
	{
		this.food = food;
	}
	
	/*
	 * Sets the meal's cost
	 */
	public void setCost(double cost)
	{
		this.cost = cost;
	}
}
