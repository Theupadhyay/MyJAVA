public class findMin {
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<ans){
                ans=arr[i];
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={20,4,5,54,6,8,-4};
        System.out.println(min(arr));
    }
}
