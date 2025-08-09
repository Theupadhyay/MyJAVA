public class LongestSubString {
    public int lengthOfLongestSubstring(String s) {
        int si = 0;
        int ei = 0;
        int count = 0;
        int len = 0;
        int n = s.length();
        int[] freq = new int[128];

        while (ei < n) {
            if (freq[s.charAt(ei++)]++ > 0) {
                count++;
            }
            if (freq[s.charAt(si++)]-- > 0) {
                count--;
            }
        }

        len = Math.max(len, ei - si);
        return len;
    }

    public static void main(String[] args) {
        // You can add test cases or input strings to check the function
        // For example:
        // LongestSubString solution = new LongestSubString();
        // System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));
    }
}
