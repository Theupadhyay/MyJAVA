public class StackArr {
    int[] arr = new int[10];
    int f =0 ;
    int r = 0;

    void enqueu(int data) {
        arr[r] = data;
    }

    void dequeu() {
        f++;
    }
}
