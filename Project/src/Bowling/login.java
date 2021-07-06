package Bowling;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import test1.mainpage;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	public JFrame Login;
	private JRadioButton rdbtnAdmin;
	private JRadioButton rdbtnCustomer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setTitle("Hunter Bowling Center ");
		setForeground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1075, 590);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.LIGHT_GRAY));
		panel.setBounds(0, 0, 405, 553);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome To ");
		lblNewLabel.setFont(new Font("Baskerville Old Face", Font.BOLD, 30));
		lblNewLabel.setBounds(103, 165, 192, 43);
		panel.add(lblNewLabel);
		
		JLabel lblHunterBowlingCenter = new JLabel("Hunter Bowling Center\u2122");
		lblHunterBowlingCenter.setForeground(Color.BLACK);
		lblHunterBowlingCenter.setFont(new Font("Baskerville Old Face", Font.BOLD, 30));
		lblHunterBowlingCenter.setBounds(24, 199, 347, 43);
		panel.add(lblHunterBowlingCenter);
		
		JLabel lblNewLabel_1 = new JLabel("Follow us :");
		lblNewLabel_1.setFont(new Font("Algerian", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 461, 110, 29);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Facebook : @Hunter Bowling ");
		lblNewLabel_1_1.setFont(new Font("Algerian", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(10, 500, 285, 29);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Instagram : @hunterbowlingofficial");
		lblNewLabel_1_2.setFont(new Font("Algerian", Font.PLAIN, 13));
		lblNewLabel_1_2.setBounds(10, 522, 298, 29);
		panel.add(lblNewLabel_1_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.LIGHT_GRAY));
		panel_1.setBounds(407, 0, 665, 553);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Please select your role to continue...");
		lblNewLabel_2.setFont(new Font("Baskerville Old Face", Font.BOLD | Font.ITALIC, 28));
		lblNewLabel_2.setBounds(92, 142, 455, 45);
		panel_1.add(lblNewLabel_2);
		
		rdbtnAdmin = new JRadioButton("Admin");
		rdbtnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnAdmin.isSelected()) 
				{
					rdbtnCustomer.setSelected(false);
				}
			}
		});
		rdbtnAdmin.setFont(new Font("Bodoni MT", Font.ITALIC, 20));
		rdbtnAdmin.setBounds(152, 223, 118, 33);
		panel_1.add(rdbtnAdmin);
		
		rdbtnCustomer = new JRadioButton("Customer");
		rdbtnCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnCustomer.isSelected()) 
				{
					rdbtnAdmin.setSelected(false);
				}
			}
		});
		rdbtnCustomer.setFont(new Font("Bodoni MT", Font.ITALIC, 20));
		rdbtnCustomer.setBounds(359, 223, 118, 33);
		panel_1.add(rdbtnCustomer);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnAdmin.isSelected()) {
					AdminMenu frame = new AdminMenu();
					frame.setVisible(true);
					dispose();
				}
				else if(rdbtnCustomer.isSelected()) { 
					CustomerMenu frame = new CustomerMenu();
					frame.setVisible(true);
					dispose();
				}
				else
					JOptionPane.showMessageDialog(btnNext, "Please select your role to continue...");
			}
		});
		btnNext.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNext.setBounds(522, 341, 118, 40);
		panel_1.add(btnNext);
		
		JButton btnAboutUs = new JButton("About Us");
		btnAboutUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CompanyBg frame = new CompanyBg();
				frame.setVisible(true);
			}
		});
		btnAboutUs.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnAboutUs.setBounds(522, 391, 118, 40);
		panel_1.add(btnAboutUs);
		
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Hunter Bowling Center", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnExit.setBounds(522, 441, 118, 40);
		panel_1.add(btnExit);
		
		JButton btnMainMenu = new JButton("Main Menu");
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainpage cb = new mainpage();
				cb.main(null);
			}
		});
		btnMainMenu.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnMainMenu.setBounds(522, 491, 118, 40);
		panel_1.add(btnMainMenu);
	}
}
