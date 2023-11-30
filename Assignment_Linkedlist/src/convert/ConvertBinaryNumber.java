package convert;


public class ConvertBinaryNumber {
	
	    public static int getDecimalValue(ListNode head) {
	        int result = 0;

	        while (head != null) {
	            result = result << 1;
	            result = result | head.val;
	            head = head.next;
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	       
	        ListNode head1 = new ListNode(1);
	        head1.next = new ListNode(0);
	        head1.next.next = new ListNode(1);

	        System.out.println("Input: ");
	        printList(head1);
	        System.out.println("Output: " + getDecimalValue(head1));
	        System.out.println();

	        
	        ListNode head2 = new ListNode(0);

	        System.out.println("Input: ");
	        printList(head2);
	        System.out.println("Output: " + getDecimalValue(head2));
	    }

	    public static void printList(ListNode head) {
	        while (head != null) {
	            System.out.print(head.val + " ");
	            head = head.next;
	        }
	        System.out.println();
	    }
	}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

