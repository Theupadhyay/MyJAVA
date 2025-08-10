import java.sql.*;

public class InsertionInJDBC {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/abhishek";

        String username = "root";
        String password = "8651";
        String query = "INSERT INTO employee (id, name, dept, salary) VALUES (2, 'Geetu', 'Data Scientist', 10000);";
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
            int rowsAffected = stmt.executeUpdate(query);

            if (rowsAffected > 0) {
                System.out.println("insertSucessfull." + rowsAffected + "row's affected.");
            } else {
                System.out.println("InsertionFailed!!");
            }

            stmt.close();
            con.close();
            System.out.println("Connection Closed!!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
