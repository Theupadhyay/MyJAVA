class Node{
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
    }
}
class LinkedListt{
    public  Node head;
    public Node tail;
    public int size =0;

    public void display(){
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp =temp.next;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            size++;
        }else {
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }
}

public  class DouCirLL {

    public static void main(String[] args) {
        LinkedListt ll = new LinkedListt();
        ll.add(2);
        ll.add(7);
        ll.add(9);
        ll.add(6);
        ll.display();
    }
}
