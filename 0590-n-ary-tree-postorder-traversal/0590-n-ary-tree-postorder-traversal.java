/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    List<Integer> li = new ArrayList<>();
    void post(Node root){
        if(root==null)return;
        for(Node c : root.children){
            post(c);
        }
        li.add(root.val);
    }
    public List<Integer> postorder(Node root) {
        post(root);
        return li;
    }
}
   