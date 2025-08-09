public class PerfectNo {
    public static boolean isPerfect(int num) {
        if (num <= 0) {
            return false;
        }
        int sum = 1;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if(num == sum) return true;
        return false;

    }
    public static void main(String[] args) {
        int num = 6;
        System.out.println(isPerfect(num));
    }
}
