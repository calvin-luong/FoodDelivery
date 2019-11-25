
public class Account {
	
	private String username;
	private String password;
	private String accountType;

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
}
