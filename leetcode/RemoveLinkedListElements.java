//  203. Remove Linked List Elements

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode hold = new ListNode(-1);
        hold.next = head;

        ListNode prev = hold;
        ListNode temp = head;
        while (temp != null) {
            if (temp.val == val) {
                prev.next = temp.next;
            } else {
                prev = temp;
            }
            temp = temp.next;
        }
        return hold.next;
    }
}