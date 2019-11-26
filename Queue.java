import java.util.ArrayList;

public class Queue {

	// The list of orders
	private ArrayList<Order> orders;

	/*
	 * Constructor
	 * Initializes the list
	 */
	public Queue()
	{
		orders = new ArrayList<Order>();
	}

	/*
	 * Add an order to the list
	 */
	public void addOrder(Order order)
	{
		orders.add(order);
	}

	/*
	 * Remove the order at the head of the list
	 */
	public void removeOrder()
	{
		orders.remove(0);
	}

	/*
	 * Transfers the order at the head of the list to another list
	 */
	public void moveOrder(ArrayList<Order> list)
	{
		Order temp = orders.get(0);
		orders.remove(0);
		list.add(temp);
	}

	/*
	 * Gets the order at the head of the list
	 */
	public Order getOrder()
	{
		return orders.get(0);
	}	
}
