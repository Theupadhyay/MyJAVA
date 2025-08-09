import java.util.LinkedList;
public class Practice01 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addLast("Upadhyay");
        list.addFirst("I");
        list.addFirst("am");
        list.addFirst("Abhishek");
        list.size();
        System.out.println(list+ " : "+ list.size());
    }
}
