package mnsb;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Color;

public class MainMNSB extends JFrame {
//Dhiraj second msg gold
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMNSB frame = new MainMNSB();
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
	public MainMNSB() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1074, 740);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 242, 224));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 201, 238));
		panel.setBounds(10, 10, 1040, 89);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Gold Loan");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 31));
		panel.add(lblNewLabel);
	}
}
