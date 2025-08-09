package Advance;


import java.sql.*;
public class EmployeeCRUD {


//4

        private static final String URL = "jdbc:mysql://localhost:3306/your_database";
        private static final String USER = "root";
        private static final String PASSWORD = "8651";

        public static void main(String[] args) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
                    createEmployee(conn, 1, "John Doe", 50000);
                    readEmployees(conn);

                    updateEmployee(conn, 1, "Jane Doe", 55000);

                    deleteEmployee(conn, 1);
                }
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }

        public static void createEmployee(Connection conn, int empid, String name, double sal) throws SQLException {
            String sql = "INSERT INTO Employee (empid, emp_name, sal) VALUES (?, ?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, empid);
                stmt.setString(2, name);
                stmt.setDouble(3, sal);
                stmt.executeUpdate();
                System.out.println("Employee created successfully.");
            }
        }

        public static void readEmployees(Connection conn) throws SQLException {
            String sql = "SELECT * FROM Employee";
            try (Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(sql)) {

                System.out.println("Employee List:");
                while (rs.next()) {
                    int empid = rs.getInt("empid");
                    String name = rs.getString("emp_name");
                    double sal = rs.getDouble("sal");
                    System.out.printf("ID: %d, Name: %s, Salary: %.2f%n", empid, name, sal);
                }
            }
        }

        public static void updateEmployee(Connection conn, int empid, String newName, double newSal) throws SQLException {
            String sql = "UPDATE Employee SET emp_name = ?, sal = ? WHERE empid = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, newName);
                stmt.setDouble(2, newSal);
                stmt.setInt(3, empid);
                int rowsUpdated = stmt.executeUpdate();
                if (rowsUpdated > 0) {
                    System.out.println("Employee updated successfully.");
                } else {
                    System.out.println("Employee not found.");
                }
            }
        }

        public static void deleteEmployee(Connection conn, int empid) throws SQLException {
            String sql = "DELETE FROM Employee WHERE empid = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, empid);
                int rowsDeleted = stmt.executeUpdate();
                if (rowsDeleted > 0) {
                    System.out.println("Employee deleted successfully.");
                } else {
                    System.out.println("Employee not found.");
                }
            }
        }

}
