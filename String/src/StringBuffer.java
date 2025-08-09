import java.lang.*;

public class StringBuffer {
    public static void main(String[] args) {
        StringBuilder strr = new StringBuilder("abhishek");
        System.out.println("Initial capacity: " + strr.reverse());
        strr.append("is");
        strr.append("good");
        strr.append("boy");
        strr.replace(8, 9, " ");
        strr.delete(9, 10);
        System.out.println(strr.charAt(0));
        System.out.println(strr.capacity()+"\t"+strr.insert(8," "));
    }
}
