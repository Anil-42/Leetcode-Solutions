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
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode ldummy = new ListNode(0);
        ListNode rdummy = new ListNode(0);
        ListNode lh=ldummy;
        ListNode rh=rdummy;
        while(head!=null){
            if(head.val<x){
                ListNode t = head;
                head=head.next;
                lh.next=t;
                lh=lh.next;
            }
            else{
                ListNode t = head;
                head=head.next;
                rh.next=t;
                rh=rh.next;
            }
        }
        rh.next=null;
        lh.next=rdummy.next;
        return ldummy.next;
    }
}