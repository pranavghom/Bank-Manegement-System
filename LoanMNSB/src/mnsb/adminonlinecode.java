package mnsb;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class adminonlinecode extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private final JPanel Slidebar = new JPanel();
    private JTextField[] userFields;
    private final String[] labels = {"Name", "Address", "Aadhar No", "PAN No", "Occupation", "Mobile No"};
    private final String[] icons = {"user.png", "address.png", "aadhar.png", "pan.png", "work.png", "phone.png"};

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                adminonlinecode frame = new adminonlinecode();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public adminonlinecode() {
        setTitle("Admin Dashboard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1288, 854);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        setContentPane(contentPane);

        setupHeaderPanel();
        setupSidebar();
        setupCreateUserPanel();
    }

    private void setupHeaderPanel() {
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(Color.PINK);
        headerPanel.setBounds(0, 10, 1264, 140);
        headerPanel.setLayout(null);
        contentPane.add(headerPanel);

        JLabel lblTitle = new JLabel("Admin Panel");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 24));
        lblTitle.setBounds(550, 50, 200, 30);
        headerPanel.add(lblTitle);
    }

    private void setupSidebar() {
        Slidebar.setBackground(new Color(255, 182, 193));
        Slidebar.setBounds(0, 176, 136, 611);
        Slidebar.setLayout(null);
        contentPane.add(Slidebar);

        JComboBox<String> reportCombo = new JComboBox<>(new String[]{"Report", "Generate Report", "1", "2", "3"});
        reportCombo.setBounds(10, 129, 117, 29);
        Slidebar.add(reportCombo);

        JButton btnCreateUser = new JButton("Create User");
        btnCreateUser.setBounds(10, 64, 117, 29);
        Slidebar.add(btnCreateUser);

        JButton btnLoan = new JButton("Loan");
        btnLoan.setBounds(10, 182, 117, 29);
        Slidebar.add(btnLoan);
    }

    private void setupCreateUserPanel() {
        JPanel createUserPanel = new JPanel();
        createUserPanel.setBounds(146, 222, 1118, 585);
        createUserPanel.setLayout(null);
        createUserPanel.setBackground(Color.WHITE);
        createUserPanel.setBorder(BorderFactory.createTitledBorder("New User Details"));
        contentPane.add(createUserPanel);

        Font labelFont = new Font("Segoe UI", Font.BOLD, 15);
        Font inputFont = new Font("Segoe UI", Font.PLAIN, 14);

        userFields = new JTextField[labels.length];
        int y = 40;

        for (int i = 0; i < labels.length; i++) {
            JLabel iconLabel = new JLabel(new ImageIcon(getClass().getResource("/icons/" + icons[i])));
            iconLabel.setBounds(30, y, 32, 32);
            createUserPanel.add(iconLabel);

            JLabel label = new JLabel(labels[i] + ":");
            label.setFont(labelFont);
            label.setBounds(70, y, 120, 30);
            createUserPanel.add(label);

            JTextField textField = new JTextField();
            textField.setFont(inputFont);
            textField.setBounds(200, y, 350, 30);
            createUserPanel.add(textField);
            userFields[i] = textField;

            y += 50;
        }

        JButton btnSave = createButton("\uD83D\uDCBE Save", new Color(33, 150, 243), 200, y + 20);
        btnSave.addActionListener(e -> JOptionPane.showMessageDialog(this, "User Saved (not implemented yet)"));
        createUserPanel.add(btnSave);

        JButton btnReset = createButton("\uD83E\uDEB9 Reset", new Color(220, 53, 69), 360, y + 20);
        btnReset.addActionListener(e -> resetForm());
        createUserPanel.add(btnReset);
    }

    private JButton createButton(String text, Color bgColor, int x, int y) {
        JButton button = new JButton(text);
        button.setBounds(157, 361, 140, 40);
        button.setBackground(bgColor);
        button.setForeground(Color.BLACK);
        button.setFont(new Font("Segoe UI", Font.BOLD, 16));
        button.setFocusPainted(false);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        return button;
    }

    private void resetForm() {
        for (JTextField field : userFields) {
            field.setText("");
        }
    }
}
