import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class OrderWaiting extends JFrame {

	private JPanel contentPane;
	private JTextField orderField;
	private JTextField addressField;
	
	// The user's position in the ArrayList
			public static int pos;

	/**
	 * Create the frame.
	 */
	public OrderWaiting(String d, String f, String m, double cost, int pos) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		System.out.println("waiting" + pos);
		String name = Login.userList.get(pos).getCustomer().getName();
		String ty = "Thank you, " + name + "!";
		JLabel completion = new JLabel(ty);
		completion.setOpaque(true);
		completion.setHorizontalAlignment(SwingConstants.CENTER);
		completion.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		completion.setBackground(Color.GRAY);
		
		Random random = new Random();
		int orderNum = random.nextInt(100000);
		
		JLabel order = new JLabel("Order #: " + Integer.toString(orderNum));
		
		orderField = new JTextField();
		orderField.setText("# " + Integer.toString(orderNum));
		orderField.setEditable(false);
		orderField.setColumns(10);
		
		JLabel contents = new JLabel("Order Contents:");
		
		JTextPane contentsField = new JTextPane();
		contentsField.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		
		contentsField.setText(d + "\n" + f + "\n" + m + "\n" + "COST: " + Double.toString(cost));
		contentsField.setEditable(false);
		
		JLabel address = new JLabel("Delivering to...");
		String customerAddress = Login.userList.get(pos).getCustomer().getAddress();
		
		addressField = new JTextField();
		addressField.setText(customerAddress);
		addressField.setEditable(false);
		addressField.setColumns(10);
		
		JTextPane waiting = new JTextPane();
		waiting.setBackground(Color.LIGHT_GRAY);
		waiting.setText("Food will be delivered in XX:XX minutes.\nYou will be directed to an order completed page when the food arrives.");
		waiting.setOpaque(true);
		waiting.setEditable(false);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OrderDone od = new OrderDone();
				od.setVisible(true);
				setVisible(false);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(contents)
					.addContainerGap(468, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(address)
					.addContainerGap(477, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(order))
						.addComponent(orderField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(466))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(addressField, GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(contentsField, GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(completion, GroupLayout.PREFERRED_SIZE, 590, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(33)
					.addComponent(waiting, GroupLayout.PREFERRED_SIZE, 509, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(60, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(230)
					.addComponent(btnConfirm, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(271, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(completion, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(order)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(orderField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(contents)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(contentsField, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(address)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(addressField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(waiting, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(btnConfirm))
		);
		contentPane.setLayout(gl_contentPane);
		
		/*
		Timer t = new Timer(3, 0);
		try {
			t.startTimer();
			if (t.getSeconds() == 0)
			{
				waiting.setText("Your food is here!");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}
