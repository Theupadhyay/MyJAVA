public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int runningSum =0;
        int maxSum = Integer.MIN_VALUE;
        for(int element : nums){
            runningSum+=element;
            maxSum =Math.max(maxSum,runningSum);
            if (runningSum<0){
                runningSum=0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {

    }
}
