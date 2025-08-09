public class RemoveLinkedList {

    public ListNodee removeElements(ListNodee head, int val) {
        // Check if head is null or head's value equals val
        while (head != null && head.val == val) {
            head = head.next;
        }

        // Return null if head is null after previous removals
        if (head == null) {
            return null;
        }

        // Iterate through the list and remove nodes with value val
        ListNodee current = head;
        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        // Create a linked list
        ListNodee node1 = new ListNodee(1);
        ListNodee node2 = new ListNodee(2);
        ListNodee node3 = new ListNodee(6);
        ListNodee node4 = new ListNodee(3);
        ListNodee node5 = new ListNodee(4);
        ListNodee node6 = new ListNodee(5);
        ListNodee node7 = new ListNodee(6);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        // Create an instance of RemoveLinkedList
        RemoveLinkedList remover = new RemoveLinkedList();

        // Call the removeElements method and print the result
        ListNodee result = remover.removeElements(node1, 6);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}

class ListNode {
    int val;
    ListNodee next;

    ListNode(int x) {
        val = x;
    }
}

