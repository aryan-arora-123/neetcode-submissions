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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        PriorityQueue<ListNode> q = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));
        ListNode temp = list1;
        while (temp != null) {
            q.offer(temp);
            temp = temp.next;
        }
        temp = list2;
        while (temp != null) {
            q.offer(temp);
            temp = temp.next;
        }
        if(q.isEmpty()){
            return null;
        }
        ListNode ans=q.poll();
        temp=ans;
        while(!q.isEmpty()){
            temp.next=q.poll();
            temp=temp.next;
        }
        temp.next=null;
        return ans;
    }
}