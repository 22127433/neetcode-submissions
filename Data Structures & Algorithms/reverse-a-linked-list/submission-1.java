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

        while (head != null) {
            ListNode next = head.next; // giữ node tiếp theo

            head.next = reverse;       // đảo chiều con trỏ
            reverse = head;            // reverse trỏ tới head mới
            head = next;               // đi tiếp
        }

        return reverse;
    }
}
