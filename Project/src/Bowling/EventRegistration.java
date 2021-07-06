package Bowling;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EventRegistration extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNo;
	private JTextField textFieldName;
	private JTextField textFieldAge;
	private JTextField textFieldTel;
	private JTable table;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EventRegistration frame = new EventRegistration();
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
	public EventRegistration() {
		setTitle("Event Registration");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1212, 656);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.MAGENTA));
		panel.setBackground(Color.CYAN);
		panel.setBounds(0, 0, 1198, 619);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(230, 230, 250));
		panel_1.setBounds(186, 10, 1002, 599);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblEventRegistration = new JLabel("Event Registration");
		lblEventRegistration.setHorizontalAlignment(SwingConstants.CENTER);
		lblEventRegistration.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblEventRegistration.setBackground(new Color(230, 230, 250));
		lblEventRegistration.setBounds(10, 10, 985, 56);
		panel_1.add(lblEventRegistration);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.MAGENTA));
		panel_2.setBackground(new Color(230, 230, 250));
		panel_2.setBounds(10, 76, 349, 451);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Event Info");
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
		lblName.setBounds(10, 118, 92, 35);
		panel_2.add(lblName);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblAge.setBounds(10, 183, 92, 35);
		panel_2.add(lblAge);
		
		JLabel lblTel = new JLabel("Tel.");
		lblTel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblTel.setBounds(10, 252, 92, 35);
		panel_2.add(lblTel);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblGender.setBounds(10, 319, 92, 35);
		panel_2.add(lblGender);
		
		JLabel lblEventType = new JLabel("Event Type");
		lblEventType.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblEventType.setBounds(10, 379, 92, 35);
		panel_2.add(lblEventType);
		
		textFieldNo = new JTextField();
		textFieldNo.setText("Enter No");
		textFieldNo.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldNo.setFont(new Font("Tahoma", Font.ITALIC, 15));
		textFieldNo.setColumns(10);
		textFieldNo.setBounds(112, 55, 229, 35);
		panel_2.add(textFieldNo);
		
		textFieldName = new JTextField();
		textFieldName.setText("Enter Name");
		textFieldName.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldName.setFont(new Font("Tahoma", Font.ITALIC, 15));
		textFieldName.setColumns(10);
		textFieldName.setBounds(112, 118, 229, 35);
		panel_2.add(textFieldName);
		
		textFieldAge = new JTextField();
		textFieldAge.setText("Enter Age");
		textFieldAge.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldAge.setFont(new Font("Tahoma", Font.ITALIC, 15));
		textFieldAge.setColumns(10);
		textFieldAge.setBounds(112, 183, 229, 35);
		panel_2.add(textFieldAge);
		
		textFieldTel = new JTextField();
		textFieldTel.setText("Enter Tel.");
		textFieldTel.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldTel.setFont(new Font("Tahoma", Font.ITALIC, 15));
		textFieldTel.setColumns(10);
		textFieldTel.setBounds(112, 252, 229, 35);
		panel_2.add(textFieldTel);
		
		JComboBox comboBoxGender = new JComboBox();
		comboBoxGender.setModel(new DefaultComboBoxModel(new String[] {"Select Gender", "Male", "Female"}));
		comboBoxGender.setFont(new Font("Tahoma", Font.ITALIC, 15));
		comboBoxGender.setBounds(112, 319, 229, 35);
		panel_2.add(comboBoxGender);
		
		JComboBox comboBoxEvent = new JComboBox();
		comboBoxEvent.setModel(new DefaultComboBoxModel(new String[] {"Select Event", "Shout It Out", "Bowling Bingo", "Goofy Bowling"}));
		comboBoxEvent.setFont(new Font("Tahoma", Font.ITALIC, 15));
		comboBoxEvent.setBounds(112, 379, 229, 35);
		panel_2.add(comboBoxEvent);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.MAGENTA));
		panel_2_1.setBackground(new Color(230, 230, 250));
		panel_2_1.setBounds(369, 76, 626, 451);
		panel_1.add(panel_2_1);
		panel_2_1.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_2_1.add(scrollPane, BorderLayout.NORTH);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Reference No", "Name", "Age", "Tel", "Gender", "Event Type"},
			},
			new String[] {
				"Reference No", "Name", "Age", "Tel", "Gender", "Event Type"
			}
		));
		panel_2_1.add(table, BorderLayout.CENTER);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
				textFieldNo.getText(),
				textFieldName.getText(),
				textFieldAge.getText(),
				textFieldTel.getText(),
				comboBoxGender.getSelectedItem(),
				comboBoxEvent.getSelectedItem(),
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
		btnAdd.setBounds(20, 537, 126, 42);
		panel_1.add(btnAdd);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldNo.setText("Enter No");
				textFieldName.setText("Enter Name");
				textFieldAge.setText("Enter Age");
				textFieldTel.setText("Enter Tel");
				comboBoxGender.setSelectedItem("Select Gender");
				comboBoxEvent.setSelectedItem("Select Event");
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnReset.setBackground(Color.MAGENTA);
		btnReset.setBounds(176, 537, 126, 42);
		panel_1.add(btnReset);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnUpload.setBackground(Color.MAGENTA);
		btnUpload.setBounds(379, 537, 132, 51);
		panel_1.add(btnUpload);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Event Registration System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Event Registration System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnDelete.setBackground(Color.MAGENTA);
		btnDelete.setBounds(536, 537, 132, 51);
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
		btnPrint.setBounds(697, 537, 132, 51);
		panel_1.add(btnPrint);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Event Registration System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnExit.setBackground(Color.RED);
		btnExit.setBounds(860, 537, 132, 51);
		panel_1.add(btnExit);
		
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
		btnHome.setBounds(10, 54, 125, 42);
		panel.add(btnHome);
		
		JButton btnEventRegistration = new JButton("Event Registration");
		btnEventRegistration.setForeground(Color.MAGENTA);
		btnEventRegistration.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		btnEventRegistration.setBackground(new Color(230, 230, 250));
		btnEventRegistration.setBounds(10, 155, 166, 54);
		panel.add(btnEventRegistration);
		
		JButton btnMemberRegistration = new JButton("Member Registration");
		btnMemberRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MemberRegistration frame = new MemberRegistration();
				frame.setVisible(true);
				dispose();
			}
		});
		btnMemberRegistration.setForeground(Color.MAGENTA);
		btnMemberRegistration.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		btnMemberRegistration.setBackground(new Color(230, 230, 250));
		btnMemberRegistration.setBounds(10, 219, 166, 54);
		panel.add(btnMemberRegistration);
	}

}
