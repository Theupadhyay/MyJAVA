public class MaxDiagonalArea {
    public static int MaxDiagonalArea(int[][] dimension) {
        int maxDiagonalSq = 0;
        int maxArea = 0;

        for (int[] i : dimension) {
            int l = i[0];
            int w = i[1];

            int DiagonalSq = l * l + w * w;
            int Area = l * w;

            if (maxDiagonalSq < DiagonalSq) {
                maxDiagonalSq = DiagonalSq;
                maxArea = Area;
            } else if (maxDiagonalSq == DiagonalSq) {
                Math.max(maxArea, Area);
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {

    }
}
