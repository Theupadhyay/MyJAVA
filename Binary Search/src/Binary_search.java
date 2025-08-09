import java.util.Scanner;

public class Binary_search {

    static int binarySearch(int[] num, int target)
    {
        int start = 0;
        int end = num.length-1;

        while(start<=end) {
            int mid = start+(end-start)/2;
            if(target< num[mid])
            {
                end = mid-1;
            } else if (target>num[mid]) {
                start = mid+1;

            }else if(num[mid]==target) {
                if (mid-1>= 0 && num[mid-1]==target) {
                    end=mid-1;
                }
                else
                    return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,20,20,20,20,20,25,25,25,25,30,40};
        int target = 25;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }
}
