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

public class OrderWaiting extends JFrame {

	private JPanel contentPane;
	private JTextField orderField;
	private JTextField addressField;

	/**
	 * Create the frame.
	 */
	public OrderWaiting() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel completion = new JLabel("Thank you, First Last!");
		completion.setOpaque(true);
		completion.setHorizontalAlignment(SwingConstants.CENTER);
		completion.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		completion.setBackground(Color.GRAY);
		
		JLabel order = new JLabel("Order #:");
		
		orderField = new JTextField();
		orderField.setText("#");
		orderField.setEditable(false);
		orderField.setColumns(10);
		
		JLabel contents = new JLabel("Order Contents:");
		
		JTextPane contentsField = new JTextPane();
		contentsField.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		contentsField.setText("- ITEM\n- ITEM\n- ITEM\n\nCOST: $XX.XX");
		contentsField.setEditable(false);
		
		JLabel address = new JLabel("Delivering to...");
		
		addressField = new JTextField();
		addressField.setText("Address");
		addressField.setEditable(false);
		addressField.setColumns(10);
		
		JTextPane waiting = new JTextPane();
		waiting.setBackground(Color.LIGHT_GRAY);
		waiting.setText("Food will be delivery in XX:XX minutes.\nYou will be directed to an order completed page when the food arrives.");
		waiting.setOpaque(true);
		waiting.setEditable(false);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(contents)
					.addContainerGap(490, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(address)
					.addContainerGap(497, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(order))
						.addComponent(orderField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(466))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(43)
					.addComponent(waiting, GroupLayout.PREFERRED_SIZE, 509, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(44, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(addressField, GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(contentsField, GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(completion, GroupLayout.PREFERRED_SIZE, 590, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
					.addPreferredGap(ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
					.addComponent(waiting, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(18))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
