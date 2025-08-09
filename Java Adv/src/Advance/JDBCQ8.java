package Advance;

import java.sql.*;

//import static Advance.EmployeeCRUD.URL;

public class JDBCQ8 {

//8


//        private static final String URL = "jdbc:mysql://localhost:3306/jdbc_db","root","Password";
        private static final String USER = "root";
        private static final String PASSWORD = "8651";


    public static void main(String[] args) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mysql", USER, PASSWORD)) {

                    createEmployee(conn, 1, "John Doe", 50000);
                    readEmployees(conn);
                    updateEmployee(conn, 1, "Jane Doe", 55000);
                    deleteEmployee(conn, 1);

                }
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }

        public static void createEmployee(Connection conn, int empid, String empName, double sal) throws SQLException {
            String sql = "INSERT INTO Employee (empid, emp_name, sal) VALUES (?, ?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setInt(1, empid);
                pstmt.setString(2, empName);
                pstmt.setDouble(3, sal);
                int rowsInserted = pstmt.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("A new employee was inserted successfully!");
                }
            }
        }

        public static void readEmployees(Connection conn) throws SQLException {
            String sql = "SELECT * FROM Employee";
            try (Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(sql)) {

                while (rs.next()) {
                    int empid = rs.getInt("empid");
                    String empName = rs.getString("emp_name");
                    double sal = rs.getDouble("sal");
                    System.out.printf("ID: %d, Name: %s, Salary: %.2f%n", empid, empName, sal);
                }
            }
        }

        public static void updateEmployee(Connection conn, int empid, String newName, double newSal) throws SQLException {
            String sql = "UPDATE Employee SET emp_name = ?, sal = ? WHERE empid = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, newName);
                pstmt.setDouble(2, newSal);
                pstmt.setInt(3, empid);
                int rowsUpdated = pstmt.executeUpdate();
                if (rowsUpdated > 0) {
                    System.out.println("Employee was updated successfully!");
                }
            }
        }

        public static void deleteEmployee(Connection conn, int empid) throws SQLException {
            String sql = "DELETE FROM Employee WHERE empid = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setInt(1, empid);
                int rowsDeleted = pstmt.executeUpdate();
                if (rowsDeleted > 0) {
                    System.out.println("Employee was deleted successfully!");
                }
            }
        }

}
