import java.util.Scanner;

public class KandaneAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        long result = maxSubArraySum(arr , n);
        System.out.println(result);
    }

    private static long maxSubArraySum(int[] arr, int n) {
        long max_so_far = Long.MIN_VALUE;
        long max_ending_here = 0;
        for (int i = 0; i < n ; i++) {
            max_ending_here += arr[i];

            if (max_so_far < max_ending_here){
                max_so_far = max_ending_here;
            }

            if(max_ending_here < 0){
                max_ending_here =0;
            }
        }
        // If the maximum subarray sum is less than 0, return 0
//        if (max_so_far < 0) {
//            return 0;
//        }
        return max_so_far;
    }
}
