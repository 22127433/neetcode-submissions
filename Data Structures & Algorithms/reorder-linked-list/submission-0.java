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
    public void reorderList(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode tmp = head;
        while (tmp != null){
            arr.add(tmp.val);
            tmp = tmp.next;
        }
        tmp = head;
        int i = 0, n = arr.size();
        while (tmp != null){
            tmp.val = arr.get(i);      
            tmp = tmp.next;
            if (tmp != null){
                tmp.val = arr.get(n - 1 - i);
                tmp = tmp.next;
            }
            i++;
        }
    }
}
