//1330. Reverse Subarray To Maximize Array Value

public class RevSubArray {
    static void reverseArr(int nums[],int start,int end){
//        int temp;
//        start+=1;
//        end-=1;

        while(start<end){
           int  temp = nums[start];
            nums[start]= nums[end];
            nums[end]= temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        int n = nums.length;
        reverseArr(nums,0,n-1);
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,5,4};
        int N = arr.length;
        int k = 3;
        reverseArr(arr,0,N-1);
        System.out.println("The reversed array is: ");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
