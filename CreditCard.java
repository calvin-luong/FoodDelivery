
public class CreditCard {
	
	// Card number
	private String number;
	// Card exp date
	private String expDate;
	// Card cvv number
	private String CVV;
	// Name on card
	private String name;
	
	/*
	 * Constructor
	 * Sets the number, exp date, cvv, and name
	 */
	public CreditCard(String number, String expDate, String CVV, String name)
	{
		this.number = number;
		this.expDate = expDate;
		this.CVV = CVV;
		this.name = name;
	}
	
	/*
	 * Returns the card number
	 */
	public String getNumber()
	{
		return number;
	}
	
	/*
	 * Returns the exp date
	 */
	public String getExpDate()
	{
		return expDate;
	}
	
	/*
	 * Returns the card's CVV 
	 * (the three digit on the back)
	 */
	public String getCVV()
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
	public void setNewCard(String number, String expDate, String CVV)
	{
		this.number = number;
		this.expDate = expDate;
		this.CVV = CVV;
	}
}
