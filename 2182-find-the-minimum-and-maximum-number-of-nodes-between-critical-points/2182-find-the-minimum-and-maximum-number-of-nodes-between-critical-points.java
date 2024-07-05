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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return new int[]{-1, -1};
        }

        int firstCP = -1;
        int lastCP = -1;
        int minDistance = Integer.MAX_VALUE;
        int index = 1; // Start from the second node
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode next = curr.next;

        while (next != null) {
            if ((curr.val > prev.val && curr.val > next.val) || (curr.val < prev.val && curr.val < next.val)) {
                if (firstCP == -1) {
                    firstCP = index;
                } else {
                    minDistance = Math.min(minDistance, index - lastCP);
                }
                lastCP = index;
            }

            prev = curr;
            curr = next;
            next = next.next;
            index++;
        }

        if (firstCP == lastCP) {
            return new int[]{-1, -1};
        }

        int maxDistance = lastCP - firstCP;

        return new int[]{minDistance, maxDistance};
    }
}