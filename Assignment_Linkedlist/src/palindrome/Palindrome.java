package palindrome;

public class Palindrome {
	
	    public static boolean isPalindrome(ListNode head) {
	        if (head == null || head.next == null) {
	            return true;
	        }

	        ListNode slow = head;
	        ListNode fast = head;
	        while (fast.next != null && fast.next.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	        }

	        ListNode secondHalf = reverseList(slow.next);

	        ListNode firstHalf = head;
	        while (secondHalf != null) {
	            if (firstHalf.val != secondHalf.val) {
	                return false;
	            }
	            firstHalf = firstHalf.next;
	            secondHalf = secondHalf.next;
	        }

	        return true;
	    }

	    private static ListNode reverseList(ListNode head) {
	        ListNode prev = null;
	        ListNode current = head;
	        while (current != null) {
	            ListNode nextNode = current.next;
	            current.next = prev;
	            prev = current;
	            current = nextNode;
	        }
	        return prev;
	    }

	    public static void main(String[] args) {
	       
	        ListNode head1 = new ListNode(1);
	        head1.next = new ListNode(2);
	        head1.next.next = new ListNode(2);
	        head1.next.next.next = new ListNode(1);

	        System.out.println(isPalindrome(head1)); 

	    
	        ListNode head2 = new ListNode(1);
	        head2.next = new ListNode(2);

	        System.out.println(isPalindrome(head2)); 
	    }
	}
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
