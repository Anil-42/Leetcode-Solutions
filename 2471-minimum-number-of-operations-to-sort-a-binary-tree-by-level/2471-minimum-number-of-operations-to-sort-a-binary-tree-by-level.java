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
    int order(TreeNode root) {
        if (root == null)
            return 0;
        int tc = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int n = q.size();
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TreeNode t = q.poll();
                arr.add(t.val);
                if (t.left != null) {
                    q.offer(t.left);
                }
                if (t.right != null) {
                    q.offer(t.right);
                }
            }
            tc += noSwap(arr);
        }
        return tc;
    }

    int noSwap(List<Integer> arr) {
        int n = arr.size();
        if(n<=1)return 0;

        List<Integer> sortarr = new ArrayList<>(arr);
        Collections.sort(arr);
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(arr.get(i),i);
        }

        int swap=0;
        for(int i=0;i<n;i++){
            int correctval = sortarr.get(i);

            if(arr.get(i)!=correctval){
                swap++;
                int currind = mp.get(correctval);

                mp.put(arr.get(i),currind);
                mp.put(correctval,i);
                Collections.swap(arr,currind,i);
            }
        }
        return swap;

    }

    public int minimumOperations(TreeNode root) {
        return order(root);
    }
}