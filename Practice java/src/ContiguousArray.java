import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
        static public int findMaxLength(int[] nums) {
            // Create a hashmap to store the running sum and its corresponding index
            Map<Integer, Integer> map = new HashMap<>();
            map.put(0, -1); // Initialize with a sum of 0 at index -1
            int maxLength = 0;
            int count = 0; // Initialize the count of 0s and 1s
            // Iterate through the array
            for (int i = 0; i < nums.length; i++) {
                // Increment count for 1, decrement for 0
                if (nums[i] == 1)
                    count++;
                else
                    count--;
                // If the current count has been seen before, update the maxLength
                if (map.containsKey(count))
                    maxLength = Math.max(maxLength, i - map.get(count));
                else
                    map.put(count, i); // Otherwise, add the count and its index to the map
            }
            return maxLength;
        }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1};
        System.out.println(findMaxLength(arr));
    }
}
