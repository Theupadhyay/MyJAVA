
//48. Write a Java program to print odd numbers from 1 to 99. Prints one number per line.
public class Practice08 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}


// public class Exercise50 {
//    public static void main(String args[]) {
//        // Print numbers divided by 3
//        System.out.println("\nDivided by 3: ");
//        for (int i = 1; i < 100; i++) {
//            if (i % 3 == 0)
//                System.out.print(i + ", ");
//        }
//
//        // Print numbers divided by 5
//        System.out.println("\n\nDivided by 5: ");
//        for (int i = 1; i < 100; i++) {
//            if (i % 5 == 0)
//                System.out.print(i + ", ");
//        }
//
//        // Print numbers divided by both 3 and 5
//        System.out.println("\n\nDivided by 3 & 5: ");
//        for (int i = 1; i < 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0)
//                System.out.print(i + ", ");
//        }
//        System.out.println("\n");
//    }
//}
