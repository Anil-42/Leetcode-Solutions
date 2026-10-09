class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean leftToRight = true;

        while (!q.isEmpty()) {
            int n = q.size();
            LinkedList<Integer> levelList = new LinkedList<>();

            for (int i = 0; i < n; i++) {
                TreeNode v = q.poll();

                if (leftToRight) {
                    levelList.addLast(v.val); 
                } else {
                    levelList.addFirst(v.val);
                }

                if (v.left != null) q.offer(v.left);
                if (v.right != null) q.offer(v.right);
            }

            res.add(levelList);
            leftToRight = !leftToRight; 
        }

        return res;
    }
}
