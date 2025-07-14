package mnsb;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;

public class Admin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JPanel Slidebar = new JPanel();
	private JTextField copallicant;
	private JTextField coaadhar;
	private JTextField comobail;
	private JTextField coaddress;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				Admin frame = new Admin();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public Admin() {
		setTitle("Admin Dashboard");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1288, 854);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel headerpanel = new JPanel();
		headerpanel.setBackground(Color.PINK);
		headerpanel.setBounds(0, 10, 1080, 156);
		contentPane.add(headerpanel);
		headerpanel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Admin Panel");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel.setBounds(10, 55, 200, 77);
		headerpanel.add(lblNewLabel);

		Slidebar.setBackground(new Color(255, 182, 193));
		Slidebar.setBounds(0, 166, 145, 601);
		contentPane.add(Slidebar);
		Slidebar.setLayout(null);

		JComboBox<String> reportcombo = new JComboBox<>();
		reportcombo.setModel(new DefaultComboBoxModel<>(new String[]{"Report", "Generate Report", "1", "2", "3"}));
		reportcombo.setBounds(10, 129, 117, 29);
		Slidebar.add(reportcombo);
		
		JButton createuser = new JButton("Create User");
		createuser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		createuser.setBounds(10, 59, 117, 37);
		Slidebar.add(createuser);
		
		JButton Loans = new JButton("Loans");
		Loans.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print("helloloan button preesed");
				
			}
		});
		Loans.setBounds(10, 191, 117, 37);
		Slidebar.add(Loans);
		
	

		 createuserpanel();
		
	//loan();
		
		
	}
	
	
	void loan() {
		
		JPanel panel = new JPanel();
		panel.setBounds(155, 176, 972, 594);
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton_3 = new JButton("New button");
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_1 = new JButton("New button");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_1_2 = new JButton("New button");
		panel.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_1 = new JButton("New button");
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton);
	}
	
	void createuserpanel() {
		
		JPanel createuserpanel = new JPanel();
		createuserpanel.setBounds(155, 176, 894, 594);
		
		createuserpanel.setLayout(null);
		contentPane.add(createuserpanel);

		// Fonts
		Font labelFont = new Font("Segoe UI", Font.BOLD, 14);
		Font inputFont = new Font("Segoe UI", Font.PLAIN, 14);

		// Labels and Fields
		JLabel lblName = new JLabel("Name Of Applicant:");
		lblName.setBounds(20, 194, 139, 30);
		lblName.setFont(labelFont);
		createuserpanel.add(lblName);

		JTextField txtName = new JTextField();
		txtName.setBounds(169, 426, 250, 30);
		txtName.setFont(inputFont);
		createuserpanel.add(txtName);

		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(20, 329, 89, 30);
		lblAddress.setFont(labelFont);
		createuserpanel.add(lblAddress);

		JTextField txtAddress = new JTextField();
		txtAddress.setBounds(169, 314, 250, 61);
		txtAddress.setFont(inputFont);
		createuserpanel.add(txtAddress);

		JLabel lblAadhar = new JLabel("Aadhar No:");
		lblAadhar.setBounds(20, 234, 100, 30);
		lblAadhar.setFont(labelFont);
		createuserpanel.add(lblAadhar);

		JTextField txtAadhar = new JTextField();
		txtAadhar.setBounds(169, 385, 250, 30);
		txtAadhar.setFont(inputFont);
		createuserpanel.add(txtAadhar);

		JLabel lblPan = new JLabel("PAN No:");
		lblPan.setBounds(20, 274, 100, 30);
		lblPan.setFont(labelFont);
		createuserpanel.add(lblPan);

		JTextField txtPan = new JTextField();
		txtPan.setBounds(169, 274, 250, 30);
		txtPan.setFont(inputFont);
		createuserpanel.add(txtPan);

		JLabel lblOccupation = new JLabel("Occupation:");
		lblOccupation.setBounds(20, 385, 100, 30);
		lblOccupation.setFont(labelFont);
		createuserpanel.add(lblOccupation);

		JTextField txtOccupation = new JTextField();
		txtOccupation.setBounds(169, 234, 250, 30);
		txtOccupation.setFont(inputFont);
		createuserpanel.add(txtOccupation);

		JLabel lblMobile = new JLabel("Mobile No:");
		lblMobile.setBounds(20, 426, 100, 30);
		lblMobile.setFont(labelFont);
		createuserpanel.add(lblMobile);

		JTextField txtMobile = new JTextField();
		txtMobile.setBounds(169, 194, 250, 30);
		txtMobile.setFont(inputFont);
		createuserpanel.add(txtMobile);

		// Save Button
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(220, 533, 120, 40);
		btnSave.setBackground(Color.GRAY);
		
		btnSave.setFont(new Font("Segoe UI", Font.BOLD, 16));
		createuserpanel.add(btnSave);
		
		JButton btnupdate = new JButton("Update");
		btnupdate.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btnupdate.setBackground(Color.GRAY);
		btnupdate.setBounds(370, 533, 120, 40);
		createuserpanel.add(btnupdate);
		
		JButton btndelete = new JButton("Delete");
		btndelete.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btndelete.setBackground(Color.GRAY);
		btndelete.setBounds(515, 533, 120, 40);
		createuserpanel.add(btndelete);
		
		JLabel passport = new JLabel("Photo");
		passport.setDisplayedMnemonic('s');
		passport.setBounds(20, 29, 132, 140);
		createuserpanel.add(passport);
		
		JLabel lblNameOfCoapplicant = new JLabel("Name Of Coapplicant:");
		lblNameOfCoapplicant.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNameOfCoapplicant.setBounds(441, 194, 156, 30);
		createuserpanel.add(lblNameOfCoapplicant);
		
		copallicant = new JTextField();
		copallicant.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		copallicant.setBounds(607, 194, 250, 30);
		createuserpanel.add(copallicant);
		
		JLabel lblAadhar_1 = new JLabel("Aadhar No:");
		lblAadhar_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblAadhar_1.setBounds(458, 241, 100, 30);
		createuserpanel.add(lblAadhar_1);
		
		coaadhar = new JTextField();
		coaadhar.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		coaadhar.setBounds(607, 241, 250, 30);
		createuserpanel.add(coaadhar);
		
		comobail = new JTextField();
		comobail.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		comobail.setBounds(607, 281, 250, 30);
		createuserpanel.add(comobail);
		
		JLabel lblMobile_1 = new JLabel("Mobile No:");
		lblMobile_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblMobile_1.setBounds(458, 281, 100, 30);
		createuserpanel.add(lblMobile_1);
		
		coaddress = new JTextField();
		coaddress.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		coaddress.setBounds(607, 327, 250, 61);
		createuserpanel.add(coaddress);
		
		JLabel lblAddress_1 = new JLabel("Address:");
		lblAddress_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblAddress_1.setBounds(458, 342, 89, 30);
		createuserpanel.add(lblAddress_1);

		
		
		
		// Button action (placeholder)
		btnSave.addActionListener(e -> {
			JOptionPane.showMessageDialog(this, "User Saved (Not implemented yet)");
		});
	
	}
}
