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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode d = new ListNode(0);
        ListNode rh = d;
        ListNode curr=null;
        ListNode nextn=null;
        while(head!=null && head.next!=null){
            curr=head;
            nextn=curr.next;
            head=nextn.next;
            rh.next=nextn;
            rh=rh.next;
            rh.next=curr;
            rh=rh.next;
        }if(head!=null && head.next==null){
            rh.next=head;
            rh=rh.next;
        }
        rh.next=null;
        return d.next;
    }
}