import java.util.HashMap;

public class TwoSum {
    static public int[] twoSum(int[] nums ,int target){
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int temp = target - nums[i];
            if(hashmap.containsKey(temp)){
                return new int[]{i, hashmap.get(temp)};
            }
            hashmap.put(nums[i], i);
        }
        return new int[] {};
//        int i =0 ;
//        int j = nums.length - 1;
//        while (i < j) {
//            int sum = nums[i]+nums[j];
//            if (sum == target) {
//                return new int[]{i, j};
//            } else if (sum < target) {
//                i++;
//            }else j--;
//        }
//        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 6, 5, 7, 4};
        int target = 9;
        System.out.println(twoSum(nums , target));
    }
}
