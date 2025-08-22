public class RemoveDup2 {
    public static int removeDuplicate(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int j = 2;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] != arr[j - 2]) {
                arr[j] = arr[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 2, 2, 3};
        System.out.println(removeDuplicate(arr));
    }
}
