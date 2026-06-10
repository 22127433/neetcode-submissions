/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode reverse = null;
        while (head != null && head.next != null) {
            int val = head.val;
            head = head.next;
            reverse = new ListNode(val, reverse);
        }
        if (head != null) reverse = new ListNode(head.val, reverse);
        return reverse;
    }
}
