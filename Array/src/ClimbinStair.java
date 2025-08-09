public class ClimbinStair {
        public static int climbStairs(int n) {
            int[] memo = new int[n+1];
            int ans = recursive(n,memo);
            return ans;
        }

        private static int recursive(int n , int[] memo){
            if(n<=1) return 1;
            if (memo[n] > 0) {
                return memo[n];
            }
            int op1 = recursive(n-1 , memo);
            int op2 = recursive(n-2 , memo);
            memo[n] = op1 + op2;
            return op1 + op2;
        }

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
}
