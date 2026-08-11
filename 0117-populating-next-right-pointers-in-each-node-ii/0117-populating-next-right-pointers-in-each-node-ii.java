/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null)return null;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int n=q.size();
            Node t = q.poll();
            for(int i=1;i<n;i++){
                if(t.left!=null)q.offer(t.left);
                if(t.right!=null)q.offer(t.right);
                Node nxt = q.poll();
                t.next=nxt;
                t=t.next;
            }
            if(t.left!=null)q.offer(t.left);
            if(t.right!=null)q.offer(t.right);
            t.next=null;
        }
        return root;
    }
}