import java.util.Arrays;

public class PlusOne {
    // LeetCode 66
    public static int[] plusOnee(int[] digits) {
        for (int i = digits.length-1; i >= 0 ; i--) {
            if (digits[i]<9){
                digits[i]+=1;
                return digits;
            }else{
                digits[i] = 0;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        int[] arr = { 1,2,9};
        System.out.println(Arrays.toString(plusOnee(arr)));

    }
}
