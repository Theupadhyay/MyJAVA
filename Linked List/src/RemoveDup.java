import java.util.LinkedList;

public class RemoveDup {

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        // Add elements to the list
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);

        // Convert LinkedList to ListNode
        ListNode head = convertLinkedListToListNode(list);

        // Remove duplicates
        head = deleteDuplicates(head);

        // Print the modified list
        printLinkedList(head);
    }

    private static ListNode convertLinkedListToListNode(LinkedList<Integer> list) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (Integer value : list) {
            current.next = new ListNode(value);
            current = current.next;
        }
        return dummy.next;
    }

    private static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}
