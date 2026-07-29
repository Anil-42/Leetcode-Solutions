/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head==null)return head;
        Stack<Node> st = new Stack<>();
        Node temp = head;
        while(temp!=null){
            if(temp.child!=null){
                if(temp.next!=null){
                    st.push(temp.next);
                    temp.next.prev=null;
                }
                temp.next=temp.child;
                temp.child.prev=temp;
                temp.child=null;
            }

            if(temp.next==null && !st.isEmpty()){
                Node h = st.pop();
                temp.next=h;
                h.prev = temp;
            }

            temp=temp.next;
        }
        return head;
    }
}