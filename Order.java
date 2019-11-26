
public class Order {

	// Timer
	private Timer timer;
	// Account
	private Account account;
	// Restaurant
	private Restaurant restaurant;
	// Food
	private Food food;
	// Drink
	private Drink drink;
	// Meal
	private Meal meal;
	// Cost of the order
	private double totalCost;

	/*
	 * Cponstructor
	 * Adds the account and restaurant for the order
	 */
	public Order(Account account, Restaurant restaurant)
	{
		this.account = account;

		this.restaurant = restaurant;
	}

	/*
	 * Sets the foods being orders for the meal
	 */
	public void setOrder(Food food, Drink drink, Meal meal)
	{
		this.food = food;
		this.drink = drink;
		this.meal = meal;

		if (food != null)
		{
			this.totalCost = this.totalCost + this.food.getCost();
		}
		
		if (drink != null)
		{
			this.totalCost = this.totalCost + this.drink.getCost();
		}
		
		if (meal != null)
		{
			this.totalCost = this.totalCost + this.meal.getCost();
		}
	}

	/*
	 * Sets how long the order will take
	 */
	public void setTimer(int minutes, int seconds)
	{
		timer = new Timer(minutes, seconds);
	}

	/*
	 * Begins timer
	 */
	public void startTimer() throws InterruptedException
	{
		timer.startTimer();
	}
	
	/*
	 * Gets the food
	 */
	public Food getFood()
	{
		return food;
	}
	
	/*
	 * Gets the drink
	 */
	public Drink getDrink()
	{
		return drink;
	}
	
	/*
	 * Gets the meal
	 */
	public Meal getMeal()
	{
		return meal;
	}
}
