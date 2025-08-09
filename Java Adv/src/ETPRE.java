//import java.util.Arrays;
//import java.util.List;
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class ETPRE {
//    public static void main(String[] args) {
//        List<Integer> li = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//        // Calculate sum of even li
//        int sumEven = li.stream().filter(num -> num % 2 == 0).mapToInt(Integer::intValue).sum();
//
//        // Calculate sum of odd li
//        int sumOdd = li.stream().filter(num -> num % 2 != 0).mapToInt(Integer::intValue).sum();
//
//        // Find maximum value
//        int max = li.stream().mapToInt(Integer::intValue).max().orElseThrow();
//
//        // Find minimum value
//        int min = li.stream().mapToInt(Integer::intValue).min().orElseThrow();
//
//        System.out.println("Sum of even li: " + sumEven);
//        System.out.println("Sum of odd li: " + sumOdd);
//        System.out.println("Maximum value: " + max);
//        System.out.println("Minimum value: " + min);
//    }
//}
