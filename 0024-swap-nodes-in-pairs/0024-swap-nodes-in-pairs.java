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
        ListNode d = new ListNode(0);
        d.next=head;
        ListNode prev=d;
        while(prev.next!=null && prev.next.next!=null){
            ListNode curr = prev.next;
            ListNode nextn = curr.next;

            curr.next=nextn.next;
            nextn.next=curr;
            prev.next=nextn;

            prev=curr;
        }
        return d.next;
    }
}