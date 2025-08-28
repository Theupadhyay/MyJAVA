import java.util.*;

public class SummaryRange {
    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int a = nums[0];
        int b = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                b = nums[i];
            }else{
                result.add(range(a, b));
                a = nums[i];
                b = nums[i];
            }
        }
        result.add(range(a, b));
        return result;
    }

    private static String range(int a,int b){
        return (a == b) ? String.valueOf(a) : a + "->" + b;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 5, 7};
        System.out.println(summaryRanges(arr));
    }
}
