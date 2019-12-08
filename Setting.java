import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JRadioButton;

public class Setting {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	public static Setting window;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	
	public static int pos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new Setting();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});


	}

	/**
	 * Create the application.
	 */
	public Setting() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setBounds(200, 200, 707, 631);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		// First name
		JLabel lblUsername = new JLabel("First Name");
		lblUsername.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		lblUsername.setBounds(47, 106, 200, 30);
		frame.getContentPane().add(lblUsername);

		// First name input
		textField = new JTextField();
		textField.setFont(new Font("Comic Sans MS", Font.ITALIC, 20));
		textField.setBounds(47, 139, 596, 40);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		// Last Name
		JLabel lblPassword = new JLabel("Last Name");
		lblPassword.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		lblPassword.setBounds(47, 185, 166, 37);
		frame.getContentPane().add(lblPassword);



		// Last name input
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Comic Sans MS", Font.ITALIC, 20));
		textField_1.setBounds(47, 223, 596, 40);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		// Settings
		JLabel lblSetting = new JLabel("Setting");
		lblSetting.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		lblSetting.setBounds(285, 32, 120, 62);
		frame.getContentPane().add(lblSetting);

		// Address
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		lblAddress.setBounds(47, 274, 166, 37);
		frame.getContentPane().add(lblAddress);

		// Address input
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Comic Sans MS", Font.ITALIC, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(47, 311, 596, 40);
		frame.getContentPane().add(textField_2);

		// Card number
		JLabel lblCardNumber = new JLabel("Card Number");
		lblCardNumber.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		lblCardNumber.setBounds(47, 362, 285, 37);
		frame.getContentPane().add(lblCardNumber);

		// Card Number input
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Comic Sans MS", Font.ITALIC, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(47, 399, 596, 40);
		frame.getContentPane().add(textField_3);

		// Exp date
		JLabel lblExp = new JLabel("Expiration Date");
		lblExp.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		lblExp.setBounds(47, 450, 285, 37);
		frame.getContentPane().add(lblExp);

		// Exp date input
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Comic Sans MS", Font.ITALIC, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(47, 486, 237, 40);
		frame.getContentPane().add(textField_4);

		// CVV number
		JLabel lblCvvNumber = new JLabel("CVV Number");
		lblCvvNumber.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		lblCvvNumber.setBounds(406, 450, 285, 37);
		frame.getContentPane().add(lblCvvNumber);

		// CVV number input
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Comic Sans MS", Font.ITALIC, 20));
		textField_5.setColumns(10);
		textField_5.setBounds(406, 486, 237, 40);
		frame.getContentPane().add(textField_5);


		JButton btnLogin = new JButton("Finish");
		btnLogin.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String firstName = textField.getText();
				String lastName = textField_1.getText();
				String address = textField_2.getText();
				String cardNumber = textField_3.getText();
				String expDate = textField_4.getText();
				String CVV = textField_5.getText();

				Login.userList.get(pos).setCustomer(firstName + " " + lastName, address, new CreditCard(cardNumber, expDate, CVV, firstName + " " + lastName));
				window.frame.setVisible(false);
				
				Main m = new Main();
				m.pos = pos;
				m.main(null);
			}
		});
		btnLogin.setBounds(285, 537, 120, 30);
		frame.getContentPane().add(btnLogin);

	}
}
