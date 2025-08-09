import java.util.*;

public class FreqOfNO {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 1, 2, 5, 1, 3, 2, 9};

        // Create a HashMap to store frequencies
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Loop through array using normal for loop
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (freqMap.containsKey(num)) {
                freqMap.put(num, freqMap.get(num) + 1);
            } else {
                freqMap.put(num, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println("Number " + entry.getKey() + ": " + entry.getValue() + " times");
        }
    }
}
