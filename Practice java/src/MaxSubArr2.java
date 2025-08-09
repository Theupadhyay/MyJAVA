public class MaxSubArr2 {
    static int FindMax(int[] arr , int k ){
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        if (arr.length < k) {// edge case
            System.out.println("Invalid");
            return -1;
        }
        for (int i = 0; i < k; i++) {
            maxSum += arr[i];
        }
        int windowSum = maxSum;
        for (int i = 0; i < n; i++) {
            windowSum += arr[i] - arr[i-k];
            maxSum= Math.max(windowSum,maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {4,3,4,2};
        int k = 2;
        System.out.println(FindMax(arr,k));
    }
}
