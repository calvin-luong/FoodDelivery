
public class Drink {

	// Name of drink
	private String name;
	// Cost of drink
	private double cost;

	/*
	 * Constructor
	 * Sets the name and cost
	 */
	public Drink(String name, double cost)
	{
		this.name = name;
		this.cost = cost;
	}

	/*
	 * Gets the drink's name
	 */
	public String getName()
	{
		return name;
	}

	/*
	 * Gets the drink's cost
	 */
	public double getCost()
	{
		return cost;
	}

	/*
	 * Sets the drink's name
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/*
	 * Sets the drink's cost
	 */
	public void setCost(double cost)
	{
		this.cost = cost;
	}
}
