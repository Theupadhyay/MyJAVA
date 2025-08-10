import java.sql.*;

public class FirstConnection {

    public static void main(String[] args) throws ClassNotFoundException {

        String url = "jdbc:mysql://localhost:3306/Students";
        
        String username = "root";
        String password = "8651";
        String query = "Select * from Student;";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Drivers Loaded sussesfully");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Done ");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query); // executeQuery is when we want to retrive from database
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String sub = rs.getString("sub");
                double fees = rs.getDouble("fees");
                System.out.println();
                System.out.println("=====================================");
                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Sub: " + sub);
                System.out.println("Fees: " + fees);
            }
            rs.close();
            stmt.close();
            con.close();
            System.out.println("Connection Closed!!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
