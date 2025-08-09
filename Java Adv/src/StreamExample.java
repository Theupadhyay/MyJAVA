//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class StreamExample {
//    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//        // Calculate sum of even numbers
//        int sumEven = numbers.stream()
//                .filter(num -> num % 2 == 0)
//                .mapToInt(Integer::intValue)
//                .sum();
//
//        // Calculate sum of odd numbers
//        int sumOdd = numbers.stream()
//                .filter(num -> num % 2 != 0)
//                .mapToInt(Integer::intValue)
//                .sum();
//
//        // Find maximum value
//        int max = numbers.stream()
//                .mapToInt(Integer::intValue)
//                .max()
//                .orElseThrow();
//
//        // Find minimum value
//        int min = numbers.stream()
//                .mapToInt(Integer::intValue)
//                .min()
//                .orElseThrow();
//
//        System.out.println("Sum of even numbers: " + sumEven);
//        System.out.println("Sum of odd numbers: " + sumOdd);
//        System.out.println("Maximum value: " + max);
//        System.out.println("Minimum value: " + min);
//    }
//}
