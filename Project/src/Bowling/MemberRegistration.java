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

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberRegistration extends JFrame {

	private JPanel contentPane;
	private JTextField txtEnterNo;
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
					MemberRegistration frame = new MemberRegistration();
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
	public MemberRegistration() {
		setTitle("Member Registration System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1210, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.MAGENTA));
		panel.setBackground(Color.CYAN);
		panel.setBounds(0, 0, 1196, 613);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(230, 230, 250));
		panel_1.setBounds(181, 10, 1005, 593);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Member Registration");
		lblNewLabel.setBackground(new Color(230, 230, 250));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel.setBounds(10, 10, 985, 56);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.MAGENTA));
		panel_2.setBackground(new Color(230, 230, 250));
		panel_2.setBounds(10, 76, 351, 439);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Member Info");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1.setBounds(10, 10, 331, 35);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblReferenceNo = new JLabel("Reference No.");
		lblReferenceNo.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblReferenceNo.setBounds(10, 55, 92, 35);
		panel_2.add(lblReferenceNo);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblName.setBounds(10, 117, 92, 35);
		panel_2.add(lblName);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblAge.setBounds(10, 177, 92, 35);
		panel_2.add(lblAge);
		
		JLabel lblTel = new JLabel("Tel.");
		lblTel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblTel.setBounds(10, 236, 92, 35);
		panel_2.add(lblTel);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblGender.setBounds(10, 302, 92, 35);
		panel_2.add(lblGender);
		
		JLabel lblMemberType = new JLabel("Member Type");
		lblMemberType.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblMemberType.setBounds(10, 369, 92, 35);
		panel_2.add(lblMemberType);
		
		txtEnterNo = new JTextField();
		txtEnterNo.setText("Enter No");
		txtEnterNo.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterNo.setFont(new Font("Tahoma", Font.ITALIC, 15));
		txtEnterNo.setColumns(10);
		txtEnterNo.setBounds(112, 55, 229, 35);
		panel_2.add(txtEnterNo);
		
		txtEnterName = new JTextField();
		txtEnterName.setText("Enter Name");
		txtEnterName.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterName.setFont(new Font("Tahoma", Font.ITALIC, 15));
		txtEnterName.setColumns(10);
		txtEnterName.setBounds(112, 116, 229, 35);
		panel_2.add(txtEnterName);
		
		txtEnterAge = new JTextField();
		txtEnterAge.setText("Enter Age");
		txtEnterAge.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterAge.setFont(new Font("Tahoma", Font.ITALIC, 15));
		txtEnterAge.setColumns(10);
		txtEnterAge.setBounds(112, 176, 229, 35);
		panel_2.add(txtEnterAge);
		
		txtEnterTel = new JTextField();
		txtEnterTel.setText("Enter Tel");
		txtEnterTel.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterTel.setFont(new Font("Tahoma", Font.ITALIC, 15));
		txtEnterTel.setColumns(10);
		txtEnterTel.setBounds(112, 235, 229, 35);
		panel_2.add(txtEnterTel);
		
		JComboBox comboBoxGender = new JComboBox();
		comboBoxGender.setModel(new DefaultComboBoxModel(new String[] {"Select Gender", "Male", "Female"}));
		comboBoxGender.setFont(new Font("Tahoma", Font.ITALIC, 15));
		comboBoxGender.setBounds(112, 302, 229, 35);
		panel_2.add(comboBoxGender);
		
		JComboBox comboBoxMember = new JComboBox();
		comboBoxMember.setModel(new DefaultComboBoxModel(new String[] {"Select Member", "Gold", "Premium"}));
		comboBoxMember.setFont(new Font("Tahoma", Font.ITALIC, 15));
		comboBoxMember.setBounds(112, 368, 229, 35);
		panel_2.add(comboBoxMember);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.MAGENTA));
		panel_2_1.setBackground(new Color(230, 230, 250));
		panel_2_1.setBounds(371, 76, 624, 439);
		panel_1.add(panel_2_1);
		panel_2_1.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_2_1.add(scrollPane, BorderLayout.NORTH);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Reference No.", "Name", "Age", "Tel.", "Gender", "Member Type"},
			},
			new String[] {
				"Reference No.", "Name", "Age", "Tel.", "Gender", "Member Type"
			}
		));
		panel_2_1.add(table, BorderLayout.CENTER);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
				txtEnterNo.getText(),
				txtEnterName.getText(),
				txtEnterAge.getText(),
				txtEnterTel.getText(),
				comboBoxGender.getSelectedItem(),
				comboBoxMember.getSelectedItem(),
				});
					
					if (table.getSelectedRow() == -1) {
						if (table.getRowCount() == 0) {
							JOptionPane.showMessageDialog(null, "Member Update confirmed", "Member Registration System",
									JOptionPane.OK_OPTION);
						}
					}	
			}
		});
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnAdd.setBackground(Color.MAGENTA);
		btnAdd.setBounds(40, 525, 126, 42);
		panel_1.add(btnAdd);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtEnterNo.setText("Enter No");
				txtEnterName.setText("Enter Name");
				txtEnterAge.setText("Enter Age");
				txtEnterTel.setText("Enter Tel");
				comboBoxGender.setSelectedItem("Select Gender");
				comboBoxMember.setSelectedItem("Select Member");
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnReset.setBackground(Color.MAGENTA);
		btnReset.setBounds(203, 525, 126, 42);
		panel_1.add(btnReset);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Member Registration System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Member Registration System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnDelete.setBackground(Color.MAGENTA);
		btnDelete.setBounds(545, 525, 132, 51);
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
		btnPrint.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnPrint.setBackground(Color.MAGENTA);
		btnPrint.setBounds(708, 525, 132, 51);
		panel_1.add(btnPrint);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Member Registration System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnExit.setBackground(Color.RED);
		btnExit.setBounds(863, 525, 132, 51);
		panel_1.add(btnExit);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnUpload.setBackground(Color.MAGENTA);
		btnUpload.setBounds(381, 525, 132, 51);
		panel_1.add(btnUpload);
		
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
		btnHome.setBackground(new Color(230, 230, 250));
		btnHome.setBounds(10, 58, 125, 42);
		panel.add(btnHome);
		
		JButton btnEventRegistration = new JButton("Event Registration");
		btnEventRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventRegistration frame = new EventRegistration();
				frame.setVisible(true);
				dispose();
			}
		});
		btnEventRegistration.setForeground(Color.MAGENTA);
		btnEventRegistration.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		btnEventRegistration.setBackground(new Color(230, 230, 250));
		btnEventRegistration.setBounds(10, 172, 161, 54);
		panel.add(btnEventRegistration);
		
		JButton btnMemberRegistration = new JButton("Member Registration");
		btnMemberRegistration.setForeground(Color.MAGENTA);
		btnMemberRegistration.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		btnMemberRegistration.setBackground(new Color(230, 230, 250));
		btnMemberRegistration.setBounds(10, 236, 166, 54);
		panel.add(btnMemberRegistration);
	}
}
