
import java.sql.*;
import java.util.Scanner;

class JDBC01
{
    static public void main(String [] Au)
    {
        Scanner sc = new Scanner(System.in);
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mysql", "root", "8651");

            PreparedStatement ps = con.prepareStatement("insert into student values (?, ?, ?)");
            ps.setString(1, sc.nextLine());
            ps.setDouble(2, sc.nextDouble());
            ps.setInt(3, sc.nextInt());

            ps.executeUpdate();

/*
            Statement stmt = con.createStatement();

            String query = "create table student(name varchar(20), cgpa double, roll int)";


            double x = sc.nextDouble();
            String selectquery = "select * from student where cgpa > " + x;
            ResultSet rs = stmt.executeQuery(selectquery);

            while(rs.next())
            {
                System.out.println( rs.getDouble(2) + "\t" +
                        rs.getInt(3) + "\t" + rs.getString(1) );
//rs.updateString(1, "XYZ");
            }

            while(rs.previous())
            {
                System.out.println( rs.getDouble(2) + "\t" +
                        rs.getInt(3) + "\t" + rs.getString(1) );
            }
*/

            String ins = "insert into student values ('Amit', 7.41, 35)";
//stmt.executeUpdate(ins);
            con.close();
        }
        catch(Exception ex) { System.out.println(ex); }
    }
}