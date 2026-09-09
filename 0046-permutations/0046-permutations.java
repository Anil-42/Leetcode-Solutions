class Solution {
    List<List<Integer>> res = new ArrayList<>();

    void solve(List<Integer> curr, int[] nums){
        if(curr.size()==nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(!curr.contains(nums[i])){
                curr.add(nums[i]);
                solve(curr,nums);

                curr.remove(curr.size()-1);
            }

        }

    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> curr = new ArrayList<>();
        solve(curr,nums);
        return res;
    }
}