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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode prev = dummy;
        ListNode l = head;
        ListNode curr=head;
        ListNode rh = null;
        int i=1;
        while(curr!=null){
            ListNode t = curr;
            curr=curr.next;
            t.next=rh;
            rh=t;

            if(i%k==0){
                prev.next=rh;
                l.next=curr;
                rh=null;
                prev=l;
                l=curr;

            }
            i++;
        }
        ListNode rrh=null;
        while(rh!=null){
            ListNode t = rh;
            rh=rh.next;
            t.next=rrh;
            rrh=t;
        }
        prev.next=rrh;
        return dummy.next;
    }
}