package rotate;

public class Rotate {
	
    public ListNode rotateRight(ListNode head, int k) {
        
        if (head == null || k == 0) {
            return head;
        }

       
        int length = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        k = k % length;

        if (k == 0) {
            return head;
        }

        int newHeadIndex = length - k - 1;

        ListNode newHead = head;
        for (int i = 0; i < newHeadIndex; i++) {
            newHead = newHead.next;
        }

        ListNode rotatedHead = newHead.next;
        newHead.next = null;
        tail.next = head;

        return rotatedHead;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Rotate solution = new Rotate();
        ListNode rotatedHead = solution.rotateRight(head, 2);

        while (rotatedHead != null) {
            System.out.print(rotatedHead.val + " ");
            rotatedHead = rotatedHead.next;
        }
    }
}
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

