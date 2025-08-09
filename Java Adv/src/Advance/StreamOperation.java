package Advance;


import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
public class StreamOperation {

//1


        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(3, 5, 7, 2, 8, 10, 11, 13, 6);

            int sumEven = numbers.stream()
                    .filter(n -> n % 2 == 0)
                    .mapToInt(Integer::intValue)
                    .sum();

            int sumOdd = numbers.stream()
                    .filter(n -> n % 2 != 0)
                    .mapToInt(Integer::intValue)
                    .sum();

            IntSummaryStatistics stats = numbers.stream()
                    .mapToInt(Integer::intValue)
                    .summaryStatistics();

            int max = stats.getMax();
            int min = stats.getMin();


            OptionalInt maxOptional = numbers.stream()
                    .mapToInt(Integer::intValue)
                    .max();

            OptionalInt minOptional = numbers.stream()
                    .mapToInt(Integer::intValue)
                    .min();

            System.out.println("Sum of even numbers: " + sumEven);
            System.out.println("Sum of odd numbers: " + sumOdd);
            System.out.println("Maximum value: " + max);
            System.out.println("Minimum value: " + min);

            if (maxOptional.isPresent()) {
                System.out.println("Maximum value using Optional: " + maxOptional.getAsInt());
            }

            if (minOptional.isPresent()) {
                System.out.println("Minimum value using Optional: " + minOptional.getAsInt());
            }
        }

}
