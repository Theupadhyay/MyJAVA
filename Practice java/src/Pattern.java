public class Pattern {
    static void pattern1(int n) {
        System.out.println("pattern 1");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        System.out.println("pattern 2");

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n + 1 - row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        System.out.println("pattern 3");

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        System.out.println("pattern 4");
        for (int row = 1; row <= 2 * n; row++) {
            int totalColInRows = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalColInRows; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        System.out.println("pattern 5 d");
        for (int row = 1; row <= 2 * n; row++) {
            int totalColInRows = row > n ? 2 * n - row : row;

            int noOfSpaces = n - totalColInRows;

            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColInRows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        System.out.println("pattern 6");
        for (int row = 1; row <= n; row++) {

            for (int space = 0; space < n - row; space++) {
                System.out.print(" ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        System.out.println("pattern7");
        int num = 1;
        for (int i = 0; i <= n; i++) {
            for (int space = 0; space < n - i; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        System.out.println("pattern 8");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern9(int n) {
        System.out.println("pattern 9");

        for (int row = 1; row <= n; row++) {
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern10(int n) {
        System.out.println("pattern 10");
        int m = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern11(int n) {
        System.out.println("pattern 11");
        for (int row = 1; row <= n; row++) {
            int totalColInRows = row > n ? 2 * n - row : row;

            int noOfSpaces = n - totalColInRows;

            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColInRows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern12(int n) {
        System.out.println("pattern 12");
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else
                    System.out.print(0 + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern1(4);
        pattern2(4);
        pattern3(4);
        pattern4(4);
        pattern5(5);
        pattern6(4);
        pattern7(4);
        pattern8(5);
        pattern9(5);
        pattern10(5);
        pattern11(5);
        pattern12(5);
    }
}
