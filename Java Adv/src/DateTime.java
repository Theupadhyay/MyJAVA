import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.*;
import java.util.Scanner;

public class DateTime {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        today = today.plusMonths(1).withDayOfMonth(1);
//        today = today.withDayOfMonth(1);
        LocalDate firstSaturday = today.with(TemporalAdjusters.firstDayOfNextMonth());
        for (int i = 1; i <= 5 ; i++) {
            LocalDate saturday = today.with(TemporalAdjusters.dayOfWeekInMonth(i, DayOfWeek.SATURDAY));
//            if (saturday.isBefore(nextMonths));
            System.out.println(saturday);
        }
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the date and time ");
//        String dob = sc.next();
//        LocalDate today = LocalDate.now();
//        Period P = Period.between(today,);
    }
}
