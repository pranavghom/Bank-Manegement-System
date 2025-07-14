package mnsb;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class temp extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel mainPanel; // CardLayout container

    public temp() {
        setTitle("Admin Dashboard");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(900, 600);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Sidebar
        JPanel sidebar = new JPanel();
        sidebar.setLayout(new GridLayout(0, 1, 10, 10));
        sidebar.setBackground(Color.PINK);
        sidebar.setPreferredSize(new Dimension(150, 0));

        JButton btnUser = new JButton("User");
        JButton btnLoan = new JButton("Loan");
        JButton btnReport = new JButton("Report");

        sidebar.add(btnUser);
        sidebar.add(btnLoan);
        sidebar.add(btnReport);
        add(sidebar, BorderLayout.WEST);

        // Main Panel with CardLayout
        mainPanel = new JPanel(new CardLayout());

        JPanel userPanel = new JPanel();
        userPanel.setBackground(Color.LIGHT_GRAY);
        userPanel.add(new JLabel("User Panel"));

        JPanel loanPanel = new JPanel();
        loanPanel.setBackground(Color.CYAN);
        loanPanel.add(new JLabel("Loan Panel"));

        JPanel reportPanel = new JPanel();
        reportPanel.setBackground(Color.ORANGE);
        reportPanel.add(new JLabel("Report Panel"));

        mainPanel.add(userPanel, "User");
        mainPanel.add(loanPanel, "Loan");
        mainPanel.add(reportPanel, "Report");

        add(mainPanel, BorderLayout.CENTER);

        // Button Actions
        btnUser.addActionListener(e -> switchPanel("User"));
        btnLoan.addActionListener(e -> switchPanel("Loan"));
        btnReport.addActionListener(e -> switchPanel("Report"));
    }

    private void switchPanel(String name) {
        CardLayout cl = (CardLayout) mainPanel.getLayout();
        cl.show(mainPanel, name);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new temp().setVisible(true);
        });
    }
}
