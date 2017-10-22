/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

// Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
// Output: 7 -> 0 -> 8

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = new ListNode(0);
        ListNode result = p;
        int overflow = 0;
        int a = 0;
        int b = 0;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                a = l1.val;
                l1 = l1.next;
            } else {
                a = 0;
            }
            if (l2 != null) {
                b = l2.val;
                l2 = l2.next;

            } else {
                b = 0;
            }
            int sum = (a + b + overflow);
            result.next = new ListNode(sum % 10);
            overflow = (sum) / 10;
            result = result.next;

        }
        if (overflow > 0) {
            result.next = new ListNode(overflow);

        }
        return p.next;
    }
}