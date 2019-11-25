
public class Customer {
	
	// Address of customer
	private String address;
	// Name of customer
	private String name;
	// Customer's card
	private CreditCard card;
	
	/*
	 * Constructor
	 * Sets the name, address, and card
	 */
	public Customer(String name, String address, CreditCard card)
	{
		this.name = name;
		this.address = address;
		this.card = card;
	}
	
	/*
	 * Gets the customer's name
	 */
	public String getName()
	{
		return name;
	}
	
	/*
	 * Gets the customer's address
	 */
	public String getAddress()
	{
		return address;
	}
	
	/*
	 * Gets the customer's card
	 */
	public CreditCard getCard()
	{
		return card;
	}
	
	/*
	 * Sets the customer's address
	 */
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	/*
	 * Sets the customer's card
	 */
	public void setCard(CreditCard card)
	{
		this.card = card;
	}
}
