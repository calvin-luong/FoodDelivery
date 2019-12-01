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

public class Login {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		lblUsername.setBounds(122, 160, 200, 30);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		lblPassword.setBounds(122, 212, 166, 37);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setFont(new Font("Comic Sans MS", Font.ITALIC, 20));
		textField.setBounds(283, 157, 300, 40);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Comic Sans MS", Font.ITALIC, 20));
		textField_1.setBounds(283, 209, 300, 40);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String Username = textField.getText();
						String Password = textField_1.getText();
						
						if (Username.contains("yeet") && Password.contains("dab"))
						{
							textField.setText(null);
							textField_1.setText(null);
							
							Main main = new Main();
							Main.main(null);
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Username or password is incorrect", "Login error", JOptionPane.ERROR_MESSAGE);
							textField.setText(null);
							textField_1.setText(null);
						}
					}
				});
		btnLogin.setBounds(280, 308, 120, 30);
		frame.getContentPane().add(btnLogin);
	}
}
