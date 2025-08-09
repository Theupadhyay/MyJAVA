public class SortColors {
   static public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    
    
    static public void sortColors(int[] nums) {
        int i=0,j=0,k=nums.length-1;
        while(i <= k){
            if(nums[i] == 0){
                swap(nums,i,j);
                i++;
                j++;
            }else if(nums[i] == 1){
                i++;
            }else if(nums[i] == 2){
                swap(nums,i,k);
                k--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,1,0,1,2,0};
        sortColors(arr);
        for (int num : arr){
            System.out.print(num + "\t");
        }
    }
}
