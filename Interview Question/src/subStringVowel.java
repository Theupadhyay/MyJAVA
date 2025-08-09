public class subStringVowel {
        public static Boolean splitString(String str) {
            // Length of the string
            int len = str.length();

            // Split the string into two halves
            String firstHalf = str.substring(0, len / 2);
            String secondHalf = str.substring(len / 2);

            // Count the vowels in both halves
            int firstHalfVowels = countVowels(firstHalf);
            int secondHalfVowels = countVowels(secondHalf);

            // Compare the counts
            return firstHalfVowels == secondHalfVowels;
        }

        private static int countVowels(String s) {
            int count = 0;
            for (char c : s.toCharArray()) {
                if (isVowel(c)) {
                    count++;
                }
            }
            return count;
        }

        private static boolean isVowel(char c) {
            c = Character.toLowerCase(c);
            return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
        }

        public static void main(String[] args) {
            System.out.println(splitString("codingninjas")); // Output: True
            System.out.println(splitString("hellothere"));  // Output: False
            System.out.println(splitString("aabbccddeeff")); // Output: True
            System.out.println(splitString("aeiouaeiou"));   // Output: True
        }


}
