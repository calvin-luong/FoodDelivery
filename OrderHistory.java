import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ScrollPaneConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OrderHistory extends JFrame {

	private JPanel contentPane;
	
	public static int pos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderHistory frame = new OrderHistory();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public OrderHistory() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 725);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Order History");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		
		for (Order o: Login.userList.get(pos).orders) {
			String name = o.getName();
			int orderNum = o.getOrderNum();
			String d = o.getDrink();
			String f = o.getFood();
			String m = o.getMeal();
			double cost = o.getCost();
			String customerAddress = o.getCustomerAddress();
			textPane.setText(textPane.getText() + "\nOrder #: " + orderNum + "\nDrink: " + d + "\nFood: " + f + "\nMeal: " + m + "\nCost: " + cost + "\nAddress: " + customerAddress + "\n");
		}
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(263, Short.MAX_VALUE)
					.addComponent(btnBack)
					.addGap(252))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(7)
					.addComponent(textPane, GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(textPane, GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnBack)
					.addGap(32))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
