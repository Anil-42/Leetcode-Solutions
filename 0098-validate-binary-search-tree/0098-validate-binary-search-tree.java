/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode prev=null;boolean flag=true;
    void inorder(TreeNode root){
        if(root==null){return;}
        if(!flag){return;}
        inorder(root.left);
        if(prev!=null && prev.val>=root.val){
            flag = false;
            return;
            }
        prev=root;
        inorder(root.right);
    }
    public boolean isValidBST(TreeNode root) {
        inorder(root);
        return flag;
    }
}