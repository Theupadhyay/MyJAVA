public class printDuplicate {
    public static void main(String[] args) {
        int arr[] = { 20, 50, 40, 20, 60, 50 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] == arr[j]) && (i != j)) {
                    System.out.println("duplicates are : " + arr[j]);
                }
            }
        }
    }

}
