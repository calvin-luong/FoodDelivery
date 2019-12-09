
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class FoodSelection3 extends JFrame {

	private JPanel contentPane;
	private JTextField cost;
	private double i = 0.00;
	public String orderedDrink = "No drink";
	public String orderedFood = "No food";
	public String orderedMeal = "No meal";
	
	/**
	 * Create the frame.
	 */
	public FoodSelection3(String rn) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 618, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		// Restaurant Name
		JLabel name = new JLabel(rn + " Menu");
		name.setBackground(Color.GRAY);
		name.setOpaque(true);
		name.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		name.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel drink = new JLabel("Drink:");
		String[] drinks = {"", "Soda", "Water"};
		JComboBox drinkbox = new JComboBox(drinks);
		drinkbox.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
		{
			if (e.getSource() == drinkbox)
			{
				JComboBox cb = (JComboBox)e.getSource();
				String msg = (String)cb.getSelectedItem();
				switch (msg) 
				{
				case "":;
				case "Soda": i += 3.00; cost.setText(Double.toString(i));  orderedDrink = "Soda"; break;
				case "Water": i += 1.00; cost.setText(Double.toString(i)); orderedDrink = "Water"; break;
				}
			}
		}}
		);
		
		JLabel food = new JLabel("Food:");
		String[] foods = {"", "Large Pizza", "Stuffed Crust Pizza"};
		JComboBox foodbox = new JComboBox(foods);
		foodbox.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
		{
			if (e.getSource() == foodbox)
			{
				JComboBox cb = (JComboBox)e.getSource();
				String msg = (String)cb.getSelectedItem();
				switch (msg) 
				{
				case "":;
				case "Large Pizza": i += 15.00; cost.setText(Double.toString(i)); orderedFood = "Large Pizza"; break;
				case "Stuffed Crust Pizza": i += 17.00; cost.setText(Double.toString(i)); orderedFood = "Stuffed Crust Pizza"; break;
				}
			}
		}}
		);
		
		JLabel meal = new JLabel("Meal:");
		String[] meals = {"", "Pizza and Breadsticks", "Pasta and Breadsticks"};
		JComboBox mealbox = new JComboBox(meals);
		mealbox.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
		{
			if (e.getSource() == mealbox)
			{
				JComboBox cb = (JComboBox)e.getSource();
				String msg = (String)cb.getSelectedItem();
				switch (msg) 
				{
				case "":;
				case "Pizza and Breadsticks": i += 20.00; cost.setText(Double.toString(i)); orderedMeal = "Pizza and Breadsticks"; break;
				case "Pasta and Breadsticks": i += 10.00; cost.setText(Double.toString(i)); orderedMeal = "Pasta and Breadsticks"; break;
				}
			}
		}}
		);
		
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		
		cost = new JTextField();
		cost.setBackground(Color.LIGHT_GRAY);
		cost.setOpaque(true);
		cost.setEditable(false);
		cost.setHorizontalAlignment(SwingConstants.CENTER);
		cost.setText(Double.toString(i));
		cost.setColumns(10);
		
		JButton confirm = new JButton("Confirm Order");
		confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				OrderWaiting ow = new OrderWaiting(orderedDrink, orderedFood, orderedMeal, i);
				ow.setVisible(true);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(name, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(drink))
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(food, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(meal, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
						.addComponent(mealbox, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 590, GroupLayout.PREFERRED_SIZE)
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addComponent(back, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(cost, GroupLayout.PREFERRED_SIZE, 330, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(confirm, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.LEADING, gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(drinkbox, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(foodbox, Alignment.LEADING, 0, 590, Short.MAX_VALUE)))
					.addContainerGap(18, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(name, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(drink)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(drinkbox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(food)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(foodbox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(meal)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(mealbox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(back)
						.addComponent(cost, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
						.addComponent(confirm))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}