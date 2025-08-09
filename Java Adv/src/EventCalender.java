import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Set;

public class EventCalender {
    public static void main(String[] args) {
        Set<String> st = ZoneId.getAvailableZoneIds();
        for (String s : st) {
            ZoneId z = ZoneId.of(s);
            LocalDate d = LocalDate.now(z);
            LocalTime t = LocalTime.now (z);
//            System.out.println(s+"\t"+d+"\t"+t);
            System.out.println(s+"\t"+LocalDate.now(z)+"\t"+LocalTime.now(z));
        }
    }
}
