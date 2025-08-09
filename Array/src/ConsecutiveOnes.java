public class ConsecutiveOnes {
    public  static int findMaxConsecutiveOnes(int[] nums) {
        int si =0;
        int ei =0;
        int len =0;
        int count =0;
        int n = nums.length;
        while (ei<n){
            if (nums[ei]==0){
                count++;
            }
            while (count>0){
                if(nums[si++]==0) {
                count--;
            }
            }
            len= Math.max(len,ei-si+1);
            ei++;
        }
        return len;

//        int count = 0;
//        int maxCount = Integer.MIN_VALUE;
//        for (int i = 0; i <nums.length ; i++) {
//            if (nums[i]==1){
//                count++;
//                maxCount=count;
//            }else{
//                count =0;
//            }
//        }
//        return maxCount;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        int result = findMaxConsecutiveOnes(arr);
        System.out.println(result);
    }
}
