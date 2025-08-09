package Ca3Project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CryptoConverter extends JFrame implements ActionListener {
    private JLabel cryptoLabel, inrLabel, resultLabel;
    private JTextField cryptoField, inrField;
    private JButton convertButton;

    public CryptoConverter() {
        setTitle("Crypto to INR Converter");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        cryptoLabel = new JLabel("Cryptocurrency:");
        cryptoField = new JTextField();

        inrLabel = new JLabel("Equivalent INR:");
        inrField = new JTextField();
        inrField.setEditable(false);

        resultLabel = new JLabel("");
        convertButton = new JButton("Convert");
        convertButton.addActionListener(this);

        add(cryptoLabel);
        add(cryptoField);
        add(inrLabel);
        add(inrField);
        add(resultLabel);
        add(convertButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == convertButton) {
            try {
                double cryptoAmount = Double.parseDouble(cryptoField.getText());
                double inrAmount = cryptoAmount /* your conversion rate from crypto to INR */;
                inrField.setText(String.format("%.2f", inrAmount));
                resultLabel.setText("");
            } catch (NumberFormatException ex) {
                resultLabel.setText("Enter a valid number.");
            }
        }
    }

    public static void main(String[] args) {
        new CryptoConverter();
    }
}
