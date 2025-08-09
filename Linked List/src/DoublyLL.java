public class DoublyLL {
    Node head;
    class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public void traversal() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    
    public void backTraversal() {
        if (head == null) return;
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.prev;
        }
        System.out.println();
    }
    public void addLast(int data) {
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

    // Add A node in n - 1 place
    public void addAtN(int data, int n) {
        Node newNode = new Node(data);
        if (head == null && n == 0) {
            head = newNode;
            return;
        }
        if (n == 0) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            return;
        }
        Node slow = head;
        for (int i = 1; i < n && slow.next != null; i++) {
            slow = slow.next;
        }
        if (slow.next == null && n > 0) {
            System.out.println("Invalid position");
            return;
        }
        newNode.next = slow.next;
        if (slow.next != null) {
            slow.next.prev = newNode;
        }
        slow.next = newNode;
        newNode.prev = slow;
    }

    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addLast(10);
        dll.addLast(20);
        dll.addLast(30);
        dll.traversal();
        dll.backTraversal();
        dll.addAtN(15, 1);
        dll.traversal();
    }
}
