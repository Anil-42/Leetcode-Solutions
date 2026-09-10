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
    int count=0;
    int[] sub(TreeNode root){
        if(root==null){
            return new int[]{0,0};
         }
         int[] l = sub(root.left);
         int[] r = sub(root.right);
         
         int nodeCount = 1 + r[0] + l[0];
         int nodeSum = root.val + r[1] + l[1];
         if(root.val==nodeSum/nodeCount){
            count++;
         }
         return new int[]{nodeCount,nodeSum};
    }
    public int averageOfSubtree(TreeNode root) {
        count=0;
        sub(root);
        return count;
    }
}