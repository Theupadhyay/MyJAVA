 class ListNodee {
      int val;
      ListNodee next;
      ListNodee() {}
      ListNodee(int val) { this.val = val; }
     ListNodee(int val, ListNodee next) { this.val = val; this.next = next; }
  }
public class SwapInPair {
    public ListNodee swapPairs(ListNodee head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Dummy node to simplify handling of head swaps
        ListNodee dummy = new ListNodee(0);
        dummy.next = head;
        ListNodee prev = dummy;

        while (head != null && head.next != null) {
            ListNodee first = head;
            ListNodee second = head.next;

            first.next = second.next;
            second.next = first;
            prev.next = second;

            prev = first;
            head = first.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {

    }
}
