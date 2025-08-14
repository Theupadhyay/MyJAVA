public class Largest3SameDigit {
    public static String Fine3SameDigit(String string) {
        String[] values = {"999", "888", "777", "666", "555", "444", "333", "222", "111", "000"};
        for (String i : values) {
            if (string.contains(i)) {
                return i;
            }
        }
        return "";
    }
    public static void main(String[] args) {
        String str = "983777738";
        System.out.println(Fine3SameDigit(str));
    }
}
