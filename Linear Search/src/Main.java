// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] num = {20, 45, 7, 8, 9, 5, 45, 48, 84};
        int target = 8;
        int ans = linearSearch(num, target);
        System.out.println(ans);
    }
}