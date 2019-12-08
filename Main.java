import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;
	
	public static Main window;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 583);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// Card info WINDOW
		JButton btnNewButton = new JButton("Card Information");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CardWindow cw = new CardWindow();
				cw.main(null);
			}
		});
		btnNewButton.setBounds(128, 296, 177, 85);
		frame.getContentPane().add(btnNewButton);
		
		// Restaurants in the area
		JButton btnNewButton_1 = new JButton("Restaurants");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				RestaurantSelection rs = new RestaurantSelection();
				rs.main(null);
				
			}
		});
		btnNewButton_1.setBounds(128, 48, 177, 85);
		frame.getContentPane().add(btnNewButton_1);
		
		// Orders
		JButton btnNewButton_2 = new JButton("Orders");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(128, 171, 177, 85);
		frame.getContentPane().add(btnNewButton_2);
		
		// Log out button
		JButton btnSignOut = new JButton("Sign Out");
		btnSignOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				window.frame.setVisible(false);
			}
		});
		btnSignOut.setBounds(10, 11, 89, 23);
		frame.getContentPane().add(btnSignOut);
		
		// Settings to add name and card
		JButton btnSetting = new JButton("Setting");
		btnSetting.setBounds(128, 413, 177, 85);
		frame.getContentPane().add(btnSetting);
		btnSetting.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Setting setting = new Setting();
				setting.main(null);
			}
		});
	}

}
