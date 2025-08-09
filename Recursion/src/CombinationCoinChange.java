public class CombinationCoinChange {
    static int coinChangeCombi(int[] coins , int idx , int target, String ans){
        if (target == 0){
            System.out.println(ans);
            return 1;
        }
        int count = 0;
        for (int i = idx; i <coins.length ; i++) {
            if (target -coins[i]>=0){
                count+=coinChangeCombi(coins,i,target-coins[i],ans+coins[i]);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] coin = {2, 3, 5, 7};
        System.out.println(coinChangeCombi(coin,0,10,""));
    }
}
