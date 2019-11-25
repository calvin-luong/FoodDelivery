
public class Account {
	
	private String username;
	private String password;
	private String accountType;
	private Customer customerInformation;
	private Restaurant restaurantInformation;

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
	
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public void setCustomer(String name, String address, CreditCard card)
	{
		customerInformation = new Customer(name, address, card);
	}
	
	public void setRestaurant(String name, String address)
	{
		restaurantInformation = new Restaurant(name, address);
	}
}
