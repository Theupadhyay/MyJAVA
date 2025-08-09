public class SplitArr {
    public static int waysToSplitArray(int[] nums) {
        int count =0;
        long left =0 , right =0 , sum =0;
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
        }
        for(int i = 0 ; i < nums.length -1 ; i++){
            left += nums[i];
            right = sum - left;
            if(left >= right) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr ={10,4,-8,7};
        System.out.println(waysToSplitArray(arr));
    }
}
