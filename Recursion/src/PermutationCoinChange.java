import java.util.Arrays;

public class PermutationCoinChange {
    public static int coinChangePermutation(int[] coins , boolean[] vis,int target, String ans){
        if (target== 0 ){
            System.out.println(ans);
            return 1;
        }
        int count =0;
        for (int i = 0; i < coins.length; i++) {
                if (target - coins[i]>= 0&& !vis[i]){
                    vis[i] = true;
                    count+=coinChangePermutation(coins,vis,target-coins[i],ans+coins[i]);
                    vis[i]= false;
                }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7};
        boolean[] vis = new boolean[arr.length]; // Initialize with all false values
        int target = 7; // Example target sum
        int totalCount = coinChangePermutation(arr, vis, target, "");
        System.out.println("Total count of permutations: " + totalCount);
    }
}
