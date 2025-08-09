public class SortThePeople {
    public static String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (heights[j] < heights[j + 1]) {
                    swap(names, j, j + 1);
                    swap(heights, j, j + 1);
                }
            }
        }
        return names;
    }
    static void swap(String[] array, int i, int j) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] height = {180,165,170};
        System.out.println(sortPeople(names,height));
    }
}

