import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class EmployeeSalary {
    private static List<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        // Create employee list
        employees.add(new Employee(1, "Gaurav", 20000));
        employees.add(new Employee(2, "Uttu", 30000));
        employees.add(new Employee(3, "Ashish", 25000));

        // Create and display the frame
        JFrame frame = new JFrame("Employee Salary");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 400);
        frame.setLayout(new FlowLayout());

        // Create text field, buttons, and label
        JTextField textField = new JTextField(10);
        JButton submitButton = new JButton("Submit");
        JButton showButton = new JButton("Show");
        JLabel salaryLabel = new JLabel();

        // Add components to the frame
        frame.add(textField);
        frame.add(submitButton);
        frame.add(showButton);
        frame.add(salaryLabel);

        // Add action listeners to buttons
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enteredId = textField.getText();
                int id;
                try {
                    id = Integer.parseInt(enteredId);
                } catch (NumberFormatException ex) {
                    salaryLabel.setText("Invalid ID format.");
                    return;
                }
                Employee employee = findEmployeeById(id);
                if (employee != null) {
                    salaryLabel.setText("Salary: " + employee.price);
                } else {
                    salaryLabel.setText("Employee not found.");
                }
            }
        });

        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // This button currently does not perform any specific action
                // You can add functionality here, such as displaying all employees or other relevant information
                System.out.println("Show button clicked.");
            }
        });

        frame.setVisible(true);
    }

    private static Employee findEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.id == id) {
                return employee;
            }
        }
        return null;
    }

    public static class Employee {
        int id;
        String name;
        double price;

        public Employee(int id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }
    }
}
