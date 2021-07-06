package Bowling;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Employee extends JFrame {

	private JPanel contentPane;
	private JTextField txtEntertId;
	private JTextField txtEnterName;
	private JTextField txtEnterAge;
	private JTextField txtEnterTel;
	private JTable table;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee frame = new Employee();
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
	public Employee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1239, 673);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.MAGENTA);
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.PINK));
		panel.setBounds(0, 0, 1225, 636);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(190, 10, 1025, 616);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Management");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(72, 10, 842, 56);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.MAGENTA));
		panel_2.setBounds(10, 76, 330, 453);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Employee Registration");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 10, 310, 35);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Employee ID");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(10, 77, 92, 35);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Name");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(10, 122, 92, 35);
		panel_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Age");
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2_2.setBounds(10, 167, 92, 35);
		panel_2.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Tel");
		lblNewLabel_2_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2_3.setBounds(10, 212, 92, 35);
		panel_2.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Gender");
		lblNewLabel_2_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2_4.setBounds(10, 257, 92, 35);
		panel_2.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("Position");
		lblNewLabel_2_5.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2_5.setBounds(10, 302, 92, 35);
		panel_2.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_6 = new JLabel("Salary");
		lblNewLabel_2_6.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2_6.setBounds(10, 347, 92, 35);
		panel_2.add(lblNewLabel_2_6);
		
		txtEntertId = new JTextField();
		txtEntertId.setFont(new Font("Tahoma", Font.ITALIC, 15));
		txtEntertId.setHorizontalAlignment(SwingConstants.CENTER);
		txtEntertId.setText("Enter ID");
		txtEntertId.setBounds(112, 77, 208, 35);
		panel_2.add(txtEntertId);
		txtEntertId.setColumns(10);
		
		txtEnterName = new JTextField();
		txtEnterName.setFont(new Font("Tahoma", Font.ITALIC, 15));
		txtEnterName.setText("Enter Name");
		txtEnterName.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterName.setColumns(10);
		txtEnterName.setBounds(112, 122, 208, 35);
		panel_2.add(txtEnterName);
		
		txtEnterAge = new JTextField();
		txtEnterAge.setFont(new Font("Tahoma", Font.ITALIC, 15));
		txtEnterAge.setText("Enter Age");
		txtEnterAge.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterAge.setColumns(10);
		txtEnterAge.setBounds(112, 167, 208, 35);
		panel_2.add(txtEnterAge);
		
		txtEnterTel = new JTextField();
		txtEnterTel.setFont(new Font("Tahoma", Font.ITALIC, 15));
		txtEnterTel.setText("Enter Tel");
		txtEnterTel.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterTel.setColumns(10);
		txtEnterTel.setBounds(112, 212, 208, 35);
		panel_2.add(txtEnterTel);
		
		JComboBox comboBoxGender = new JComboBox();
		comboBoxGender.setModel(new DefaultComboBoxModel(new String[] {"Select Gender", "Male", "Female"}));
		comboBoxGender.setFont(new Font("Tahoma", Font.ITALIC, 15));
		comboBoxGender.setBounds(112, 257, 208, 35);
		panel_2.add(comboBoxGender);
		
		JComboBox comboBoxPosition = new JComboBox();
		comboBoxPosition.setModel(new DefaultComboBoxModel(new String[] {"Select Position", "Manager", "Operator", "Cleaner"}));
		comboBoxPosition.setFont(new Font("Tahoma", Font.ITALIC, 15));
		comboBoxPosition.setBounds(112, 302, 208, 35);
		panel_2.add(comboBoxPosition);
		
		JComboBox comboBoxSalary = new JComboBox();
		comboBoxSalary.setModel(new DefaultComboBoxModel(new String[] {"Salary", "RM 4500.00", "RM 2400.00", "RM1200.00"}));
		comboBoxSalary.setFont(new Font("Tahoma", Font.ITALIC, 15));
		comboBoxSalary.setBounds(112, 347, 208, 35);
		panel_2.add(comboBoxSalary);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
				txtEntertId.getText(),
				txtEnterName.getText(),
				txtEnterAge.getText(),
				txtEnterTel.getText(),
				comboBoxGender.getSelectedItem(),
				comboBoxPosition.getSelectedItem(),
				comboBoxSalary.getSelectedItem(),
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
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnAdd.setBounds(32, 552, 126, 42);
		panel_1.add(btnAdd);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtEntertId.setText("Enter ID");
				txtEnterName.setText("Enter Name");
				txtEnterAge.setText("Enter Age");
				txtEnterTel.setText("Enter Tel");
				comboBoxGender.setSelectedItem("Select Gender");
				comboBoxPosition.setSelectedItem("Select Position");
				comboBoxSalary.setSelectedItem("Salary");
			}
		});
		btnReset.setBackground(Color.MAGENTA);
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnReset.setBounds(191, 552, 126, 42);
		panel_1.add(btnReset);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel_3.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.MAGENTA));
		panel_3.setBounds(350, 76, 665, 453);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 645, 372);
		panel_3.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Employee ID", "Name", "Age", "Tel", "Gender", "Position", "Salary"},
			},
			new String[] {
				"Employee ID", "Name", "Age", "Tel", "Gender", "Position", "Salary"
			}
		));
		table.setFont(new Font("Times New Roman", Font.BOLD, 15));
		scrollPane.setColumnHeaderView(table);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.setBackground(Color.MAGENTA);
		btnUpload.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnUpload.setBounds(508, 392, 132, 51);
		panel_3.add(btnUpload);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Employee Management System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Employee Management System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setBackground(Color.MAGENTA);
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnDelete.setBounds(527, 543, 132, 51);
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
		btnPrint.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnPrint.setBounds(710, 543, 132, 51);
		panel_1.add(btnPrint);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Employee Managment", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setBackground(Color.RED);
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnExit.setBounds(883, 543, 132, 51);
		panel_1.add(btnExit);
		
		JButton btnHome = new JButton("Home");
		btnHome.setForeground(Color.MAGENTA);
		btnHome.setBackground(Color.LIGHT_GRAY);
		btnHome.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login frame = new login();
				frame.setVisible(true);
				dispose();
			}
		});
		btnHome.setBounds(10, 27, 125, 34);
		panel.add(btnHome);
		
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
		btnFinancial.setBounds(10, 134, 125, 34);
		panel.add(btnFinancial);
		
		JButton btnEmployee = new JButton("Employee");
		btnEmployee.setForeground(Color.MAGENTA);
		btnEmployee.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		btnEmployee.setBackground(Color.LIGHT_GRAY);
		btnEmployee.setBounds(10, 178, 125, 34);
		panel.add(btnEmployee);
		
		JButton btnAdvertisment = new JButton("Advertisment");
		btnAdvertisment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Advertisement frame = new Advertisement();
				frame.setVisible(true);
				dispose();
			}
		});
		btnAdvertisment.setForeground(Color.MAGENTA);
		btnAdvertisment.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		btnAdvertisment.setBackground(Color.LIGHT_GRAY);
		btnAdvertisment.setBounds(10, 222, 125, 34);
		panel.add(btnAdvertisment);
	}
}
