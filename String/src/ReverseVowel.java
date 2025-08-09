public class ReverseVowel {
    public static String reverseVowel(String s){
        int i = 0;
        int j = s.length() -1;
        char[] arr = s.toCharArray();
        while (i < j) {
            if (!isVowel(arr[i])) {
                i++;
                continue;
            }
            if (!isVowel(arr[j])) {
                j--;
                continue;
            }
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }
        return new String(arr);
    }

    public static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static void main(String[] args) {
        String str = "ABhdgekk";
        reverseVowel(str);
    }
}
