public class Segeregate0s1s {
   static void segregate0and1(int[] arr, int n) {
        int left = 0, right = n-1;
        while (left < right)
        {
            /* Increment left index while we see 0 at left */
            while (arr[left] == 0 && left < right)
                left++;
            /* Decrement right index while we see 1 at right */
            while (arr[right] == 1 && left < right)
                right--;
            /* If left is smaller than right then there is a 1 at left and a 0 at right.  Exchange it */
            if (left < right)
            {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
        
    }
    public static void main(String[] args) {
        int array[] = { 0, 1, 0, 1, 1, 0 };
        segregate0and1(array, 6);
        for(int i = 0 ; i < 6; i++)
        {
            System.out.print(array[i]+"\t");
        }

    }
}
