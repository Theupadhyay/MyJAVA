import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class User {
    String username;
    String password;

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

class LoginForm extends JFrame {
    JTextField usernameField;
    JPasswordField passwordField;

    public LoginForm() {
        setTitle("Login Form");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel usernameLabel = new JLabel("Username:");
        panel.add(usernameLabel);

        usernameField = new JTextField();
        panel.add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");
        panel.add(passwordLabel);

        passwordField = new JPasswordField();
        panel.add(passwordField);

        JButton loginButton = new JButton("Click here");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (checkCredentials(username, password)) {
                    JOptionPane.showMessageDialog(null, "Login successful!");
                    delayShowMessage();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password.");
                }
            }
        });
        panel.add(loginButton);

        add(panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private boolean checkCredentials(String username, String password) {
        // This is a dummy predicate function, replace it with your actual validation
        // logic
        return username.equals("admin") && password.equals("admin123");
    }

    private void delayShowMessage() {
        try {
            Thread.sleep(1500); // Delay for 1500ms (1.5 seconds)
            JOptionPane.showMessageDialog(null, "This is a delayed message.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}
