import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    public static void findDup(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();

        for (int num: arr) {
            if (!seen.add(num)) {
                duplicate.add(num);
            }
        }
        System.out.println(duplicate);
    }
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        findDup(arr);
    }
}
