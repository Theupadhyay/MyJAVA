import java.lang.ref.SoftReference;

public class searchInStr {
    // Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

        static boolean linearSearch(String str, int target) {
            if (str.length() == 0) {
                return false;
            }

            for (int index = 0; index < str.length(); index++) {
                if (target == str.charAt(index)){
                    return  true;
            }
        }
            return false;

        }

        public static void main(String[] args) {
            String name = "abhishek";
            char target = 'l';
            System.out.println(linearSearch(name,target));
        }
    }

