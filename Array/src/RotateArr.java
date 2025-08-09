public class RotateArr {
    public static void rotateArr(int[] nums,int k){
        k = k%nums.length;
        for(int i = 0; i < nums.length; i++)
        {
            if(i<k)
            {
                System.out.print(nums[nums.length + i - k] + " ");
            }else
            {
                System.out.print(nums[i - k] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int N = arr.length;
        int k = 3;
        rotateArr(arr,k);
    }
}





//    class Solution {
//        public void rotate(int[] nums, int k) {
//            k %= nums.length;
//            int n = nums.length;
//            reverseNum(nums,0,n-1);
//            reverseNum(nums,0,k-1);
//            reverseNum(nums,k,n-1);
//        }
//        public void reverseNum(int[] nums, int start, int end) {
//            while(start < end) {
//                int temp = nums[start];
//                nums[start] = nums[end];
//                nums[end] = temp;
//                start++;
//                end--;
//            }
//        }
//    }