package Bowling;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminMenu extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUsername;
	private JTextField textFieldPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminMenu frame = new AdminMenu();
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
	public AdminMenu() {
		setTitle("Admin Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 499, 607);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 485, 570);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Please Enter Admin");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(114, 93, 245, 34);
		panel.add(lblNewLabel);
		
		JLabel lblUsernameAndPassword = new JLabel("Username and Password");
		lblUsernameAndPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsernameAndPassword.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblUsernameAndPassword.setBounds(61, 121, 347, 34);
		panel.add(lblUsernameAndPassword);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblUsername.setBounds(50, 210, 108, 34);
		panel.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPassword.setBounds(51, 272, 107, 34);
		panel.add(lblPassword);
		
		textFieldUsername = new JTextField();
		textFieldUsername.setFont(new Font("Tahoma", Font.ITALIC, 15));
		textFieldUsername.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldUsername.setBounds(191, 210, 234, 34);
		panel.add(textFieldUsername);
		textFieldUsername.setColumns(10);
		
		textFieldPassword = new JTextField();
		textFieldPassword.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldPassword.setFont(new Font("Tahoma", Font.ITALIC, 15));
		textFieldPassword.setColumns(10);
		textFieldPassword.setBounds(191, 272, 234, 34);
		panel.add(textFieldPassword);
		
		JLabel lblWelcomeToHunter = new JLabel("Welcome To \r\nHunter Bowling Center");
		lblWelcomeToHunter.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToHunter.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblWelcomeToHunter.setBounds(10, 10, 465, 58);
		panel.add(lblWelcomeToHunter);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					if(textFieldUsername.getText().equals("Goodday") && textFieldPassword.getText().equals("Syarif123")) {
						JOptionPane.showMessageDialog(null, "Login Succesful");

						Employee frame = new Employee();
						frame.setVisible(true);
						dispose();
					
					}else
						JOptionPane.showMessageDialog(null, "Please enter the right username and password");
					
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the right username and password");
				}
			}
		});
		btnLogin.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnLogin.setBounds(184, 359, 108, 41);
		panel.add(btnLogin);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login frame = new login();
				frame.setVisible(true);
				dispose();
			}
		});
		btnCancel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnCancel.setBounds(184, 423, 108, 41);
		panel.add(btnCancel);
	}
}
