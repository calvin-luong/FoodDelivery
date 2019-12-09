public class Order {
	
	private String name;
	private int orderNum;
	private String f;
	private String d;
	private String m;
	private double cost;
	private String customerAddress;
	
	public Order(String name, int orderNum, String d, String f, String m, double cost, String customerAddress) {
		this.name = name;
		this.orderNum = orderNum;
		this.d = d;
		this.f = f;
		this.m = m;
		this.orderNum = orderNum;
		this.cost = cost;
		this.customerAddress = customerAddress;
	}
	
	public String getName() {
		return name;
	}
	
	public int getOrderNum() {
		return orderNum;
	}
	
	public String getDrink() {
		return d;
	}
	
	public String getFood() {
		return f;
	}
	
	public String getMeal() {
		return m;
	}
	
	public double getCost() {
		return cost;
	}
	
	public String getCustomerAddress() {
		return customerAddress;
	}

}
