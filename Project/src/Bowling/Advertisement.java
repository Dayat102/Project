package Bowling;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Advertisement extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldTitle;
	private JTextField textFieldDateStart;
	private JTextField txtKeyInDateEnd;
	private JTable table;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Advertisement frame = new Advertisement();
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
	public Advertisement() {
		setTitle("Advertisment");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1253, 732);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.MAGENTA);
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(255, 175, 175)));
		panel.setBounds(0, 0, 1239, 695);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login frame = new login();
				frame.setVisible(true);
				dispose();
			}
		});
		btnHome.setForeground(Color.MAGENTA);
		btnHome.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		btnHome.setBackground(Color.LIGHT_GRAY);
		btnHome.setBounds(10, 29, 125, 34);
		panel.add(btnHome);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setForeground(Color.BLACK);
		panel_1.setBounds(193, 10, 1036, 675);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblAdvertisment = new JLabel("Advertisment and Marketing");
		lblAdvertisment.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdvertisment.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblAdvertisment.setBounds(10, 10, 1016, 56);
		panel_1.add(lblAdvertisment);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.MAGENTA));
		panel_2.setBounds(10, 76, 1016, 216);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblTitleAds = new JLabel("Title Ads");
		lblTitleAds.setForeground(Color.BLACK);
		lblTitleAds.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblTitleAds.setBounds(10, 39, 85, 24);
		panel_2.add(lblTitleAds);
		
		textFieldTitle = new JTextField();
		textFieldTitle.setText("Enter Title Ads");
		textFieldTitle.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldTitle.setForeground(Color.BLACK);
		textFieldTitle.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		textFieldTitle.setColumns(10);
		textFieldTitle.setBounds(105, 32, 808, 93);
		panel_2.add(textFieldTitle);
		
		JLabel lblDateStart = new JLabel("Date Start");
		lblDateStart.setForeground(Color.BLACK);
		lblDateStart.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblDateStart.setBounds(10, 149, 103, 34);
		panel_2.add(lblDateStart);
		
		textFieldDateStart = new JTextField();
		textFieldDateStart.setText("Enter Date Start");
		textFieldDateStart.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldDateStart.setForeground(Color.BLACK);
		textFieldDateStart.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		textFieldDateStart.setColumns(10);
		textFieldDateStart.setBounds(135, 150, 247, 34);
		panel_2.add(textFieldDateStart);
		
		JLabel lblDateEnd = new JLabel("Date End");
		lblDateEnd.setForeground(Color.BLACK);
		lblDateEnd.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblDateEnd.setBounds(479, 149, 103, 34);
		panel_2.add(lblDateEnd);
		
		txtKeyInDateEnd = new JTextField();
		txtKeyInDateEnd.setText("Enter Date End");
		txtKeyInDateEnd.setHorizontalAlignment(SwingConstants.CENTER);
		txtKeyInDateEnd.setForeground(Color.BLACK);
		txtKeyInDateEnd.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtKeyInDateEnd.setColumns(10);
		txtKeyInDateEnd.setBounds(607, 149, 247, 34);
		panel_2.add(txtKeyInDateEnd);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.LIGHT_GRAY);
		panel_2_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.MAGENTA));
		panel_2_1.setBounds(10, 364, 1016, 247);
		panel_1.add(panel_2_1);
		panel_2_1.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_2_1.add(scrollPane, BorderLayout.NORTH);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Title Ads", "Date Start", "Date End"},
			},
			new String[] {
				"Title Ads", "Date Start", "Date End"
			}
		));
		panel_2_1.add(table, BorderLayout.CENTER);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
				textFieldTitle.getText(),
				textFieldDateStart.getText(),
				txtKeyInDateEnd.getText(),
				});
					
					if (table.getSelectedRow() == -1) {
						if (table.getRowCount() == 0) {
							JOptionPane.showMessageDialog(null, "Employee Update confirmed", "Employee Management System",
									JOptionPane.OK_OPTION);
						}
					}	
			}
		});
		btnAdd.setBackground(Color.MAGENTA);
		btnAdd.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnAdd.setBounds(640, 302, 121, 39);
		panel_1.add(btnAdd);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldTitle.setText("Enter Title Ads");
				textFieldDateStart.setText("Enter Date Start");
				txtKeyInDateEnd.setText("Enter Date End");
			}
		});
		btnReset.setBackground(Color.MAGENTA);
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnReset.setBounds(826, 302, 121, 39);
		panel_1.add(btnReset);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Advertisment System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Advertisment System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setBackground(Color.MAGENTA);
		btnDelete.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnDelete.setBounds(539, 621, 121, 39);
		panel_1.add(btnDelete);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					table.print();
				} catch (java.awt.print.PrinterException e1) {
					System.err.format("No printer found", e1.getMessage());
				}
			}
		});
		btnPrint.setBackground(Color.MAGENTA);
		btnPrint.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnPrint.setBounds(705, 621, 121, 39);
		panel_1.add(btnPrint);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Advertisment System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setBackground(Color.RED);
		btnExit.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnExit.setBounds(869, 621, 121, 39);
		panel_1.add(btnExit);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.setBackground(Color.MAGENTA);
		btnUpload.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnUpload.setBounds(374, 621, 121, 39);
		panel_1.add(btnUpload);
		
		JButton btnFinancial = new JButton("Financial");
		btnFinancial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Finance frame = new Finance();
				frame.setVisible(true);
				dispose();
			}
		});
		btnFinancial.setForeground(Color.MAGENTA);
		btnFinancial.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		btnFinancial.setBackground(Color.LIGHT_GRAY);
		btnFinancial.setBounds(10, 143, 125, 34);
		panel.add(btnFinancial);
		
		JButton btnEmployee = new JButton("Employee");
		btnEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee frame = new Employee();
				frame.setVisible(true);
				dispose();
			}
		});
		btnEmployee.setForeground(Color.MAGENTA);
		btnEmployee.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		btnEmployee.setBackground(Color.LIGHT_GRAY);
		btnEmployee.setBounds(10, 187, 125, 34);
		panel.add(btnEmployee);
		
		JButton btnAdvertisment = new JButton("Advertisment");
		btnAdvertisment.setForeground(Color.MAGENTA);
		btnAdvertisment.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		btnAdvertisment.setBackground(Color.LIGHT_GRAY);
		btnAdvertisment.setBounds(10, 231, 125, 34);
		panel.add(btnAdvertisment);
	}
}
