
public class Restaurant {
	
	private String name;
	private String address;
	private Menu menu;
		
	public Restaurant(String name, String address)
	{
		this.name = name;
		this.address = address;
		this.menu = new Menu();
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public Menu getMenu()
	{
		return menu;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
}
