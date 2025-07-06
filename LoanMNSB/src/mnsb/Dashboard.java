package mnsb;

import javax.swing.*;
import java.awt.*;

public class Dashboard {
    public static void main(String[] args) {
        // Create Main Frame
        JFrame frame = new JFrame("Bank Loan Management Dashboard");
        frame.setSize(1075, 682);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout());

        // Create Sidebar Panel
        JPanel sidebarPanel = new JPanel();
        sidebarPanel.setLayout(new BoxLayout(sidebarPanel, BoxLayout.Y_AXIS));
        sidebarPanel.setBackground(new Color(230, 230, 230));  // Light grey, bank feel

        // Add Buttons
        String[] modules = {
            "Gold Loan", "Personal Loan", "Gahan Loan",
            "AMR", "Vahan Loan", "DRD", "FD Loan", "Exit"
        };

        for (String module : modules) {
            JButton button = new JButton(module);
            button.setAlignmentX(Component.CENTER_ALIGNMENT);
            button.setMaximumSize(new Dimension(150, 40));  // Fixed button width, neat look
            sidebarPanel.add(button);
            sidebarPanel.add(Box.createVerticalStrut(10)); // Space between buttons

            // Dummy Action
            button.addActionListener(e -> JOptionPane.showMessageDialog(
                    frame, module + " Module Clicked!"));
        }

        // Create Main Work Panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        JLabel welcomeLabel = new JLabel("Welcome to Bank Loan Dashboard", JLabel.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 16));
        mainPanel.add(welcomeLabel, BorderLayout.CENTER);

        // Add Panels to Frame
        frame.getContentPane().add(sidebarPanel, BorderLayout.WEST);
        frame.getContentPane().add(mainPanel, BorderLayout.CENTER);

        // Show Frame
        frame.setVisible(true);
    }
}
