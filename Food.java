
public class Food {
	
	// Name of food
	private String name;
	// Cost of food
	private double cost;

	/*
	 * Constructor
	 * Sets the name and cost
	 */
	public Food(String name, double cost)
	{
		this.name = name;
		this.cost = cost;
	}

	/*
	 * Gets the food's name
	 */
	public String getName()
	{
		return name;
	}

	/*
	 * Gets the food's cost
	 */
	public double getCost()
	{
		return cost;
	}

	/*
	 * Sets the food's name
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/*
	 * Sets the food's cost
	 */
	public void setCost(double cost)
	{
		this.cost = cost;
	}
}
