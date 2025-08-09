import org.w3c.dom.Node;

class LinkedList {
    Node head;
    private int size;
    LinkedList() {
        size = 0;
    }
    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    public void printList() {
        Node currNode = head;
        System.out.print("List: ");
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        head = this.head.next;
        size--;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("This list is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node currNode = head;
        Node prevNode = null;
        while (currNode.next != null) {
            prevNode = currNode;
            currNode = currNode.next;
        }
        prevNode.next = null;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("am");
        list.addFirst("I");
        list.addLast("Abhishek");
        list.addLast("Upadhyay");
        list.printList();
        System.out.println("Size: " + list.getSize());
    }
}
