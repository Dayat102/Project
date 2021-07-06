package Gaming;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;

import Futsal.Financial;
import Futsal.Login;
import Gaming.Menu;
import test1.mainpage;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Page extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page frame = new Page();
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
	public Page() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1288, 745);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(51, 153, 255));
		panel.setBounds(10, 10, 1254, 688);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\WhatsApp Image 2021-06-29 at 20.31.47.jpeg"));
		lblNewLabel.setBounds(10, 0, 430, 678);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Gaming Business");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Courgette", Font.BOLD, 35));
		lblNewLabel_1.setBounds(450, 10, 794, 78);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\ASUS\\OneDrive - UNIVERSITY UTARA MALAYSIA\\Pictures\\download (3).jpg"));
		lblNewLabel_2_1.setBounds(626, 83, 478, 316);
		panel.add(lblNewLabel_2_1);
		
		JButton btnGaming = new JButton("NEXT");
		btnGaming.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu frame = new Menu();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
			}
		});
		btnGaming.setFont(new Font("PMingLiU-ExtB", Font.BOLD | Font.ITALIC, 18));
		btnGaming.setBounds(1006, 528, 174, 30);
		panel.add(btnGaming);
		
		JButton btnExit = new JButton("EXIT\r\n");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("PMingLiU-ExtB", Font.BOLD | Font.ITALIC, 18));
		btnExit.setBounds(774, 528, 174, 30);
		panel.add(btnExit);
		
		JButton btnMainMenu = new JButton("MAIN MENU");
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainpage frame = new mainpage();
				frame.setModalExclusionType(null);
	            frame.setVisible(true);
			}
		});
		btnMainMenu.setFont(new Font("PMingLiU-ExtB", Font.BOLD | Font.ITALIC, 18));
		btnMainMenu.setBounds(519, 528, 174, 30);
		panel.add(btnMainMenu);
	}
}
