import java.util.Scanner;
import java.time.*;
import java.time.format.*;

public class DateTimeFormatte {
    public static void main(String[] args) {
        // date time formatter
        System.out.print("Enter the Dob in dd-mm-yyyy:");

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        DateTimeFormatter ft = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(input, ft);

        DateTimeFormatter ft2 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String output = date.format(ft2);
        System.out.println(output);

        LocalTime t = LocalTime.now();// We can pass time here also->of(13,50,30,5000)
        System.out.println(t.format(DateTimeFormatter.ofPattern("hh:mm a")));
    }
}
