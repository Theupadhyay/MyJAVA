//Input: s = "cabaabac"
//        Output: 0
//        Explanation: An optimal sequence of operations is:
//        - Take prefix = "c" and suffix = "c" and remove them, s = "abaaba".
//        - Take prefix = "a" and suffix = "a" and remove them, s = "baab".
//        - Take prefix = "b" and suffix = "b" and remove them, s = "aa".
//        - Take prefix = "a" and suffix = "a" and remove them, s = "".
// Leetcode - 1750

public class MinRemainingLength {
    static public int minimumLength(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right && s.charAt(left) == s.charAt(right)) {
            char current = s.charAt(left);
            while (left <= right && s.charAt(left) == current) {
                left++;
            }
            while (right >= left && s.charAt(right) == current) {
                right--;
            }
        }

        return right - left + 1;
    }

    public static void main(String[] args) {

    }
}
