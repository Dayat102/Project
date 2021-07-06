package Bowling;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustomerMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerMenu frame = new CustomerMenu();
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
	public CustomerMenu() {
		setTitle("Customer Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 503, 602);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 489, 565);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblWelcomeToHunter = new JLabel("Welcome To \r\nHunter Bowling Center");
		lblWelcomeToHunter.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToHunter.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblWelcomeToHunter.setBounds(10, 125, 465, 58);
		panel.add(lblWelcomeToHunter);
		
		JLabel lblWeAppreciateYour = new JLabel("We appreciate your time with us");
		lblWeAppreciateYour.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeAppreciateYour.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblWeAppreciateYour.setBounds(54, 180, 347, 34);
		panel.add(lblWeAppreciateYour);
		
		JLabel lblThankYou = new JLabel("Thank You!");
		lblThankYou.setHorizontalAlignment(SwingConstants.CENTER);
		lblThankYou.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblThankYou.setBounds(54, 207, 347, 34);
		panel.add(lblThankYou);
		
		JButton btnContinue = new JButton("Continue");
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventRegistration frame = new EventRegistration();
				frame.setVisible(true);
				dispose();
			}
		});
		btnContinue.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnContinue.setBounds(173, 307, 118, 41);
		panel.add(btnContinue);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login frame = new login();
				frame.setVisible(true);
				dispose();
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnBack.setBounds(173, 373, 118, 41);
		panel.add(btnBack);
	}

}
