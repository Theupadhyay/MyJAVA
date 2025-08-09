public class SingleNumber {
    static public int singleNumber(int[] nums) {

                //    for(int i=0;i<nums.length;i++){
                //        int count=0;
                //        for(int j=0;j<nums.length;j++){
                //            if(nums[j]==nums[i]){
                //                count++;
                //            }
                //        }

                //        if(count==1){
                //            return nums[i];
                //        }
                //    }
                //    return -1;


                int xor=0;

                for(int i=0;i<nums.length;i++){
                    xor=xor^nums[i];
                }

                return xor;
            }
//        int left = 0 ;
//        int right = nums.length - 1;
//
//        while (left < right) {
//            if (nums[left] == nums[right]) { // wrong approach
//                left++;
//            }else right--;
//        }
//
//        return nums[left];

    public static void main(String[] args) {

    }
}
