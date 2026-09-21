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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
            return null;
        }
        PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b) -> Integer.compare(a.val,b.val));
        for(int i=0;i<lists.length;i++){
            ListNode temp=lists[i];
            while(temp!=null){
                pq.offer(temp);
                temp=temp.next;
            }
        }

        ListNode ans=pq.poll();
        ListNode temp=ans;
        if(pq.isEmpty()){
            return null;
        }
        while(!pq.isEmpty()){
            temp.next=pq.poll();
            temp=temp.next;
        }
        temp.next=null;
        return ans;
    }
}
