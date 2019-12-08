
public class Account {

	// Username
	private String username;
	// Password
	private String password;
	// Customer info
	private Customer customerInformation;

	/*
	 * Constructor
	 * Sets username, password, and account type
	 */
	public Account(String username, String password)
	{
		this.username = username;
		this.password = password;
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
		customerInformation = new Customer(name, address, card);
	}

	/*
	 * Returns username
	 */
	public String getUsername()
	{
		return username;
	}

	/*
	 * Returns password
	 */
	public String getPassword()
	{
		return password;
	}

	/*
	 * Gets customer
	 */
	public Customer getCustomer()
	{
		return customerInformation;
	}
}
