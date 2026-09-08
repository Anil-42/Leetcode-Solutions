class Solution {
    void subsequence(int index, int[] nums,List<Integer> curr,List<List<Integer>> res){
        if(index==nums.length){
            res.add(new ArrayList<>(curr));
            return ;
        }
        
        curr.add(nums[index]);
        subsequence(index+1,nums,curr,res);

        curr.remove(curr.size()-1);
        subsequence(index+1,nums, curr, res);
    }

    public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> curr = new ArrayList<>();
    subsequence(0,nums,curr,res);

    return res;
    }
}