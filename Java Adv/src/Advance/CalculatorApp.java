package Advance;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CalculatorApp extends JFrame {



    private JTextField display;

    private double num1 = 0;
    private double num2 = 0;
    private String operator = "";
    private boolean startNewNumber = true;

    public CalculatorApp() {
        // Set up the frame
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create the display field
        display = new JTextField();
        display.setEditable(false);
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setFont(new Font("Arial", Font.PLAIN, 24));

        // Create the panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 10, 10));

        // Add buttons to the panel
        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.PLAIN, 24));
            buttonPanel.add(button);
            button.addActionListener(new ButtonClickListener());
        }

        // Set up the layout
        setLayout(new BorderLayout());
        add(display, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
                if (startNewNumber) {
                    display.setText(command);
                    startNewNumber = false;
                } else {
                    display.setText(display.getText() + command);
                }
            } else if (command.equals("C")) {
                display.setText("");
                num1 = 0;
                num2 = 0;
                operator = "";
                startNewNumber = true;
            } else if (command.equals("=")) {
                num2 = Double.parseDouble(display.getText());
                double result = calculate(num1, num2, operator);
                display.setText(String.valueOf(result));
                startNewNumber = true;
            } else {
                if (!operator.isEmpty()) {
                    num2 = Double.parseDouble(display.getText());
                    num1 = calculate(num1, num2, operator);
                } else {
                    num1 = Double.parseDouble(display.getText());
                }
                operator = command;
                startNewNumber = true;
            }
        }

        private double calculate(double num1, double num2, String operator) {
            switch (operator) {
                case "+":
                    return num1 + num2;
                case "-":
                    return num1 - num2;
                case "*":
                    return num1 * num2;
                case "/":
                    if (num2 != 0) {
                        return num1 / num2;
                    } else {
                        JOptionPane.showMessageDialog(null, "Cannot divide by zero");
                        return 0;
                    }
                default:
                    return 0;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalculatorApp().setVisible(true);
            }
        });
    }


}