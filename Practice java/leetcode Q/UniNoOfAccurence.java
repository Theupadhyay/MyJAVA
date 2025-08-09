

public class UniNoOfAccurence {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>();
        for (int i : map.values()) {
            if (!set.contains(i)) {
                set.add(i);
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        UniNoOfAccurence instance = new UniNoOfAccurence();
        int[] nums = { 1, 2, 3, 2, 3, 4, 4 };
        boolean result = instance.uniqueOccurrences(nums);
        System.out.println(result);
    }
}
