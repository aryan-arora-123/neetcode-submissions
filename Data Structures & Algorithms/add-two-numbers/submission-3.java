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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1, temp2 = l2;
        ListNode head = new ListNode();
        ListNode temp3 = head;
        int carry = 0;
        while (temp1 != null || temp2 != null || carry != 0) {
            int x = 0, y = 0;
            if (temp1 != null) {
                x = temp1.val;
            }
            if (temp2 != null) {
                y = temp2.val;
            }
            temp3.val = (x + y + carry) % 10;
            if (x + y + carry > 9) {
                carry = (x + y + carry) / 10;
            } else {
                carry = 0;
            }

            if (temp1 != null)
                temp1 = temp1.next;
            if (temp2 != null)
                temp2 = temp2.next;
            if (temp1 != null || temp2 != null || carry != 0) {
                temp3.next = new ListNode();
                temp3 = temp3.next;
            }
        }
        return head;
    }
}
