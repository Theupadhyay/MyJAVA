public class Rotate {
    public static void rotateAr(int[] arr , int k){
        k = k%arr.length;
        for (int i = 0; i < arr.length; i++) {
            if(i<k){
                System.out.println(arr[arr.length+ i -k]+" ");
            }else {
                System.out.println(arr[i - k]+ " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {

    }
}
