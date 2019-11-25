
public class CreditCard {
	
	// Card number
	private int number;
	// Card exp date
	private int expDate;
	// Card cvv number
	private int CVV;
	// Name on card
	private String name;
	
	/*
	 * Constructor
	 * Sets the number, exp date, cvv, and name
	 */
	public CreditCard(int number, int expDate, int CVV, String name)
	{
		this.number = number;
		this.expDate = expDate;
		this.CVV = CVV;
		this.name = name;
	}
	
	/*
	 * Returns the card number
	 */
	public int getNumber()
	{
		return number;
	}
	
	/*
	 * Returns the exp date
	 */
	public int getExpDate()
	{
		return expDate;
	}
	
	/*
	 * Returns the card's CVV 
	 * (the three digit on the back)
	 */
	public int getCVV()
	{
		return CVV;
	}
	
	/*
	 * Gets the name on the card
	 */
	public String getName()
	{
		return name;
	}
	
	/*
	 * When the customer sets a new card
	 */
	public void setNewCard(int number, int expDate, int CVV)
	{
		this.number = number;
		this.expDate = expDate;
		this.CVV = CVV;
	}
}
