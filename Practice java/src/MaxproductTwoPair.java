import java.util.Arrays;

public class MaxproductTwoPair {
        public static int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return (nums[n-1]*nums[n-2]) -(nums[0] * nums[1]);
    }

    public static void main(String[] args) {
        int[] arr = {2,3,8,4,9,4};
        System.out.println(maxProductDifference(arr));
    }
}
