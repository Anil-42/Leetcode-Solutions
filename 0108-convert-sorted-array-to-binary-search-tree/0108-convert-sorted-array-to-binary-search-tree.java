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
    TreeNode build(int[] nums,int l,int h){
        int m=l+((h-l)>>1);
        if(l>h)return null;
        TreeNode root = new TreeNode(nums[m]);
        root.left=build(nums,l,m-1);
        root.right=build(nums,m+1,h);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        int l=0,h=nums.length-1;
        return build(nums,l,h);
    }
}