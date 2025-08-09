import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class UpdatePassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mysql", "root", "8651");
            int userId = sc.nextInt();
        }
        catch(Exception ex) {
            System.out.println(ex);
        }
    }
}
