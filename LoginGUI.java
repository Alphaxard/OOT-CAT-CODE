package hms;

import javax.swing.*;
import javax.swing.SpringLayout;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JLabel statusLabel;

    public LoginGUI() {
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Login Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        SpringLayout layout = new SpringLayout();
        panel.setLayout(layout);

        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");

        usernameField = new JTextField(15);
        passwordField = new JPasswordField(15);

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onLoginButtonClicked();
            }
        });

        statusLabel = new JLabel("");

        // Set constraints using SpringLayout
        layout.putConstraint(SpringLayout.WEST, usernameLabel, 10, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, usernameLabel, 10, SpringLayout.NORTH, panel);

        layout.putConstraint(SpringLayout.WEST, usernameField, 10, SpringLayout.EAST, usernameLabel);
        layout.putConstraint(SpringLayout.NORTH, usernameField, 10, SpringLayout.NORTH, panel);

        layout.putConstraint(SpringLayout.WEST, passwordLabel, 10, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, passwordLabel, 10, SpringLayout.SOUTH, usernameLabel);

        layout.putConstraint(SpringLayout.WEST, passwordField, 10, SpringLayout.EAST, passwordLabel);
        layout.putConstraint(SpringLayout.NORTH, passwordField, 10, SpringLayout.SOUTH, usernameField);

        layout.putConstraint(SpringLayout.WEST, loginButton, 10, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, loginButton, 10, SpringLayout.SOUTH, passwordLabel);

        layout.putConstraint(SpringLayout.WEST, statusLabel, 10, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, statusLabel, 10, SpringLayout.SOUTH, loginButton);

        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(statusLabel);

        add(panel);

        setVisible(true);
    }

    private void onLoginButtonClicked() {
        String username = usernameField.getText();
        char[] password = passwordField.getPassword();

        // Perform authentication here (for simplicity, check if username is "admin" and password is "password")
        if ("admin".equals(username) && "password".equals(new String(password))) {
            statusLabel.setText("Login Successful");
        } else {
            statusLabel.setText("Login Failed. Please try again.");
        }

        // Clear the password field for security
        passwordField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginGUI();
            }
        });
    }
}
