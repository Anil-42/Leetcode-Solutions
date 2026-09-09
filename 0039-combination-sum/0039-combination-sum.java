class Solution {
    List<List<Integer>> res = new ArrayList<>();
    void combinations(int[] arr, int target, int sum, List<Integer>comb,int i){
        if(sum==target){
            res.add(new ArrayList<>(comb));
            return;
        }
        if(sum>target || i==arr.length){
            return;
        }
        comb.add(arr[i]);
        combinations(arr,target,sum+arr[i],comb,i);

        comb.remove(comb.size()-1);
        combinations(arr, target, sum, comb,i+1);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> comb = new ArrayList<>();
        int sum=0;
        combinations(candidates,target,sum,comb,0);
        return res;
    }
}