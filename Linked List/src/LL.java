public class LL {
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display() {
        Node current  = head;
        if(head == null){
            System.out.println("Linked list is Empty");
            return;
        }
        System.out.println("Nodes of singly Linked List");

        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;

        }
        System.out.println();
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addNode(23);
        list.addNode(523);
        list.addNode(3);
        list.addNode(2);
        list.display();
    }
}
