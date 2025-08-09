import java.util.*;
import java.util.stream.*;
public class StreamDemo {
    public static void main(String... AU) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(3);
        al.add(5);
        al.add(6);
        al.add(5);
        al.add(7);
        al.add(5);
        // print all non duplicate int in any ascending or descending order
        Stream<Integer> str = al.stream();
        str = str.distinct().filter((x)->x%2 ==0).sorted((x,y)->x>y ? -1 : 1); // will give all non duplicate
        str.forEach(a -> System.out.println(a));
    }
}
