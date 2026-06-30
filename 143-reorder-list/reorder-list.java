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
        if(head == null || head.next== null){
            return ;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev =null;
        ListNode cur= slow.next;
        slow.next=null;
        ListNode next;
        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        ListNode left=head;
        cur=prev;
        while(cur!=null){
            ListNode temp1=left.next;
            ListNode temp2=cur.next;
            left.next=cur;
            cur.next=temp1;
            left=temp1;
            cur=temp2;
        }
    }
}