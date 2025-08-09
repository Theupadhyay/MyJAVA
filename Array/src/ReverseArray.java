import java.util.Enumeration;
import java.util.Scanner;

public class

ReverseArray {
    static void reverseArr(int arr[],int start ,int end){
        int temp;

        while(start<end){
            temp = arr[start];
            arr[start]= arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
    }
           public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);

               System.out.println("Enter the size of the array: ");
               int n = scanner.nextInt();

               int[] arr = new int[n];

               System.out.println("Enter the elements of the array: ");
               for (int i = 0; i < n; i++) {
                   arr[i] = scanner.nextInt();
               }

               System.out.println("The original array is: ");
               for (int i = 0; i < n; i++) {
                   System.out.println(arr[i] + " ");
               }

               reverseArr(arr, 0 , n -1);

               System.out.println("The reversed array is: ");
               for (int i = 0; i < n; i++) {
                   System.out.print(arr[i] + " ");
        }
    }
}
