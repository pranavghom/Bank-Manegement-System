package mnsb;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import org.eclipse.wb.swing.FocusTraversalOnArray;

public class adminonlinecode extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private final JPanel Slidebar = new JPanel();

    // Form Fields
    private JTextField txtaapliname, txtaadhar, txtaddress, txtpan, txtocupation, txtmobailno;
    private JTextField txtnamecoappli, txtcoaadhar, txtcoadress, txtcopan, txtcoocupation, txtcomobailno;

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
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Header Panel
        JPanel headerpanel = new JPanel();
        headerpanel.setBackground(Color.PINK);
        headerpanel.setBounds(0, 10, 1300, 156);
        headerpanel.setLayout(null);
        contentPane.add(headerpanel);

        JLabel lblTitle = new JLabel("\u092E\u0939\u093F\u0932\u093E \u0928\u093E\u0917\u0930\u0940 \u0938\u0939\u0915\u093E\u0930\u0940 \u092A\u0924\u0938\u0902\u0938\u094D\u0925\u093E");
        lblTitle.setFont(new Font("Mangal", Font.BOLD, 24));
        lblTitle.setBounds(400, 40, 600, 40);
        headerpanel.add(lblTitle);

        // Sidebar
        Slidebar.setBackground(Color.PINK);
        Slidebar.setBounds(0, 166, 145, 601);
        Slidebar.setLayout(null);
        contentPane.add(Slidebar);

        JButton createuser = new JButton("Create User");
        createuser.setBounds(10, 59, 117, 29);
        Slidebar.add(createuser);

        JComboBox<String> reportcombo = new JComboBox<>(new String[]{"Report", "Generate Report", "1", "2", "3"});
        reportcombo.setBounds(10, 129, 117, 29);
        Slidebar.add(reportcombo);

        JButton Loans = new JButton("Loans");
        Loans.setBounds(10, 191, 117, 29);
        Slidebar.add(Loans);

        // Main Panel with CardLayout
        JPanel mainpanel = new JPanel();
        mainpanel.setBounds(148, 173, 1126, 594);
        mainpanel.setLayout(new CardLayout());
        contentPane.add(mainpanel);

        // Create User Panel
        JPanel pnlcreateuser = new JPanel(null);
        mainpanel.add(pnlcreateuser, "createuser");

        // Fonts
        Font labelFont = new Font("Segoe UI", Font.BOLD, 14);
        Font inputFont = new Font("Segoe UI", Font.PLAIN, 14);

        // Left Section
        String[] leftLabels = {"Name Applicant", "Aadhar Number", "Address", "Pan Number", "Occupation", "Mobile Number"};
        JTextField[] leftFields = new JTextField[6];
        int y = 50;
        for (int i = 0; i < leftLabels.length; i++) {
            JLabel lbl = new JLabel(leftLabels[i]);
            lbl.setFont(labelFont);
            lbl.setBounds(50, y, 150, 25);
            pnlcreateuser.add(lbl);

            JTextField tf = new JTextField();
            tf.setFont(inputFont);
            tf.setBounds(200, y, 200, 25);
            pnlcreateuser.add(tf);
            leftFields[i] = tf;

            y += 40;
        }

        // Assigning leftFields to actual variables
        txtaapliname = leftFields[0];
        txtaadhar = leftFields[1];
        txtaddress = leftFields[2];
        txtpan = leftFields[3];
        txtocupation = leftFields[4];
        txtmobailno = leftFields[5];

        // Right Section
        String[] rightLabels = {"Name Co-Applicant", "Aadhar Number", "Address", "Pan Number", "Occupation", "Mobile Number"};
        JTextField[] rightFields = new JTextField[6];
        y = 50;
        for (int i = 0; i < rightLabels.length; i++) {
            JLabel lbl = new JLabel(rightLabels[i]);
            lbl.setFont(labelFont);
            lbl.setBounds(450, y, 150, 25);
            pnlcreateuser.add(lbl);

            JTextField tf = new JTextField();
            tf.setFont(inputFont);
            tf.setBounds(600, y, 200, 25);
            pnlcreateuser.add(tf);
            rightFields[i] = tf;

            y += 40;
        }

        // Assigning rightFields to actual variables
        txtnamecoappli = rightFields[0];
        txtcoaadhar = rightFields[1];
        txtcoadress = rightFields[2];
        txtcopan = rightFields[3];
        txtcoocupation = rightFields[4];
        txtcomobailno = rightFields[5];

        // Buttons
        JButton Save = new JButton("SAVE");
        Save.setBounds(100, 320, 100, 30);
        pnlcreateuser.add(Save);

        JButton btnupdate = new JButton("UPDATE");
        btnupdate.setBounds(230, 320, 100, 30);
        pnlcreateuser.add(btnupdate);

        JButton btndelete = new JButton("DELETE");
        btndelete.setBounds(360, 320, 100, 30);
        pnlcreateuser.add(btndelete);

        // Other Panels
        JPanel pnlreport = new JPanel();
        pnlreport.setBackground(SystemColor.inactiveCaption);
        mainpanel.add(pnlreport, "report");
        pnlreport.add(new JLabel("REPORT"));

        JPanel pnlloans = new JPanel();
        mainpanel.add(pnlloans, "loan");
        pnlloans.add(new JLabel("Loan Section"));

        // Button Actions
        createuser.addActionListener(e -> ((CardLayout) mainpanel.getLayout()).show(mainpanel, "createuser"));
        Loans.addActionListener(e -> ((CardLayout) mainpanel.getLayout()).show(mainpanel, "loan"));
    }
}
