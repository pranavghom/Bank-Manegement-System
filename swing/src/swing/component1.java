package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class component1 {

	private JFrame frame;
	private JTextField txtuser;
	private JTextField txtpass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					component1 window = new component1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public component1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 577, 409);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		txtuser = new JTextField();
		txtuser.setBounds(252, 160, 221, 35);
		frame.getContentPane().add(txtuser);
		txtuser.setColumns(10);
		
		txtpass = new JTextField();
		txtpass.setColumns(10);
		txtpass.setBounds(252, 211, 221, 35);
		frame.getContentPane().add(txtpass);
		
		JLabel lblNewLabel_1 = new JLabel("User name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setBounds(148, 164, 94, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password ");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(148, 215, 94, 20);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblerror = new JLabel("");
		lblerror.setForeground(Color.RED);
		lblerror.setBounds(267, 257, 188, 35);
		frame.getContentPane().add(lblerror);
		JButton btn = new JButton("Login");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = txtuser.getText();
				String password = txtpass.getText();

				if(username.equals ("admin") && password.equals("super") ) {
					JOptionPane.showMessageDialog(null, " password is correct ");
				}
				else {
					lblerror.setText("try again");
					JOptionPane.showMessageDialog(null, " password is incorrect ");
				}
			}
		});
		btn.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn.setBounds(277, 280, 129, 46);
		frame.getContentPane().add(btn);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(10, 11, 543, 100);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Log In");
		lblNewLabel.setBounds(248, 11, 246, 78);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		
	
	}
}
