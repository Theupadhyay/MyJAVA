import java.util.Scanner;

public class OddNoOfBaloon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        for (int i = 0; i < n; i++) {
            String currentColor = arr[i];
            int count = 0;
            for (int j = 0; j < n; j++) {
                if(arr[j].equals(currentColor)){
                    count++;
                }
            }
            if(count % 2 != 0){
                System.out.println(currentColor);
                return;
            }
        }
        System.out.println("All Colors Are Equal");
    }
}
