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
    public ListNode deleteDuplicates(ListNode head) {
        // start statement (pointer)
        ListNode current = head;
        // traverse the list using this pointer
        while (current != null && current.next != null) {
            // bir sonraki düğüm değeriyle aynı ise
            if (current.val == current.next.val) {
                // bir sonraki düğümü atla
                current.next = current.next.next;
            } else {
                // current göstericisini bir sonraki düğüme taşı
                current = current.next;
            }
        }
        // return the modified list
        return head;
    }
}