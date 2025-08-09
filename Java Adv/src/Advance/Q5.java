package Advance;

import java.util.Calendar;
public class Q5 {

//5
        public static void main(String[] args) {
            Calendar calendar = Calendar.getInstance();

            int currentYear = calendar.get(Calendar.YEAR);
            int currentMonth = calendar.get(Calendar.MONTH);
            int currentWeek = calendar.get(Calendar.WEEK_OF_YEAR);
            int currentDate = calendar.get(Calendar.DAY_OF_MONTH);

            calendar.set(Calendar.MONTH, Calendar.DECEMBER);
            calendar.set(Calendar.DAY_OF_MONTH, 31);

            int maxYear = calendar.getActualMaximum(Calendar.YEAR);

            calendar.set(Calendar.MONTH, currentMonth);
            int maxMonth = calendar.getActualMaximum(Calendar.MONTH);

            calendar.set(Calendar.WEEK_OF_YEAR, currentWeek);
            int maxWeek = calendar.getActualMaximum(Calendar.WEEK_OF_YEAR);

            calendar.set(Calendar.DAY_OF_MONTH, currentDate);
            int maxDate = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

            System.out.println("Current Year: " + currentYear);
            System.out.println("Max Year: " + maxYear);

            System.out.println("Current Month: " + (currentMonth + 1));
            System.out.println("Max Month: " + (maxMonth + 1));

            System.out.println("Current Week: " + currentWeek);
            System.out.println("Max Week: " + maxWeek);

            System.out.println("Current Date: " + currentDate);
            System.out.println("Max Date: " + maxDate);
        }
    }
