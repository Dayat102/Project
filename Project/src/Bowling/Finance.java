package Bowling;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Finance extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldAllFee;
	private JTextField textFieldEvent;
	private JTextField textFieldMember;
	private JTextField textFieldTIncome;
	private JTextField textFieldTExpense;
	private JTable table;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finance frame = new Finance();
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
	public Finance() {
		setTitle("Financial System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1247, 674);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.BLACK));
		panel.setBackground(Color.MAGENTA);
		panel.setBounds(0, 0, 1233, 637);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.BLACK));
		panel_1.setBackground(Color.CYAN);
		panel_1.setBounds(185, 10, 1038, 67);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Finance");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 1150, 54);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panel_2.setBackground(Color.CYAN);
		panel_2.setBounds(185, 89, 329, 444);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblMonth = new JLabel("Month");
		lblMonth.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblMonth.setBounds(10, 10, 106, 33);
		panel_2.add(lblMonth);
		
		JComboBox comboBoxMonth = new JComboBox();
		comboBoxMonth.setFont(new Font("Tahoma", Font.ITALIC, 15));
		comboBoxMonth.setModel(new DefaultComboBoxModel(new String[] {"Select Month", "January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "November", "October", "December", ""}));
		comboBoxMonth.setBounds(126, 10, 194, 33);
		panel_2.add(comboBoxMonth);
		
		JLabel lblAllFee = new JLabel("All Fee");
		lblAllFee.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAllFee.setBounds(10, 69, 106, 33);
		panel_2.add(lblAllFee);
		
		textFieldAllFee = new JTextField();
		textFieldAllFee.setBounds(126, 69, 194, 33);
		panel_2.add(textFieldAllFee);
		textFieldAllFee.setColumns(10);
		
		JLabel lblEvent = new JLabel("Event");
		lblEvent.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblEvent.setBounds(10, 127, 106, 33);
		panel_2.add(lblEvent);
		
		JLabel lblMember = new JLabel("Member");
		lblMember.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblMember.setBounds(10, 192, 106, 33);
		panel_2.add(lblMember);
		
		textFieldEvent = new JTextField();
		textFieldEvent.setColumns(10);
		textFieldEvent.setBounds(126, 127, 194, 33);
		panel_2.add(textFieldEvent);
		
		textFieldMember = new JTextField();
		textFieldMember.setColumns(10);
		textFieldMember.setBounds(126, 192, 194, 33);
		panel_2.add(textFieldMember);
		
		JLabel lblTotalIncome = new JLabel("Total Income");
		lblTotalIncome.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblTotalIncome.setBounds(10, 258, 106, 33);
		panel_2.add(lblTotalIncome);
		
		JLabel lblTotalExpense = new JLabel("Total Expense");
		lblTotalExpense.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblTotalExpense.setBounds(10, 321, 106, 33);
		panel_2.add(lblTotalExpense);
		
		textFieldTIncome = new JTextField();
		textFieldTIncome.setColumns(10);
		textFieldTIncome.setBounds(126, 258, 194, 33);
		panel_2.add(textFieldTIncome);
		
		textFieldTExpense = new JTextField();
		textFieldTExpense.setColumns(10);
		textFieldTExpense.setBounds(126, 321, 194, 33);
		panel_2.add(textFieldTExpense);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.BLACK));
		panel_1_1.setBackground(Color.CYAN);
		panel_1_1.setBounds(180, 543, 1043, 84);
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
				comboBoxMonth.getSelectedItem(),
				textFieldAllFee.getText(),
				textFieldEvent.getText(),
				textFieldMember.getText(),
				textFieldTIncome.getText(),
				textFieldTExpense.getText(),
				});
					
					if (table.getSelectedRow() == -1) {
						if (table.getRowCount() == 0) {
							JOptionPane.showMessageDialog(null, "Finance Update confirmed", "Financial System",
									JOptionPane.OK_OPTION);
						}
					}
			}
		});
		btnAdd.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnAdd.setBounds(27, 21, 109, 37);
		panel_1_1.add(btnAdd);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBoxMonth.setSelectedItem("");
				textFieldAllFee.setText("");
				textFieldEvent.setText("");
				textFieldMember.setText("");
				textFieldTIncome.setText("");
				textFieldTExpense.setText("");
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnReset.setBounds(186, 21, 109, 37);
		panel_1_1.add(btnReset);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnUpload.setBounds(367, 21, 130, 37);
		panel_1_1.add(btnUpload);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Financial System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Financial System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnDelete.setBounds(533, 21, 130, 37);
		panel_1_1.add(btnDelete);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Financial System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnExit.setBounds(887, 21, 130, 37);
		panel_1_1.add(btnExit);
		
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
		btnPrint.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnPrint.setBounds(713, 21, 130, 37);
		panel_1_1.add(btnPrint);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panel_2_1.setBackground(Color.CYAN);
		panel_2_1.setBounds(524, 87, 699, 444);
		panel.add(panel_2_1);
		panel_2_1.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_2_1.add(scrollPane, BorderLayout.NORTH);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Month", "All Fee", "Event", "Member", "Total Income", "Total Expense"},
			},
			new String[] {
				"Month", "All Fee", "Event", "Member", "Total Income", "Total Expense"
			}
		));
		panel_2_1.add(table, BorderLayout.CENTER);
		
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
		btnHome.setBounds(10, 31, 125, 34);
		panel.add(btnHome);
		
		JButton btnFinancial = new JButton("Financial");
		btnFinancial.setForeground(Color.MAGENTA);
		btnFinancial.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		btnFinancial.setBackground(Color.LIGHT_GRAY);
		btnFinancial.setBounds(10, 140, 125, 34);
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
		btnEmployee.setBounds(10, 184, 125, 34);
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
		btnAdvertisment.setBounds(10, 228, 125, 34);
		panel.add(btnAdvertisment);
	}

}
