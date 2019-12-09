import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;

public class RestaurantSelection extends JFrame {

	private JPanel contentPane;
	private JTextField d1;
	private JTextField d2;
	private JTextField d3;
	private JTextField authors;
	public String rName;
	public static RestaurantSelection frame;
	
	// The user's position in the ArrayList
		public static int pos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new RestaurantSelection();
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
	public RestaurantSelection() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 759, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel title = new JLabel("Food Delivery");
		title.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		title.setOpaque(true);
		title.setBackground(Color.GRAY);
		title.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel r1 = new JLabel("WcDonald's");
		r1.setHorizontalAlignment(SwingConstants.CENTER);
		r1.setOpaque(true);
		r1.setBackground(Color.GRAY);

		JLabel r2 = new JLabel("Poppies");
		r2.setHorizontalAlignment(SwingConstants.CENTER);
		r2.setOpaque(true);
		r2.setBackground(Color.GRAY);

		JLabel r3 = new JLabel("Bizza Hut");
		r3.setHorizontalAlignment(SwingConstants.CENTER);
		r3.setOpaque(true);
		r3.setBackground(Color.GRAY);

		d1 = new JTextField();
		d1.setHorizontalAlignment(SwingConstants.CENTER);
		d1.setText("yumy borgar");
		d1.setEditable(false);
		d1.setColumns(10);

		d2 = new JTextField();
		d2.setHorizontalAlignment(SwingConstants.CENTER);
		d2.setText("chiggen");
		d2.setEditable(false);
		d2.setColumns(10);

		d3 = new JTextField();
		d3.setHorizontalAlignment(SwingConstants.CENTER);
		d3.setText("mario");
		d3.setEditable(false);
		d3.setColumns(10);

		JButton s1 = new JButton("Order");
		s1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rName = "WcDonald's";
				FoodSelection fs = new FoodSelection(rName, pos);
				fs.setVisible(true);
				setVisible(false);
			}
		});
		s1.setOpaque(true);
		s1.setBackground(Color.LIGHT_GRAY);

		JButton s2 = new JButton("Order");
		s2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rName = "Poppies";
				FoodSelection2 fs = new FoodSelection2(rName, pos);
				fs.setVisible(true);
				setVisible(false);
			}
		});
		s2.setOpaque(true);
		s2.setBackground(Color.LIGHT_GRAY);

		JButton s3 = new JButton("Order");
		s3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rName = "Bizza Hut";
				FoodSelection3 fs = new FoodSelection3(rName, pos);
				fs.setVisible(true);
				setVisible(false);
			}
		});
		s3.setOpaque(true);
		s3.setBackground(Color.LIGHT_GRAY);

		// PLACE HOLDER FOR NAME
		String name = Login.userList.get(pos).getCustomer().getName();

		authors = new JTextField();
		authors.setBackground(Color.LIGHT_GRAY);
		authors.setEditable(false);
		authors.setText("Welcome, " + name + "!");
		authors.setHorizontalAlignment(SwingConstants.CENTER);
		authors.setColumns(10);

		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Main m = new Main();
				m.main(null);
			}
		});

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(r3, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_contentPane.createSequentialGroup()
														.addComponent(r2, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
														.addGap(18)
														.addComponent(d2, 324, 324, 324))
												.addGroup(gl_contentPane.createSequentialGroup()
														.addComponent(r1, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
														.addGap(18)
														.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
																.addComponent(d3, GroupLayout.PREFERRED_SIZE, 324, GroupLayout.PREFERRED_SIZE)
																.addComponent(d1, 324, 324, 324))))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(s1, GroupLayout.PREFERRED_SIZE, 115, Short.MAX_VALUE)
												.addComponent(s2, GroupLayout.PREFERRED_SIZE, 115, Short.MAX_VALUE)
												.addComponent(s3, GroupLayout.PREFERRED_SIZE, 115, Short.MAX_VALUE)))
								.addComponent(authors, GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
								.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
										.addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
										.addGap(158)
										.addComponent(title, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap())
				);
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnBack, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
								.addComponent(title, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(s1, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
								.addComponent(r1, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createSequentialGroup()
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(d1, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(r2, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
												.addComponent(d2, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
												.addComponent(r3, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
												.addComponent(d3, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(s2, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(s3, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)))
						.addGap(18)
						.addComponent(authors, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
				);
		contentPane.setLayout(gl_contentPane);
	}
}