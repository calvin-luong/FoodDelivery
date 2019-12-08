import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class CardWindow {

	private JFrame frame;
	
	public static CardWindow window;
	
	// The user's position in the ArrayList
	public static int pos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new CardWindow();
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
	public CardWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		// Grabs card info
		System.out.println(pos);
		CreditCard c = Login.userList.get(pos).getCustomer().getCard();
		
		String number = c.getNumber();
		String expDate = c.getExpDate();
		String CVV = c.getCVV();

		
		frame = new JFrame();
		frame.setBounds(100, 100, 756, 467);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// Number
		JLabel lblCardname = new JLabel(number);
		lblCardname.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		lblCardname.setBounds(30, 98, 414, 60);
		frame.getContentPane().add(lblCardname);
		
		// Exp date
		JLabel lblExpirationDate = new JLabel(expDate);
		lblExpirationDate.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		lblExpirationDate.setBounds(30, 196, 316, 60);
		frame.getContentPane().add(lblExpirationDate);
		
		// CVV
		JLabel lblCvv = new JLabel(CVV);
		lblCvv.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		lblCvv.setBounds(30, 304, 170, 38);
		frame.getContentPane().add(lblCvv);
		
		// Title
		JLabel lblYourCard = new JLabel("Your Card");
		lblYourCard.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		lblYourCard.setBounds(295, 11, 149, 60);
		frame.getContentPane().add(lblYourCard);
		
		// Back
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		btnBack.setBounds(30, 28, 115, 38);
		frame.getContentPane().add(btnBack);
		btnBack.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				window.frame.setVisible(false);
			}
		});
	}

}
