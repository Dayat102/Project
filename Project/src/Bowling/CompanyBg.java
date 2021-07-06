package Bowling;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CompanyBg extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompanyBg frame = new CompanyBg();
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
	public CompanyBg() {
		setTitle("About Us");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 481, 561);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.DARK_GRAY));
		panel.setBounds(0, 0, 467, 524);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WHO WE ARE");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setBounds(148, 22, 172, 38);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("We are Hunter Bowling Center\u2122, and we have been in business area for 3 years.");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(43, 58, 405, 36);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Our sport center is more committed than ever to providing you with the best bowling ");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(30, 81, 418, 36);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("experience possible. we hope you enjoy everything our facility has to offer and");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(43, 104, 389, 36);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("look forward to helping you have great time in the future!");
		lblNewLabel_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1_2_1.setBounds(87, 127, 294, 36);
		panel.add(lblNewLabel_1_2_1);
		
		JLabel lblMoreInfomationAbout = new JLabel("More Infomation About Us");
		lblMoreInfomationAbout.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblMoreInfomationAbout.setBounds(102, 195, 268, 38);
		panel.add(lblMoreInfomationAbout);
		
		JLabel lblNewLabel_2 = new JLabel("HUNTER BOWLING CENTER\u2122");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_2.setBounds(10, 243, 189, 29);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("BUSINESS HOURS");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_2_1.setBounds(341, 243, 116, 29);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("2, Jalan Dedap 3, Taman Johor Jaya 81100");
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(10, 274, 217, 29);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Johor Bahru Johore");
		lblNewLabel_1_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1_3_1.setBounds(10, 292, 217, 29);
		panel.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("ContactUs@HunterBowlingCenter.com");
		lblNewLabel_1_3_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1_3_2.setBounds(10, 331, 217, 29);
		panel.add(lblNewLabel_1_3_2);
		
		JLabel lblNewLabel_1_3_3 = new JLabel("017-7254144 or 012-7464744");
		lblNewLabel_1_3_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1_3_3.setBounds(10, 349, 217, 29);
		panel.add(lblNewLabel_1_3_3);
		
		JLabel lblNewLabel_1_3_4 = new JLabel("Sunday : 9.30 AM - 11.30 PM");
		lblNewLabel_1_3_4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1_3_4.setBounds(311, 274, 156, 29);
		panel.add(lblNewLabel_1_3_4);
		
		JLabel lblNewLabel_1_3_4_1 = new JLabel("Monday : 9.30 AM - 11.30 PM");
		lblNewLabel_1_3_4_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1_3_4_1.setBounds(305, 300, 162, 29);
		panel.add(lblNewLabel_1_3_4_1);
		
		JLabel lblNewLabel_1_3_4_2 = new JLabel("Tuesday : 9.30 AM - 11.30 PM");
		lblNewLabel_1_3_4_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1_3_4_2.setBounds(305, 331, 162, 29);
		panel.add(lblNewLabel_1_3_4_2);
		
		JLabel lblNewLabel_1_3_4_3 = new JLabel("Wednesday : 9.30 AM - 11.30 PM");
		lblNewLabel_1_3_4_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1_3_4_3.setBounds(289, 359, 178, 29);
		panel.add(lblNewLabel_1_3_4_3);
		
		JLabel lblNewLabel_1_3_4_4 = new JLabel("Thursday : 9.30 AM - 11.30 PM");
		lblNewLabel_1_3_4_4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1_3_4_4.setBounds(299, 385, 168, 29);
		panel.add(lblNewLabel_1_3_4_4);
		
		JLabel lblNewLabel_1_3_4_5 = new JLabel("Friday :  Close");
		lblNewLabel_1_3_4_5.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1_3_4_5.setBounds(370, 418, 97, 29);
		panel.add(lblNewLabel_1_3_4_5);
		
		JLabel lblNewLabel_1_3_4_6 = new JLabel("Saturday : 9.30 AM - 11.30 PM");
		lblNewLabel_1_3_4_6.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1_3_4_6.setBounds(305, 447, 162, 29);
		panel.add(lblNewLabel_1_3_4_6);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login frame = new login();
				frame.setVisible(true);
				dispose();
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnBack.setBounds(10, 465, 97, 38);
		panel.add(btnBack);
	}

}
