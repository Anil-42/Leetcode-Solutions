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
        ListNode prev=head, curr=prev.next, nextn=curr.next;
        int[] res = {-1,-1};
        int start=0, last=0, end=0,minval=Integer.MAX_VALUE;
        int cnt=2;
        while(nextn!=null){
            if((curr.val>prev.val&&curr.val>nextn.val)||(curr.val<prev.val&&curr.val<nextn.val)){
                if(start==0){
                    start=cnt;last=cnt;
                }
                else{
                    minval=Math.min(minval,cnt-last);
                    last=cnt;
                }
            }
            cnt++;
            prev=curr;
            curr=nextn;
            nextn=nextn.next;
        }
        if(minval!=Integer.MAX_VALUE){
            res[0]=minval;
            res[1]=last-start;
        }
        return res;
    }
}