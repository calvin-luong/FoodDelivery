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

public class Login {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	public static ArrayList<Account> userList = new ArrayList<Account>();
	public static int user;

	private String accountType;
	
	public static Login window;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 700, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		// Username
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		lblUsername.setBounds(122, 160, 200, 30);
		frame.getContentPane().add(lblUsername);

		// Password
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		lblPassword.setBounds(122, 212, 166, 37);
		frame.getContentPane().add(lblPassword);

		// Input for Username
		textField = new JTextField();
		textField.setFont(new Font("Comic Sans MS", Font.ITALIC, 20));
		textField.setBounds(283, 157, 300, 40);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		// Input for password
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Comic Sans MS", Font.ITALIC, 20));
		textField_1.setBounds(283, 209, 300, 40);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		// Login button
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String Username = textField.getText();
				String Password = textField_1.getText();
				boolean dne = true;

				// Checks if the username and password are correct
				for (int i = 0; i < userList.size(); i++)
				{
					String u = userList.get(i).getUsername();
					String p = userList.get(i).getPassword();
					if (u.equals(Username) && p.equals(Password))
					{						
						user = i;
						textField.setText(null);
						textField_1.setText(null);

						Main main = new Main();
						Main.main(null);
						
						dne = false;
					}
				}						

				// Error case
				if (dne == true)
				{
					JOptionPane.showMessageDialog(null, "Username or password is incorrect", "Login error", JOptionPane.ERROR_MESSAGE);
					textField.setText(null);
					textField_1.setText(null);
				}
			}
		});
		btnLogin.setBounds(283, 308, 120, 30);
		frame.getContentPane().add(btnLogin);

		// Registers the user into the system
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String Username = textField.getText();
				String Password = textField_1.getText();

				Account user = new Account(Username, Password, accountType);

				userList.add(user);
			}
		});
		btnRegister.setBounds(463, 308, 120, 30);
		frame.getContentPane().add(btnRegister);

		// Customer Account
		JRadioButton rdbtnCustomer = new JRadioButton("Customer");
		rdbtnCustomer.addActionListener(new ActionListener()
		{

			public void actionPerformed(ActionEvent e)
			{
				accountType = "Customer";
			}
		});
		rdbtnCustomer.setBounds(283, 266, 109, 23);
		frame.getContentPane().add(rdbtnCustomer);

		// Restaurant Button
		JRadioButton rdbtnRestuarant = new JRadioButton("Restuarant ");
		rdbtnRestuarant.addActionListener(new ActionListener()
		{

			public void actionPerformed(ActionEvent e)
			{
				accountType = "Restaurant";
			}
		});
		rdbtnRestuarant.setBounds(474, 266, 109, 23);
		frame.getContentPane().add(rdbtnRestuarant);
	}
}
