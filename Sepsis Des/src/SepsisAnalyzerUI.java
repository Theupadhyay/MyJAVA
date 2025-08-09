import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SepsisAnalyzerUI {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Sepsis Disease Analyzer");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(10, 10));

        // Set background image
        JLabel background = new JLabel(new ImageIcon("background.jpg"));
        frame.setContentPane(background);
        frame.setLayout(new BorderLayout());

        // Create a main panel with padding
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(6, 2, 10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        mainPanel.setOpaque(false);

        // Labels and Input Fields
        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setFont(new Font("Arial", Font.BOLD, 14));
        ageLabel.setForeground(Color.BLACK);
        JTextField ageField = new JTextField();
        ageField.setFont(new Font("Arial", Font.PLAIN, 14));

        JLabel tempLabel = new JLabel("Temperature (°C):");
        tempLabel.setFont(new Font("Arial", Font.BOLD, 14));
        tempLabel.setForeground(Color.BLACK);
        JTextField tempField = new JTextField();
        tempField.setFont(new Font("Arial", Font.PLAIN, 14));

        JLabel heartRateLabel = new JLabel("Heart Rate (BPM):");
        heartRateLabel.setFont(new Font("Arial", Font.BOLD, 14));
        heartRateLabel.setForeground(Color.BLACK);
        JTextField heartRateField = new JTextField();
        heartRateField.setFont(new Font("Arial", Font.PLAIN, 14));

        // Buttons
        JButton predictButton = new JButton("Predict Sepsis");
        predictButton.setFont(new Font("Arial", Font.BOLD, 14));
        predictButton.setBackground(new Color(0, 153, 204));
        predictButton.setForeground(Color.WHITE);

        JButton loadButton = new JButton("Load Data");
        loadButton.setFont(new Font("Arial", Font.BOLD, 14));
        loadButton.setBackground(new Color(76, 175, 80));
        loadButton.setForeground(Color.WHITE);

        JButton exitButton = new JButton("Exit");
        exitButton.setFont(new Font("Arial", Font.BOLD, 14));
        exitButton.setBackground(new Color(204, 0, 0));
        exitButton.setForeground(Color.WHITE);

        // Result Display
        JTextArea resultArea = new JTextArea(3, 20);
        resultArea.setEditable(false);
        resultArea.setFont(new Font("Arial", Font.PLAIN, 14));
        resultArea.setBorder(BorderFactory.createLineBorder(Color.GRAY));

        // Add action listener for exit button
        exitButton.addActionListener(e -> System.exit(0));

        // Add action listener for predict button
        predictButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int age = Integer.parseInt(ageField.getText());
                    double temp = Double.parseDouble(tempField.getText());
                    int heartRate = Integer.parseInt(heartRateField.getText());

                    // Simple sepsis prediction logic (for demonstration purposes)
                    boolean isSepsis = predictSepsis(age, temp, heartRate);

                    if (isSepsis) {
                        resultArea.setText("Sepsis Risk: High\nPlease consult a doctor immediately.");
                    } else {
                        resultArea.setText("Sepsis Risk: Low\nNo immediate concern, but monitor symptoms.");
                    }
                } catch (NumberFormatException ex) {
                    resultArea.setText("Invalid input. Please enter numeric values.");
                }
            }
        });

        // Add action listener for load button
        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Simulate loading data (for demonstration purposes)
                ageField.setText("35");
                tempField.setText("38.5");
                heartRateField.setText("110");
                resultArea.setText("Sample data loaded.");
            }
        });

        // Add components to main panel
        mainPanel.add(ageLabel);
        mainPanel.add(ageField);
        mainPanel.add(tempLabel);
        mainPanel.add(tempField);
        mainPanel.add(heartRateLabel);
        mainPanel.add(heartRateField);
        mainPanel.add(predictButton);
        mainPanel.add(loadButton);
        mainPanel.add(new JLabel("Result:"));
        mainPanel.add(resultArea);
        mainPanel.add(exitButton);

        // Add main panel to frame
        frame.add(mainPanel, BorderLayout.CENTER);

        // Make frame visible
        frame.setVisible(true); 
    }

    // Simple sepsis prediction logic (for demonstration purposes)
    private static boolean predictSepsis(int age, double temp, int heartRate) {
        // Example criteria: High temperature and elevated heart rate
        return temp > 38.0 && heartRate > 100;
    }
}
