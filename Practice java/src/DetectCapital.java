public class DetectCapital {
    public static boolean detectCapital(String s) {
        int capitalCount = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                capitalCount++;
            }
        }

        if (capitalCount == 0) {

            return true;
        } else if (capitalCount == n) {
            return true;
        } else if (capitalCount == 1 && Character.isUpperCase(s.charAt(0))) {
            return true;
        }else return false;

    }

    public static void main(String[] args) {

    }
}

