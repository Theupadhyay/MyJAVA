    import java.util.Arrays;
    import java.util.HashMap;

    public class PracticeNow {
        public static int[] reverse(int[] arr) {
            int[] revArr = new int[arr.length];
            int counter =0;
            int i=arr.length-1;
            while(i>=0){
                revArr[counter] = arr[i];
                i--;
                counter++;
            }
            return revArr;
        }
        public static void FirstAndSecLargest(int[] arr){
            int firstLargest = Integer.MIN_VALUE;
            int secomdLargest = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] > firstLargest){
                    secomdLargest = firstLargest;
                    firstLargest = arr[i];
                }else if (arr[i] > secomdLargest && arr[i] != firstLargest) {
                    secomdLargest = arr[i];
                }
            }
            System.out.println("FirstLargst : " + firstLargest + " SecondLargest : "+secomdLargest);
        }

        public static void countVowel(String string) {
            int count =0;
            for (int i = 0; i < string.length(); i++) {
                if(string.charAt(i) == 'a' ||string.charAt(i) == 'e' ||string.charAt(i) == 'i' ||string.charAt(i) == 'o' ||string.charAt(i) == 'u' || string.charAt(i) == 'A' ||string.charAt(i) == 'E' ||string.charAt(i) == 'I' ||string.charAt(i) == 'O' ||string.charAt(i) == 'U'){
                    count++;
                }
            }
            System.out.println(count);
        }

        public static void checkPalindrome(String str) {
            int start =0;
            int end  = str.length()-1;

            while(start < end ){
                if(str.charAt(start) != str.charAt(end)) {

                    System.out.println("Not palindrome");
                    return;
                }else {
                    start++;
                    end--;
                }
            }
            System.out.println("yes it is");;
        }

        public static void reverseStringWithoutExStr(char[] str){
            int start = 0;
            int end  = str.length-1;
            while (start < end) {
                char temp = str[start];
                str[start] = str[end];
                str[end] = temp;
                start++;
                end--;
            }
        }
        
        //Sum of array elements and  Find missing number in array 1..n both covered
        public static int findMissingNo(int[] arr){
            int n = arr.length+1;
                int sum = (n*(n+1))/2;
                int currSum = 0;
            for (int i = 0; i < arr.length; i++) {
                currSum+= arr[i];
            }
            return sum-currSum;
        }

        public static boolean isAnagram(char[] str1 , char[] str2){
            if(str1.length != str2.length) return false ;
            Arrays.sort(str1);
            Arrays.sort(str2);
            for (int i = 0; i < str1.length; i++) {
                if (str1[i] != str2[i]) {
                    return false;
                }
            }
            return true;
        }

        public static void secLargeSecSmall(int[] arr) {
            Arrays.sort(arr);
            System.out.println("SecLarge: "+arr[1]+" SecSmall : "+ arr[arr.length-2]);
        }

        public static void freqCount(String str){
            HashMap<Character, Integer> map = new HashMap<>();
            for (Character c : str.toCharArray()) {
                map.put(c,map.getOrDefault(c,0)+1);
            }
            for (Character c : map.keySet()) {
                System.out.println(c+"->"+ map.get(c));
            }

        }


        public static void reverseWords(String string) {
            String[] words = string.split(" ");
            for (int i = words.length-1; i >= 0; i--) {
                System.out.println(words[i]+ " ");
            }
        }

        public static void moveAllZero(int[] arr){
            int j=0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] != 0){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    j++;
                }
            }
        }

        public static boolean checkSorted(int[] arr) {
            // Handle null or empty arrays as "sorted" by definition
            if (arr == null || arr.length < 2) {
                return true;
            }

            // Compare each element with its next neighbor
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    return false; // Found a descending pair
                }
            }
            return true;
        }

        public static void firstRepeatingChar(String str){
            HashMap<Character, Integer> map = new HashMap<>();
            for (Character c:str.toCharArray()) {
                map.put(c , map.getOrDefault(c , 0)+1);
            }
            for (Character c : str.toCharArray() ) {
                if (map.get(c) == 1) {
                    System.out.println("this is first non repeating char " + c);
                    return;
                }
            }
        }

        public static int removeDuplicate(int[] arr) {
            if (arr.length == 0) return 0;
            int j =0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] != arr[j]){
                    j++;
                    arr[j] = arr[i];
                }
            }
            return j+1;
        }

        public static void rotateByK(int[] arr, int k) {
            k %= arr.length;
            reverse(arr,0,arr.length-1);
            reverse(arr,0,k-1);
            reverse(arr,k,arr.length-1);
        }

        public static void reverse(int[] arr, int start, int end) {
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        public static void main(String[] args) {
            int[] arr = {1, 2,2, 3, 4};
            String str = "maaadam";
            System.out.println(Arrays.toString(reverse(arr)));
            FirstAndSecLargest(arr);
            countVowel(str);
            checkPalindrome(str);
            System.out.println(isAnagram("silent".toCharArray(), "listen".toCharArray()));
            firstRepeatingChar(str);
        }
    }
