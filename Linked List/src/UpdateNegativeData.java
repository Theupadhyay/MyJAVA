//import java.util.LinkedList;
//class Node {
//    int data;
//    Node next;
//
//    public Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//public class UpdateNegativeData {
//    public static void main(String[] args) {
//        Node head = new Node(1);
//        head.next = new Node(2);
//        head.next.next = new Node(-3);
//        head.next.next.next = new Node(4);
//        head.next.next.next.next = new Node(-5);
//
//        updateNegativeData(head);
//
//        Node current = head;
//        while (current != null) {
//            System.out.println(current.data);
//            current = current.next;
//        }
//    }
//
//    public static void updateNegativeData(Node head) {
//        Node current = head;
//        while (current != null) {
//            if (current.data < 0) {
//                current.data = 0;
//            }
//            current = current.next;
//        }
//    }
//}