//Write a Java program to create and display a unique three-digit number using 1, 2, 3, 4.
// Also count how many three-digit numbers are there.

public class Uni3digit {
    public static void main(String[] args) {
        int count =0 ;
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4 ; k++) {
                    // check all are unique
                    if(i != j && j != k && k != i ){
                        count++;
                        System.out.println("The 3 digits numbers are : "+i+""+j+""+k);
                    }
                }
            }
        }
        System.out.println("total unique no. are : " + count);
    }
}
