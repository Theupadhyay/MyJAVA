import java.util.Arrays;

public class TowSumBS {
    public static int[] twoSum(int[] numbers, int target) {
        int si = 0;
        int ei = numbers.length-1;
        while (si<=ei){
            int sum = numbers[si]+numbers[ei];
            if(sum==target){
                return new int[]{si+1,ei+1};
            } else if (sum<target) {
                si++;
            }else ei--;
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] arr= {0,1,2,3,4,5,6,7,8};
        int target = 9;
        int[] ans = twoSum(arr,target);
        System.out.println(Arrays.toString(ans));
    }
}
