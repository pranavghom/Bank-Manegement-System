package mnsb;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class GoldLoan extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtName;
    private JTextField txtPan;
    private JTextField txtOccupation;
    private JTextField txtMobile;
    private JTable table;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GoldLoan frame = new GoldLoan();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public GoldLoan() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1074, 740);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 242, 224));
        contentPane.setLayout(null);

        setContentPane(contentPane);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(192, 201, 238));
        panel.setBounds(10, 10, 1040, 89);
        contentPane.add(panel);
        
        JLabel lblNewLabel = new JLabel("Gold Loan Application");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 31));
        panel.add(lblNewLabel);
        
        // Personal Information Section
        JLabel lblName = new JLabel("Name:");
        lblName.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblName.setBounds(20, 110, 100, 25);
        contentPane.add(lblName);
        
        txtName = new JTextField();
        txtName.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtName.setBounds(130, 110, 300, 25);
        contentPane.add(txtName);
        txtName.setColumns(10);
        
        JLabel lblAddress = new JLabel("Address:");
        lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblAddress.setBounds(20, 150, 100, 25);
        contentPane.add(lblAddress);
        
        JTextArea txtAddress = new JTextArea();
        txtAddress.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtAddress.setLineWrap(true);
        txtAddress.setWrapStyleWord(true);
        JScrollPane addressScroll = new JScrollPane(txtAddress);
        addressScroll.setBounds(130, 150, 420, 60);
        contentPane.add(addressScroll);
        
        JLabel lblPan = new JLabel("PAN Number:");
        lblPan.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblPan.setBounds(20, 230, 120, 25);
        contentPane.add(lblPan);
        
        txtPan = new JTextField();
        txtPan.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtPan.setBounds(130, 230, 300, 25);
        contentPane.add(txtPan);
        txtPan.setColumns(10);
        
        JLabel lblOccupation = new JLabel("Occupation:");
        lblOccupation.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblOccupation.setBounds(20, 270, 120, 25);
        contentPane.add(lblOccupation);
        
        txtOccupation = new JTextField();
        txtOccupation.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtOccupation.setBounds(130, 270, 300, 25);
        contentPane.add(txtOccupation);
        txtOccupation.setColumns(10);
        
        JLabel lblMobile = new JLabel("Mobile No:");
        lblMobile.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblMobile.setBounds(20, 310, 120, 25);
        contentPane.add(lblMobile);
        
        txtMobile = new JTextField();
        txtMobile.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtMobile.setBounds(130, 310, 300, 25);
        contentPane.add(txtMobile);
        txtMobile.setColumns(10);
        
        // Gold Details Section
        JLabel lblGoldDetails = new JLabel("Gold Details:");
        lblGoldDetails.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblGoldDetails.setBounds(20, 360, 150, 30);
        contentPane.add(lblGoldDetails);
        
        // Table for gold items
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(20, 400, 1030, 250);
        contentPane.add(scrollPane);
        
        table = new JTable();
        table.setFont(new Font("Tahoma", Font.PLAIN, 14));
        table.setModel(new DefaultTableModel(
            new Object[][] {
            },
            new String[] {
                "No.", "Gold Type", "Number of Items", "Gross Weight (g)", "Net Weight (g)", "Price (₹)"
            }
        ));
        table.getColumnModel().getColumn(0).setPreferredWidth(40);
        table.getColumnModel().getColumn(1).setPreferredWidth(150);
        table.getColumnModel().getColumn(2).setPreferredWidth(120);
        table.getColumnModel().getColumn(3).setPreferredWidth(120);
        table.getColumnModel().getColumn(4).setPreferredWidth(120);
        table.getColumnModel().getColumn(5).setPreferredWidth(150);
        scrollPane.setViewportView(table);
        
        // Add sample data to table
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addRow(new Object[]{"1", "Necklace", "2", "25.5", "22.8", "120,000"});
        model.addRow(new Object[]{"2", "Bracelet", "1", "12.3", "11.0", "60,000"});
        
        // Gold Type Selection
        JLabel lblGoldType = new JLabel("Gold Type:");
        lblGoldType.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblGoldType.setBounds(600, 110, 100, 25);
        contentPane.add(lblGoldType);
        
        JComboBox<String> comboGoldType = new JComboBox<>();
        comboGoldType.setFont(new Font("Tahoma", Font.PLAIN, 14));
        comboGoldType.setModel(new DefaultComboBoxModel<>(new String[] {
            "Necklace", "Bracelet", "Ring", "Earrings", "Chain", "Bangle", "Coin"
        }));
        comboGoldType.setBounds(730, 110, 200, 25);
        contentPane.add(comboGoldType);
        
        // Gold Weight Fields
        JLabel lblGrossWeight = new JLabel("Gross Weight (g):");
        lblGrossWeight.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblGrossWeight.setBounds(600, 150, 150, 25);
        contentPane.add(lblGrossWeight);
        
        JTextField txtGrossWeight = new JTextField();
        txtGrossWeight.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtGrossWeight.setBounds(730, 150, 200, 25);
        contentPane.add(txtGrossWeight);
        txtGrossWeight.setColumns(10);
        
        JLabel lblNetWeight = new JLabel("Net Weight (g):");
        lblNetWeight.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNetWeight.setBounds(600, 190, 150, 25);
        contentPane.add(lblNetWeight);
        
        JTextField txtNetWeight = new JTextField();
        txtNetWeight.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtNetWeight.setBounds(730, 186, 200, 25);
        contentPane.add(txtNetWeight);
        txtNetWeight.setColumns(10);
        
        // Add Item Button
        JLabel lblAddItem = new JLabel("Add Gold Item:");
        lblAddItem.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblAddItem.setBounds(600, 230, 150, 25);
        contentPane.add(lblAddItem);
        
        // Total Section
        JLabel lblTotal = new JLabel("Total Value: ₹ 180,000");
        lblTotal.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblTotal.setBounds(800, 670, 250, 30);
        contentPane.add(lblTotal);
    }
}