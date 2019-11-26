
public class Account {

	// Username
	private String username;
	// Password
	private String password;
	// Account
	private String accountType;
	// Customer info
	private Customer customerInformation;
	// Restaurant info
	private Restaurant restaurantInformation;

	/*
	 * Constructor
	 * Sets username, password, and account type
	 */
	public Account(String username, String password, String accountType)
	{
		this.username = username;
		this.password = password;

		this.accountType = accountType.toLowerCase();
		if(accountType.equals("customer") || accountType.equals("restuarant"))
		{
			this.accountType = accountType;
		}
	}

	/*
	 * Sets username
	 */
	public void setUsername(String username)
	{
		this.username = username;
	}

	/*
	 * Sets password
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}

	/*
	 * Creates the customer
	 */
	public void setCustomer(String name, String address, CreditCard card)
	{
		if (accountType.equals("customer"))
		{
			customerInformation = new Customer(name, address, card);
		}
	}

	/*
	 * Creates the restaurant
	 */
	public void setRestaurant(String name, String address)
	{
		if (accountType.equals("restuarant"))
		{
			restaurantInformation = new Restaurant(name, address);
		}
	}
}
