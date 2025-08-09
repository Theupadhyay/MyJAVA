import java.util.Arrays;

public class MaxSubArr {
    static int FindMax(int[] arr ,int k){
        int maxSum = Integer.MIN_VALUE;
        int length = arr.length;

        for (int i = 0; i < length - k +1; i++) {
            int current_sum = 0;
            for (int j = 0; j < k; j++) {
                current_sum += arr[i+j];
            }
            maxSum = Math.max(current_sum,maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,4,2};
        int k = 2;
        System.out.println(FindMax(arr,k));
    }
}
