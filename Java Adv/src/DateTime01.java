//WAP which prompts the user to enter a date using command line argunment and the number if
//year, months , days.
//Now fint out the day after that many day year and months from the entered date

import org.w3c.dom.ls.LSOutput;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.*;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {
        String date = args[0];
        LocalDate dt= LocalDate.parse(date);
        int y = Integer.parseInt(args[1]);
        int m = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);

        LocalDate newDate = dt.plusYears(y).plusMonths(m).plusDays(d);
        System.out.println(newDate.getDayOfWeek());

        LocalDate ny = newDate.with(TemporalAdjusters.firstDayOfNextYear()).with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        System.out.println(ny);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the day in YYYY-MM-DD");

    }

}
//James lee is working in an it company which is  providing the holidays on akk sundays and
//2nd and 4th Saturday .
//Bruce lee wanted to know the holidays on the months in which his birthday falls so that help bruce
// lee to find out the dates and day of holidays of that Months
//Read the DOB From command line prompts
// input Format: 2002-10-05
//Output Format: 2002-10-03  sunday
//2002-10-09 saturday
//2002-10-10sunday
//2002-10-17sunday
//2002-10-23saturday


/*

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateManipulator {

    public static void main(String[] args) {
        // Check if the correct number of arguments are passed
        if (args.length != 4) {
            System.out.println("Usage: java DateManipulator <date> <years> <months> <days>");
            System.out.println("Date format should be YYYY-MM-DD.");
            return;
        }

        try {
            // Parse the date from the first command line argument
            LocalDate date = LocalDate.parse(args[0], DateTimeFormatter.ISO_LOCAL_DATE);

            // Parse the number of years, months, and days from the command line arguments
            int years = Integer.parseInt(args[1]);
            int months = Integer.parseInt(args[2]);
            int days = Integer.parseInt(args[3]);

            // Add the years, months, and days to the date
            LocalDate newDate = date.plusYears(years).plusMonths(months).plusDays(days);

            // Output the original and new date
            System.out.println("Original date: " + date);
            System.out.println("New date: " + newDate);
        } catch (Exception e) {
            // Catch any exceptions and print an error message
            System.out.println("Error processing input. Make sure the date and numbers are in the correct format.");
            System.out.println("Date format should be YYYY-MM-DD.");
        }
    }
}

 */