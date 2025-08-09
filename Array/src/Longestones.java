public class Longestones {
    public static int longestOnes(int[] nums, int k) {
        int si =0;
        int ei =0;
        int len =0;
        int count =0;
        int n = nums.length;
        while (ei<n){
            if (nums[ei++]==0){
                count++;
            }
            while (count>k){
                if (nums[si++]==0){
                    count--;
                }
            }
            len = Math.max(len,ei-si);
        }
        return len;
    }

    public static void main(String[] args) {
        int[] arr= {0,1,0,0,1,0,1,1,1,1,0};
        System.out.println(longestOnes(arr,2));;
    }
}
