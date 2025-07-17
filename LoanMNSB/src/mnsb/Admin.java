package mnsb;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Window.Type;

public class Admin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JPanel Slidebar = new JPanel();
	private JTextField copallicant;
	private JTextField coaadhar;
	private JTextField comobail;
	private JTextField coaddress;
	private JTextField txtaapliname;
	private JTextField txtaadhar;
	private JTextField txtaddress;
	private JTextField txtpan;
	private JTextField txtocupation;
	private JTextField txtmobailno;
	private JTextField txtnamecoappli;
	private JTextField txtcoaadhar;
	private JTextField txtcoadress;
	private JTextField txtcopan;
	private JTextField txtcoocupation;
	private JTextField txtcomobailno;

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
		setResizable(false);
		setTitle("Admin Dashboard");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 0, 1293, 806);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel headerpanel = new JPanel();
		headerpanel.setBackground(Color.PINK);
		headerpanel.setBounds(0, 10, 1300, 156);
		contentPane.add(headerpanel);
		headerpanel.setLayout(null);
		headerpanel.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
		JLabel lblNewLabel = new JLabel("महिला नागरी सहकारी पतसंस्था");
		lblNewLabel.setBounds(392, 10, 546, 91);
	
	
		lblNewLabel.setFont(new Font("Mangal", Font.BOLD, 20));
		headerpanel.add(lblNewLabel);

		Slidebar.setBackground(Color.PINK);
		Slidebar.setBounds(0, 166, 145, 601);
		contentPane.add(Slidebar);
		Slidebar.setLayout(null);

		JComboBox<String> reportcombo = new JComboBox<>();
		reportcombo.setModel(new DefaultComboBoxModel<>(new String[]{"Report", "Generate Report", "1", "2", "3"}));
		reportcombo.setBounds(10, 129, 117, 29);
		Slidebar.add(reportcombo);
		
	
		
		JPanel mainpanel =  new JPanel();
		mainpanel.setBounds(148, 173, 1126, 594);
		contentPane.add(mainpanel);
		mainpanel.setLayout(new CardLayout(0, 0));
		
		JPanel pnlcreateuser = new JPanel();
		mainpanel.add(pnlcreateuser, "createuser");
		pnlcreateuser.setLayout(null);
		pnlcreateuser.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));

		JLabel lblNewLabel_4 = new JLabel("Name Applicant");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(44, 174, 86, 13);
		pnlcreateuser.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("NEW USER");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(-181, 10, 311, 36);
		pnlcreateuser.add(lblNewLabel_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Aadhar Number");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_1.setBounds(44, 219, 86, 13);
		pnlcreateuser.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Addreeas");
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_1_1.setBounds(44, 279, 86, 13);
		pnlcreateuser.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("Pan Number");
		lblNewLabel_4_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_1_1_1.setBounds(44, 332, 86, 13);
		pnlcreateuser.add(lblNewLabel_4_1_1_1);
		
		JLabel lblNewLabel_4_1_1_1_1 = new JLabel("Ocupation ");
		lblNewLabel_4_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_1_1_1_1.setBounds(44, 391, 86, 13);
		pnlcreateuser.add(lblNewLabel_4_1_1_1_1);
		
		JLabel lblNewLabel_4_1_1_1_1_1 = new JLabel("Mobail number");
		lblNewLabel_4_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_1_1_1_1_1.setBounds(44, 452, 86, 13);
		pnlcreateuser.add(lblNewLabel_4_1_1_1_1_1);
		
		txtaapliname = new JTextField();
		txtaapliname.setBounds(165, 166, 211, 29);
		pnlcreateuser.add(txtaapliname);
		txtaapliname.setColumns(10);
		
		txtaadhar = new JTextField();
		txtaadhar.setColumns(10);
		txtaadhar.setBounds(165, 211, 211, 29);
		pnlcreateuser.add(txtaadhar);
		
		txtaddress = new JTextField();
		txtaddress.setColumns(10);
		txtaddress.setBounds(165, 261, 211, 50);
		pnlcreateuser.add(txtaddress);
		
		txtpan = new JTextField();
		txtpan.setColumns(10);
		txtpan.setBounds(165, 324, 211, 29);
		pnlcreateuser.add(txtpan);
		
		txtocupation = new JTextField();
		txtocupation.setColumns(10);
		txtocupation.setBounds(165, 383, 211, 29);
		pnlcreateuser.add(txtocupation);
		
		txtmobailno = new JTextField();
		txtmobailno.setColumns(10);
		txtmobailno.setBounds(165, 444, 211, 29);
		pnlcreateuser.add(txtmobailno);
		
		txtnamecoappli = new JTextField();
		txtnamecoappli.setColumns(10);
		txtnamecoappli.setBounds(579, 166, 241, 29);
		pnlcreateuser.add(txtnamecoappli);
		
		txtcoaadhar = new JTextField();
		txtcoaadhar.setColumns(10);
		txtcoaadhar.setBounds(579, 211, 241, 29);
		pnlcreateuser.add(txtcoaadhar);
		
		txtcoadress = new JTextField();
		txtcoadress.setColumns(10);
		txtcoadress.setBounds(579, 261, 241, 47);
		pnlcreateuser.add(txtcoadress);
		
		txtcopan = new JTextField();
		txtcopan.setColumns(10);
		txtcopan.setBounds(579, 324, 241, 29);
		pnlcreateuser.add(txtcopan);
		
		txtcoocupation = new JTextField();
		txtcoocupation.setColumns(10);
		txtcoocupation.setBounds(579, 383, 241, 29);
		pnlcreateuser.add(txtcoocupation);
		
		txtcomobailno = new JTextField();
		txtcomobailno.setColumns(10);
		txtcomobailno.setBounds(579, 444, 241, 29);
		pnlcreateuser.add(txtcomobailno);
		
		JLabel lblNewLabel_4_1_1_1_1_2 = new JLabel("Ocupation ");
		lblNewLabel_4_1_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_1_1_1_1_2.setBounds(426, 386, 117, 23);
		pnlcreateuser.add(lblNewLabel_4_1_1_1_1_2);
		
		JLabel lblNewLabel_4_1_1_1_2 = new JLabel("Pan Number");
		lblNewLabel_4_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_1_1_1_2.setBounds(426, 332, 117, 13);
		pnlcreateuser.add(lblNewLabel_4_1_1_1_2);
		
		JLabel lblNewLabel_4_1_1_2 = new JLabel("Addreeas");
		lblNewLabel_4_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_1_1_2.setBounds(426, 279, 117, 13);
		pnlcreateuser.add(lblNewLabel_4_1_1_2);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("Aadhar Number");
		lblNewLabel_4_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_1_2.setBounds(426, 219, 117, 13);
		pnlcreateuser.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_2 = new JLabel("Name Co-Applicant");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_2.setBounds(426, 174, 142, 13);
		pnlcreateuser.add(lblNewLabel_4_2);
		
		JButton Save = new JButton("SAVE");
		Save.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(!validateform()) {
				JOptionPane.showMessageDialog(null, "Please fill all the required fields.");
				return;
				
				}
				System.out.println("Save button pressed");
				try {
				        String url = "jdbc:mysql://localhost:3306/mnsbank";
				        Class.forName("com.mysql.cj.jdbc.Driver");

				        Connection Con = DriverManager.getConnection(url, "root", "root");

				        String sql ="INSERT INTO customer (applicant_name,applicant_aadhaar,applicant_address,applicant_pan,applicant_occupation,applicant_mobile,coapplicant_name,coapplicant_aadhaar,coapplicant_address,coapplicant_pan,coapplicant_occupation,coapplicant_mobile) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";


				        PreparedStatement st = Con.prepareStatement(sql);

				        st.setString(1,  txtaapliname.getText());
				        st.setString(2,  txtaadhar.getText());
				        st.setString(3,  txtaddress.getText());
				        st.setString(4,  txtpan.getText());
				        st.setString(5,  txtocupation.getText());
				        st.setString(6,  txtmobailno.getText());
				        st.setString(7,  txtnamecoappli.getText());
				        st.setString(8,  txtcoaadhar.getText());
				        st.setString(9,  txtcoadress.getText());
				        st.setString(10, txtcopan.getText());
				        st.setString(11, txtcoocupation.getText());
				        st.setString(12, txtcomobailno.getText());

				        int rows = st.executeUpdate();
				        JOptionPane.showMessageDialog(null, "Successfully inserted Data into database");

				        Con.close();

				    } catch (ClassNotFoundException e1) {
				        e1.printStackTrace();
				    } catch (SQLException | HeadlessException ex) {
				        JOptionPane.showMessageDialog(null, ex);
				        ex.printStackTrace();
				    }
			}
});
		Save.setBounds(316, 519, 117, 29);
		pnlcreateuser.add(Save);
		
		JButton btnupdate = new JButton("UPDATE");
		btnupdate.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnupdate.setBounds(476, 519, 117, 29);
		pnlcreateuser.add(btnupdate);
		
		JButton btndelete = new JButton("Delete");
		btndelete.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btndelete.setBounds(634, 523, 117, 29);
		pnlcreateuser.add(btndelete);
		
		JLabel lblNewLabel_4_1_1_1_1_1_1 = new JLabel("Mobail number");
		lblNewLabel_4_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_1_1_1_1_1_1.setBounds(426, 452, 86, 13);
		pnlcreateuser.add(lblNewLabel_4_1_1_1_1_1_1);
		
		JLabel imglbl = new JLabel("New label");
		imglbl.setBounds(955, 24, 142, 128);
		pnlcreateuser.add(imglbl);
		imglbl.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));

		 JFileChooser fileChooser = new JFileChooser();
	        FileNameExtensionFilter filter = new FileNameExtensionFilter(
	                "Image Files", "jpg", "jpeg", "png", "gif");
	        fileChooser.setFileFilter(filter);
	        final File[] selectedImageFile = {null};
	        
		
		JButton cbtnclear = new JButton("CLEAR");
		cbtnclear.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cbtnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearfields();
			}
		});
		cbtnclear.setBounds(145, 519, 117, 29);
		pnlcreateuser.add(cbtnclear);
		
		JButton btnNewButton = new JButton("Add Photo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  JFileChooser chooser = new JFileChooser();
		            FileNameExtensionFilter filter = new FileNameExtensionFilter("Images", "jpg", "png", "jpeg");
		            chooser.setFileFilter(filter);

		            int result = chooser.showOpenDialog(null);
		            if (result == JFileChooser.APPROVE_OPTION) {
		                selectedImageFile[0] = chooser.getSelectedFile();
		                ImageIcon icon = new ImageIcon(selectedImageFile[0].getAbsolutePath());
		                Image img = icon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		                imglbl.setIcon(new ImageIcon(img));
		            }}
	
			
		});
		btnNewButton.setBounds(965, 170, 117, 21);
		pnlcreateuser.add(btnNewButton);
		
		JPanel pnlreport = new JPanel();
		pnlreport.setBackground(SystemColor.inactiveCaption);
		mainpanel.add(pnlreport, "report");
		
		JLabel lblNewLabel_2 = new JLabel("REPORT");
		pnlreport.add(lblNewLabel_2);
		
		JPanel pnlloans = new JPanel();
		mainpanel.add(pnlloans, "loan");
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		pnlloans.add(lblNewLabel_3);
		mainpanel.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNewLabel_1, pnlreport, lblNewLabel_2, pnlcreateuser, pnlloans, lblNewLabel_3, lblNewLabel_4, lblNewLabel_4_1, lblNewLabel_4_1_1, lblNewLabel_4_1_1_1, lblNewLabel_4_1_1_1_1, lblNewLabel_4_1_1_1_1_1, txtaapliname, txtaadhar, txtaddress, txtpan, txtocupation, txtmobailno, txtnamecoappli, txtcoaadhar, txtcoadress, txtcopan, txtcoocupation, txtcomobailno, lblNewLabel_4_1_1_1_1_2, lblNewLabel_4_1_1_1_2, lblNewLabel_4_1_1_2, lblNewLabel_4_1_2, lblNewLabel_4_2, Save, btnupdate, btndelete, lblNewLabel_4_1_1_1_1_1_1, imglbl, cbtnclear, btnNewButton}));
		
		
		JButton createuser = new JButton("Create User");
		createuser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = ((CardLayout) mainpanel.getLayout());
				cl.show(mainpanel, "createuser");
			}
		
		});
		
		
		
		createuser.setBounds(10, 59, 117, 29);
		Slidebar.add(createuser);

		JButton Loans = new JButton("Loans");
		Loans.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = ((CardLayout) mainpanel.getLayout());
				cl.show(mainpanel, "loan");
				System.out.print("helloloan button preesed");
				
			}
		});
		Loans.setBounds(10, 191, 117, 29);
		Slidebar.add(Loans);
		
	}
	
	public Boolean validateform() {
		
		if(txtaadhar.getText().trim().isEmpty() ){
			 JOptionPane.showMessageDialog(null, "Applicant aadhar is required!");
			  txtaadhar.requestFocus();
			return false;
			
		}
		
		if (txtaapliname.getText().trim().isEmpty()) {
			   JOptionPane.showMessageDialog(null, "Applicant name is required!");
				return false;

		} 
		if( txtaddress.getText().trim().isEmpty()) {
			   JOptionPane.showMessageDialog(null, "Applicant address is required!");
				return false;
		}
		if(txtpan.getText().trim().isEmpty()) {
			   JOptionPane.showMessageDialog(null, "Applicant pan is required!");
				return false;
		}
		if(txtocupation.getText().trim().isEmpty()) {
			   JOptionPane.showMessageDialog(null, "Applicant occupation is required!");
				return false;
		}
		if(txtmobailno.getText().trim().isEmpty()) {
			   JOptionPane.showMessageDialog(null, "Applicant mobile number is required!");
				return false;
		}
		if(txtnamecoappli.getText().trim().isEmpty()) {
			   JOptionPane.showMessageDialog(null, "Co-applicant name is required!");
				return false;
		}
		if(txtcoaadhar.getText().trim().isEmpty()) {
			   JOptionPane.showMessageDialog(null, "Co-applicant aadhar is required!");
				return false;
		}
         	
		if(txtcoadress.getText().trim().isEmpty()) {
			   JOptionPane.showMessageDialog(null, "Co-applicant address is required!");
				return false;
				}
		if(txtcopan.getText().trim().isEmpty()) {
			   JOptionPane.showMessageDialog(null, "Co-applicant pan is required!");
		return true;
		}
		if(txtcoocupation.getText().trim().isEmpty()) {
			   JOptionPane.showMessageDialog(null, "Co-applicant occupation is required!");
				return false;
		}
		if(txtcomobailno.getText().trim().isEmpty()) {
			   JOptionPane.showMessageDialog(null, "Co-applicant mobile number is required!");
				return false;
		}
		
		
		
		
		// Validate length of fields
		if(txtaadhar.getText().length() != 12) {
			   JOptionPane.showMessageDialog(null, "Aadhar number must be 12 digits!");
				return false;
				}
		if(txtmobailno.getText().length() != 10) {
			   JOptionPane.showMessageDialog(null, "Mobile number must be 10 digits!");
			   	return false;
			   	
		}
		if(txtcomobailno.getText().length() != 10) {
			   JOptionPane.showMessageDialog(null, "Co-applicant mobile number must be 10 digits!");
			   	return false;
			   	
		}
		if(txtpan.getText().length() != 10) {
			   JOptionPane.showMessageDialog(null, "Pan number must be 10 digits!");
			   	return false;
			   	
		
		}
		if(txtcopan.getText().length() != 10) {
			   JOptionPane.showMessageDialog(null, "Co-applicant pan number must be 10 digits!");
			   	return false;
		}
		if(txtaapliname.getText().length() < 3) {
			   JOptionPane.showMessageDialog(null, "Applicant name must be at least 3 characters long!");
			   	return false;
		}

		if(txtnamecoappli.getText().length() < 3) {
			   JOptionPane.showMessageDialog(null, "Co-applicant name must be at least 3 characters long!");
			   	return false;
		}

		if(txtaddress.getText().length()< 5)
		{
			JOptionPane.showMessageDialog(null,"Application address must be at least 5 characters long!");
			return false;
			
		}
				return true;
	}
		
	void clearfields() {
		txtaapliname.setText("");
		txtaadhar.setText("");
		txtaddress.setText("");
		txtpan.setText("");
		txtocupation.setText("");
		txtmobailno.setText("");
		txtnamecoappli.setText("");
		txtcoaadhar.setText("");
		txtcoadress.setText("");
		txtcopan.setText("");
		txtcoocupation.setText("");
		txtcomobailno.setText("");
	}

		// createuserpanel();
		
	//loan();
		
		
	
}
