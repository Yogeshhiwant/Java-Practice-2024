package LeetCode;

public class ReverseLinkedList {
    public static void main(String[] args) {

    }

    public static ListNode reverseList(ListNode head) {
//  Using traditional approach

/*      ListNode curr = head;
        ListNode prev = null;

        while (curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
        }
        return prev;
 */

//  Using recursion

        if (head == null || head.next == null) {
            return head;
        }
        ListNode a = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return a;
    }
}
