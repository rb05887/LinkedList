package remove;

public class RemoveDuplicate {
	

	public class RemoveDuplicatesFromSortedList {

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

	    public static void printList(ListNode head) {
	        while (head != null) {
	            System.out.print(head.val + " ");
	            head = head.next;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        ListNode head1 = new ListNode(1);
	        head1.next = new ListNode(1);
	        head1.next.next = new ListNode(2);

	        System.out.print("Input: ");
	        printList(head1);
	        ListNode result1 = deleteDuplicates(head1);
	        System.out.print("Output: ");
	        printList(result1);
	        System.out.println();

	        ListNode head2 = new ListNode(1);
	        head2.next = new ListNode(1);
	        head2.next.next = new ListNode(2);
	        head2.next.next.next = new ListNode(3);
	        head2.next.next.next.next = new ListNode(3);

	        System.out.print("Input: ");
	        printList(head2);
	        ListNode result2 = deleteDuplicates(head2);
	        System.out.print("Output: ");
	        printList(result2);
	    }
	}

}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
