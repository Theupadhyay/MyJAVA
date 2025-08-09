//56. Write a Java program to find the number of values in a given range
// divisible by a given value.
//        For example x = 5, y=20 and p =3, find the number of integers within the range x..y
//        and that are divisible by p i.e. { i :x ≤ i ≤ y, i mod p = 0 }
//        Sample Output:
//
//        5

public class Practice14 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 5; i < 20; i++) {
            if(i % 3 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
