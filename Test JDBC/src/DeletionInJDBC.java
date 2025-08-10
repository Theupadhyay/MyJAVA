import java.sql.*;

public class DeletionInJDBC {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/abhishek";

        String username = "root";
        String password = "8651";
        String query = "delete from employee where id = 3;";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
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
                System.out.println("Deletion Sucessfull." + rowsAffected + "row's affected.");
            } else {
                System.out.println("Deletion Failed!!");
            }

            stmt.close();
            con.close();
            System.out.println("Connection Closed!!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
