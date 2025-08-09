public class SecondLargestSmallest {
    public static void secLarSma(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secSmallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
        for (int num : arr) {
            if(num > largest){
                secLargest = largest;
                largest = num;
            } else if (secLargest < num && num != largest) {
                secLargest = num;
            }
            if(num < smallest){
                secSmallest = smallest;
                smallest = num;
            } else if (secSmallest > num && num != smallest) {
                secSmallest = num;
            }
        }
        System.out.println(secLargest+ " "+ secSmallest);

    }
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        secLarSma(      arr);
    }
}
