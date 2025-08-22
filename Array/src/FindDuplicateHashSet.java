import java.util.HashSet;
import java.util.Set;

public class FindDuplicateHashSet {
    public static int findDup(int[] arr){
        Set<Integer> seen = new HashSet<>();
        for (int i : arr) {
            if(seen.contains(i)) return i;
            seen.add(i);
        }
        return -1;
    }
    public static void main(String[] args) {

    }
}
