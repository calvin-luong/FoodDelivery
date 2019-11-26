
public class Restaurant {
	
	// Name of restaurant
	private String name;
	// Address of restaurant
	private String address;
	// Menu of the restaurant
	private Menu menu;
	
	/*
	 * Constructor
	 * Sets the name and address for the restaurant
	 */
	public Restaurant(String name, String address)
	{
		this.name = name;
		this.address = address;
		this.menu = new Menu();
	}
	
	/*
	 * Gets the name
	 */
	public String getName()
	{
		return name;
	}
	
	/*
	 * Gets the address
	 */
	public String getAddress()
	{
		return address;
	}
	
	/*
	 * Gets the menu
	 */
	public Menu getMenu()
	{
		return menu;
	}
	
	/*
	 * Sets the restaurant's name
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/*
	 * Sets the restaurant's address
	 */
	public void setAddress(String address)
	{
		this.address = address;
	}
}
