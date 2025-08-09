import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.*;
import java.util.Scanner;

public class JDBC {
    public static void main(String[] args) {
        try {

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Abhi","root","8651");

            Scanner sc = new Scanner(System.in);  // Dynamic way to take the input
            PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?)");
            ps.setString(1,sc.nextLine());
            ps.setDouble(2,sc.nextDouble());
            ps.setInt(3,sc.nextInt());

            ps.executeQuery();



//
//            Statement stmt = con.createStatement();
//            String query = "creat table student(name varchar(20), cgpa double , Roll int)";
//
//            boolean x = sc.nextBoolean();
//            String selectQuery = "select * from student where cgpa >"+x;
//            ResultSet rs = stmt.executeQuery(selectQuery);
//
//            while (rs.next()) {
//                System.out.println(rs.getString("name")+"\t"+rs.getDouble("cgpa")+"\t"+rs.getInt("Roll"));
//            }
//
//            while (rs.previous()) {
//                System.out.println(rs.getDouble(2)+"\t"+rs.getInt("Roll")+"\t"+rs.getString("name"));
//            }

            String ins = "insert into student values(\"Abhi\",8.1,25)";
//            stmt.executeUpdate(query);
            con.close();
        }

    catch(Exception ex) {
        System.out.println(ex);

        }
    }
}
