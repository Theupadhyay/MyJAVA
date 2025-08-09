public class MinInRotatedSortArr {
    public int findMin(int[] nums) {
        int n = nums.length;
        int si = 0;
        int ei = n-1;
        if(nums[si]<= nums[ei]){
            return nums[si];
        }
        while(si<=ei){
            int mid=  si +(ei -si)/2;
            if(nums[mid]> nums[mid+1]){
                return nums[mid+1];
            }else if (nums[mid]< nums[mid-1]){
                return nums[mid];
            } else if (nums[si]<= nums[mid]) {
                si = mid+1;
            }else ei = mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {

    }
}
