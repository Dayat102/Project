package test1;
import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;

import Bowling.login;
import Car.Home;
import Futsal.Login;
import Gaming.Page;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mainpage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainpage frame = new mainpage();
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
	public mainpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1288, 745);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(0, 191, 255));
		panel.setBounds(10, 10, 1254, 688);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\WhatsApp Image 2021-06-29 at 20.31.47.jpeg"));
		lblNewLabel.setBounds(10, 10, 430, 668);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SPORTS BUSINESS");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Courgette", Font.BOLD, 35));
		lblNewLabel_1.setBounds(450, 10, 794, 78);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\WhatsApp Image 2021-06-29 at 20.31.45 (1).jpeg"));
		lblNewLabel_2.setBounds(496, 98, 225, 185);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\WhatsApp Image 2021-06-29 at 20.31.46 (1).jpeg"));
		lblNewLabel_2_1.setBounds(496, 333, 225, 185);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("New label");
		lblNewLabel_2_1_1.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\WhatsApp Image 2021-06-29 at 20.31.46 (2).jpeg"));
		lblNewLabel_2_1_1.setBounds(1006, 98, 225, 185);
		panel.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("New label");
		lblNewLabel_2_1_1_1.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\WhatsApp Image 2021-06-29 at 20.31.45.jpeg"));
		lblNewLabel_2_1_1_1.setBounds(1006, 333, 225, 185);
		panel.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("New label");
		lblNewLabel_2_1_1_1_1.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\WhatsApp Image 2021-06-29 at 20.31.46.jpeg"));
		lblNewLabel_2_1_1_1_1.setBounds(755, 175, 225, 185);
		panel.add(lblNewLabel_2_1_1_1_1);
		
		JButton btnNewButton = new JButton("BASKETBALL");
		btnNewButton.setFont(new Font("PMingLiU-ExtB", Font.BOLD | Font.ITALIC, 18));
		btnNewButton.setBounds(526, 293, 174, 30);
		panel.add(btnNewButton);
		
		JButton btnGaming = new JButton("GAMING");
		btnGaming.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Page frame = new Page();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
			}
		});
		btnGaming.setFont(new Font("PMingLiU-ExtB", Font.BOLD | Font.ITALIC, 18));
		btnGaming.setBounds(526, 528, 174, 30);
		panel.add(btnGaming);
		
		JButton btnFutsal = new JButton("FUTSAL");
		btnFutsal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login frame = new Login();
				frame.main(null);
			}
		});
		btnFutsal.setFont(new Font("PMingLiU-ExtB", Font.BOLD | Font.ITALIC, 18));
		btnFutsal.setBounds(778, 370, 174, 30);
		panel.add(btnFutsal);
		
		
		JButton btnRacingCar = new JButton("RACING CAR");
		btnRacingCar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home frame = new Home();
				frame.main(null);
			}
		});
		btnRacingCar.setFont(new Font("PMingLiU-ExtB", Font.BOLD | Font.ITALIC, 18));
		btnRacingCar.setBounds(1034, 293, 174, 30);
		panel.add(btnRacingCar);
		
		JButton btnBowling = new JButton("BOWLING");
		btnBowling.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login frame = new login();
				frame.main(null);
			}
		});
		btnBowling.setFont(new Font("PMingLiU-ExtB", Font.BOLD | Font.ITALIC, 18));
		btnBowling.setBounds(1034, 528, 174, 30);
		panel.add(btnBowling);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("");
		lblNewLabel_2_1_1_1_1_1.setIcon(new ImageIcon("C:\\Users\\ASUS\\OneDrive - UNIVERSITY UTARA MALAYSIA\\Pictures\\download (2).jpg"));
		lblNewLabel_2_1_1_1_1_1.setBounds(771, 460, 225, 129);
		panel.add(lblNewLabel_2_1_1_1_1_1);
		
		JButton btnExit = new JButton("EXIT\r\n");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("PMingLiU-ExtB", Font.BOLD | Font.ITALIC, 18));
		btnExit.setBounds(781, 599, 174, 30);
		panel.add(btnExit);
	}
}
